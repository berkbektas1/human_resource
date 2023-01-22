package com.berkbektas.humanresource.service;

import com.berkbektas.humanresource.client.dto.response.EmployeeDto;
import com.berkbektas.humanresource.client.dto.request.CreateEmployeeRequest;
import com.berkbektas.humanresource.client.dto.request.UpdateEmployeeRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    EmployeeDto createEmployee(CreateEmployeeRequest createEmployeeRequest);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto getEmployeeById(Integer id);

    EmployeeDto updateEmployeeById(Integer id, UpdateEmployeeRequest updateEmployeeRequest);

    Boolean deleteEmployee(Integer id);

}
