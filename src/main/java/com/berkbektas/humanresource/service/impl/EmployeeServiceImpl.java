package com.berkbektas.humanresource.service.impl;

import com.berkbektas.humanresource.dto.response.EmployeeResponseDto;
import com.berkbektas.humanresource.dto.request.EmployeeRequestDto;
import com.berkbektas.humanresource.mapper.EmployeeMapper;
import com.berkbektas.humanresource.repository.EmployeeRepository;
import com.berkbektas.humanresource.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;


    @Override
    public EmployeeResponseDto createEmployee(EmployeeRequestDto createEmployeeRequest) {
        employeeRepository.save(employeeMapper.dtoToEntity(createEmployeeRequest));
        return null;
    }
}
