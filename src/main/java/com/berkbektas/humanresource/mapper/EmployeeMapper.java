package com.berkbektas.humanresource.mapper;


import com.berkbektas.humanresource.client.dto.response.EmployeeDto;
import com.berkbektas.humanresource.client.dto.request.CreateEmployeeRequest;
import com.berkbektas.humanresource.model.Employee;
import org.mapstruct.Mapper;

@Mapper(implementationName = "EmployeeMapperImpl", componentModel = "spring")
public interface EmployeeMapper {

    Employee toEmployee(EmployeeDto employeeDto);

    EmployeeDto toEmployeeDto(Employee employee);

    Employee toEmployeeFromCreateEmployeeRequest(CreateEmployeeRequest employeeRequest);


}
