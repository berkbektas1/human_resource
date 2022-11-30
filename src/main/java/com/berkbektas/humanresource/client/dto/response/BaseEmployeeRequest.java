package com.berkbektas.humanresource.client.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;


@Getter
@Setter
@SuperBuilder
@ToString
public class BaseEmployeeRequest{
    private String firstName;
    private String lastName;

    private String email;

    private String identityNumber;
    private Double salary;
    private String title;
    private String role;
    private String level;
    private String department;

    private LocalDate dateOfStart;

    private LocalDate dateOfBirth;
    //Address bilgileri extend edildi.
}
