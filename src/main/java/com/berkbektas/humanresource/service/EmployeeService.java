package com.berkbektas.humanresource.service;

import com.berkbektas.humanresource.client.dto.EmployeeDto;
import com.berkbektas.humanresource.client.dto.request.CreateEmployeeRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    EmployeeDto createEmployee(CreateEmployeeRequest createEmployeeRequest);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto getEmployeeById(Integer id);

    Boolean deleteEmployee(Integer id);

}
