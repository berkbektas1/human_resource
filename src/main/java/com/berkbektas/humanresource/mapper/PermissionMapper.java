package com.berkbektas.humanresource.mapper;

import com.berkbektas.humanresource.client.dto.PermissionDto;
import com.berkbektas.humanresource.client.dto.request.CreatePermissionRequest;
import com.berkbektas.humanresource.model.Permission;
import org.mapstruct.Mapper;

@Mapper(implementationName = "PermissionMapperImpl", componentModel = "spring")
public interface PermissionMapper {

    Permission toPermission (PermissionDto permissionDto);

    PermissionDto toPermissionDto(Permission permission);

    Permission toPermissionFromCreatePermissionRequest(CreatePermissionRequest createPermissionRequest);

}
