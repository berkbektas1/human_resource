package com.berkbektas.humanresource.dto.request;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;

import lombok.Setter;


import java.math.BigDecimal;

import java.util.Date;

@Getter
@Setter
public class EmployeeRequestDto {

    private String firstName;
    private String lastName;

    private String email;

    private String identityNumber;
    private BigDecimal salary;
    private String title;
    private String role;
    private String level;
    private String department;

//    private List<Address> addressList;
    private String address;
    private String city;
    private String country;
    private String postCode;
    private String phoneNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dateOfStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dateOfBirth;

//    private List<CreateAddressRequest> addressList;

}
