package com.berkbektas.humanresource.dto.response;

import com.berkbektas.humanresource.dto.AddressDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponseDto extends AddressDto {
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

    //Address field
    private String address;
    private String city;
    private String country;
    private String postCode;
    private String phoneNumber;
}
