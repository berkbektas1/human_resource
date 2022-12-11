package com.berkbektas.humanresource.client.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AddressDto {
    private String addressLine;
    private String city;
    private String country;
    private String postCode;
    private String phoneNumber;
}
