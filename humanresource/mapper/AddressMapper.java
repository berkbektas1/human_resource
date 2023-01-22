package com.berkbektas.humanresource.mapper;

import com.berkbektas.humanresource.client.dto.response.AddressDto;
import com.berkbektas.humanresource.client.dto.request.CreateEmployeeRequest;
import com.berkbektas.humanresource.model.Address;
import org.mapstruct.Mapper;

@Mapper(implementationName = "AddressMapperImpl", componentModel = "spring")
public interface AddressMapper {

    Address toAddress (AddressDto addressDto);

    AddressDto toAddressDto(Address address);

    Address toAddressFromCreateAddressRequest(CreateEmployeeRequest createEmployeeRequest);
}
