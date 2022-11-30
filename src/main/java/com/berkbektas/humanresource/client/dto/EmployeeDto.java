package com.berkbektas.humanresource.client.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;


@Data
@Builder
public class EmployeeDto {
    private String firstName;
    private String lastName;
    private String email;
    private String identityNumber;
    private Double salary;
    private String title;
    private String role;
    private String level;
    private String department;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateOfStart;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateOfBirth;
}
