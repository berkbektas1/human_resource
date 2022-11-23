package com.berkbektas.humanresource.service;

import com.berkbektas.humanresource.dto.response.EmployeeResponseDto;
import com.berkbektas.humanresource.dto.request.EmployeeRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EmployeeResponseDto createEmployee(EmployeeRequestDto createEmployeeRequest);
}
