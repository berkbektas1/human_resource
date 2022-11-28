package com.berkbektas.humanresource.controller;

import com.berkbektas.humanresource.client.dto.EmployeeDto;
import com.berkbektas.humanresource.client.dto.response.BaseEmployeeRequest;
import com.berkbektas.humanresource.client.dto.request.CreateEmployeeRequest;
import com.berkbektas.humanresource.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody CreateEmployeeRequest createEmployeeRequest){
        return ResponseEntity.ok(employeeService.createEmployee(createEmployeeRequest));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @GetMapping("/id")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Integer id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteEmployee(@PathVariable Integer id){
        Boolean status = employeeService.deleteEmployee(id);
        return ResponseEntity.ok(status);

    }


}
