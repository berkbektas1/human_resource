package com.berkbektas.humanresource.controller;

import com.berkbektas.humanresource.dto.response.EmployeeResponseDto;
import com.berkbektas.humanresource.dto.request.EmployeeRequestDto;
import com.berkbektas.humanresource.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<EmployeeResponseDto> createEmployee(@RequestBody EmployeeRequestDto createEmployeeRequest){
        return ResponseEntity.ok(employeeService.createEmployee(createEmployeeRequest));

    }
}
