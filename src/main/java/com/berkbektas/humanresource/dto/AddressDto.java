package com.berkbektas.humanresource.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {
    private String address;
    private String city;
    private String country;
    private String postCode;
    private String phoneNumber;
}
