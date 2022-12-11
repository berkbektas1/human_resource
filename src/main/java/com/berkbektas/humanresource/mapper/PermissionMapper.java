package com.berkbektas.humanresource.mapper;

import com.berkbektas.humanresource.client.dto.response.PermissionDto;
import com.berkbektas.humanresource.client.dto.request.CreatePermissionRequest;
import com.berkbektas.humanresource.model.Permission;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName = "PermissionMapperImpl", componentModel = "spring")
public interface PermissionMapper {

    Permission toPermission (PermissionDto permissionDto);

    @Mapping(source = "employee.id", target = "employeeId")
    PermissionDto toPermissionDto(Permission permission);

    Permission toPermissionFromCreatePermissionRequest(CreatePermissionRequest createPermissionRequest);

}
