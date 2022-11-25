package com.berkbektas.humanresource.controller;

import com.berkbektas.humanresource.dto.response.EmployeeResponseDto;
import com.berkbektas.humanresource.dto.request.EmployeeRequestDto;
import com.berkbektas.humanresource.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDto>> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteEmployee(@PathVariable Integer id){
        Boolean status = employeeService.deleteEmployee(id);
        return ResponseEntity.ok(status);

    }


}
