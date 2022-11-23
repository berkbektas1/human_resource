package com.berkbektas.humanresource.mapper;

import com.berkbektas.humanresource.dto.request.EmployeeRequestDto;
import com.berkbektas.humanresource.model.Address;
import com.berkbektas.humanresource.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public Employee dtoToEntity(EmployeeRequestDto createEmployeeRequest){
        Employee employee = new Employee();
        Address address = new Address();
        employee.setFirstName(createEmployeeRequest.getFirstName());
        employee.setLastName(createEmployeeRequest.getLastName());
        employee.setEmail(createEmployeeRequest.getEmail());
        employee.setIdentityNumber(createEmployeeRequest.getIdentityNumber());
        employee.setSalary(createEmployeeRequest.getSalary());
        employee.setTitle(createEmployeeRequest.getTitle());
        employee.setRole(createEmployeeRequest.getRole());
        employee.setLevel(createEmployeeRequest.getLevel());
        employee.setDepartment(createEmployeeRequest.getDepartment());
        employee.setDateOfBirth(createEmployeeRequest.getDateOfBirth());
        employee.setDateOfStart(createEmployeeRequest.getDateOfStart());

        address.setAddress(createEmployeeRequest.getAddress());
        address.setCity(createEmployeeRequest.getCity());
        address.setCountry(createEmployeeRequest.getCountry());
        address.setPostCode(createEmployeeRequest.getPostCode());
        address.setPhoneNumber(createEmployeeRequest.getPhoneNumber());

        employee.setAddress(address);
        address.setEmployee(employee);

        return employee;
    }
}
