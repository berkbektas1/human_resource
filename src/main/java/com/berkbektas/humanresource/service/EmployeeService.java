package com.berkbektas.humanresource.service;

import com.berkbektas.humanresource.dto.response.EmployeeResponseDto;
import com.berkbektas.humanresource.dto.request.EmployeeRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    EmployeeResponseDto createEmployee(EmployeeRequestDto createEmployeeRequest);

    List<EmployeeResponseDto> getAllEmployee();

    Boolean deleteEmployee(Integer id);

}
