package com.berkbektas.humanresource.service.impl;

import com.berkbektas.humanresource.client.dto.EmployeeDto;
import com.berkbektas.humanresource.client.dto.request.CreateEmployeeRequest;
import com.berkbektas.humanresource.exception.CustomerNotFoundException;
import com.berkbektas.humanresource.mapper.AddressMapper;
import com.berkbektas.humanresource.mapper.EmployeeMapper;
import com.berkbektas.humanresource.model.Address;
import com.berkbektas.humanresource.model.Employee;
import com.berkbektas.humanresource.repository.EmployeeRepository;
import com.berkbektas.humanresource.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    private final AddressMapper addressMapper;


    @Override
    public EmployeeDto createEmployee(CreateEmployeeRequest createEmployeeRequest) {
        Employee employee = employeeMapper.toEmployeeFromCreateEmployeeRequest(createEmployeeRequest);
        Address address = addressMapper.toAddressFromCreateAddressRequest(createEmployeeRequest);
        address.setEmployee(employee);
        employee.setAddress(address);
        return employeeMapper.toEmployeeDto(employeeRepository.save(employee));
    }

    @Override
    public List<EmployeeDto> getAllEmployee() {
        var employeeList = employeeRepository.findAll();
        return employeeList.stream()
                .map(employeeMapper::toEmployeeDto)
                .toList();
    }

    @Override
    public EmployeeDto getEmployeeById(Integer id) {
        var employeeOptional = employeeRepository.findById(id);

        return employeeOptional.map(employeeMapper::toEmployeeDto)
                .orElseThrow(() ->new CustomerNotFoundException("Customer not exist"));

    }


    @Override
    public Boolean deleteEmployee(Integer id) {
        var employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()){
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
