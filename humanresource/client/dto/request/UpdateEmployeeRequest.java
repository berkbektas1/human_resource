package com.berkbektas.humanresource.client.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateEmployeeRequest {
    private String firstName;
    private String lastName;

    private String email;

    private String identityNumber;
    private Double salary;
    private String title;
    private String role;
    private String level;
    private String department;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfStart;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
}
