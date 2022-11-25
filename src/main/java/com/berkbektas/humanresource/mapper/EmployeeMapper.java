package com.berkbektas.humanresource.mapper;

import com.berkbektas.humanresource.dto.request.EmployeeRequestDto;
import com.berkbektas.humanresource.dto.response.EmployeeResponseDto;
import com.berkbektas.humanresource.model.Address;
import com.berkbektas.humanresource.model.Employee;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
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

    public EmployeeResponseDto entityToDto(Employee employee){
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();

        employeeResponseDto.setFirstName(employee.getFirstName());
        employeeResponseDto.setLastName(employee.getLastName());
        employeeResponseDto.setEmail(employee.getEmail());
        employeeResponseDto.setIdentityNumber(employee.getIdentityNumber());
        employeeResponseDto.setSalary(employee.getSalary());
        employeeResponseDto.setTitle(employee.getTitle());
        employeeResponseDto.setRole(employee.getRole());
        employeeResponseDto.setLevel(employee.getLevel());
        employeeResponseDto.setDepartment(employee.getDepartment());
        employeeResponseDto.setDateOfBirth(employee.getDateOfBirth());
        employeeResponseDto.setDateOfStart(employee.getDateOfStart());

        employeeResponseDto.setAddress(employee.getAddress().getAddress());
        employeeResponseDto.setCity(employee.getAddress().getCity());
        employeeResponseDto.setCountry(employee.getAddress().getCountry());
        employeeResponseDto.setPostCode(employee.getAddress().getPostCode());
        employeeResponseDto.setPhoneNumber(employee.getAddress().getPhoneNumber());

        return employeeResponseDto;
    }
}
