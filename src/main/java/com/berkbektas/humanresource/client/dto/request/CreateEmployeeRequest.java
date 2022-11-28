package com.berkbektas.humanresource.client.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
public class CreateEmployeeRequest {
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

    private String addressLine;
    private String city;
    private String country;
    private String postCode;
    private String phoneNumber;

}
