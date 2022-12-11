package com.berkbektas.humanresource.client.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeRequest {
    @NotBlank(message = "First Name cannot empty")
    private String firstName;
    @NotBlank(message = "Last Name cannot empty")
    private String lastName;
    @Email(regexp = "^(.+)@(.+)$", message = "Email is not valid. Please follow the example: mail@mail.com")
    @NotBlank(message = "Email must not be null")
    private String email;
    @NotNull(message = "Identity Number cannot empty")
    private String identityNumber;
    @NotNull(message = "Salary cannot empty")
    private Double salary;
    @NotBlank(message = "Title cannot empty")
    private String title;
    @NotBlank(message = "Role cannot empty")
    private String role;
    @NotBlank(message = "Level cannot empty")
    private String level;
    @NotBlank(message = "Department cannot empty")
    private String department;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotBlank
    private LocalDate dateOfStart;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotBlank
    private LocalDate dateOfBirth;


    @NotBlank(message = "Address cannot empty")
    private String addressLine;
    @NotBlank(message = "City cannot empty")
    private String city;
    @NotBlank(message = "Country cannot empty")
    private String country;
    @NotBlank(message = " cannot empty")
    private String postCode;
    @NotBlank(message = "Name cannot empty")
    private String phoneNumber;

}
