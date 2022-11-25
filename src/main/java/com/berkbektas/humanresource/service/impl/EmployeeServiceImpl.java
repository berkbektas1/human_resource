package com.berkbektas.humanresource.service.impl;

import com.berkbektas.humanresource.dto.response.EmployeeResponseDto;
import com.berkbektas.humanresource.dto.request.EmployeeRequestDto;
import com.berkbektas.humanresource.mapper.EmployeeMapper;
import com.berkbektas.humanresource.model.Employee;
import com.berkbektas.humanresource.repository.EmployeeRepository;
import com.berkbektas.humanresource.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;


    @Override
    public EmployeeResponseDto createEmployee(EmployeeRequestDto createEmployeeRequest) {
        var employee = employeeRepository.save(employeeMapper.dtoToEntity(createEmployeeRequest));
        return employeeMapper.entityToDto(employee);
    }

    @Override
    public List<EmployeeResponseDto> getAllEmployee() {
        var employeeList = employeeRepository.findAll();
        return employeeList.stream()
                .map(employeeMapper::entityToDto).collect(Collectors.toList());
    }



    @Override
    public Boolean deleteEmployee(Integer id) {
        var employee = employeeRepository.findById(id);
        if (employee.isPresent()){
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
