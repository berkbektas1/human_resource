package com.berkbektas.humanresource.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class BaseAddressRequest {
    private String address;
    private String city;
    private String country;
    private String postCode;
    private String phoneNumber;
}
