package com.berkbektas.humanresource.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class EmployeeDto {
    private String firstName;
    private String lastName;

    private String email;

    private String identityNumber;
    private BigDecimal salary;
    private String title;
    private String role;
    private String level;
    private String department;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dateOfStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
}
