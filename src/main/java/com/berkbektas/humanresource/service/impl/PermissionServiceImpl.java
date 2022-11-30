package com.berkbektas.humanresource.service.impl;

import com.berkbektas.humanresource.client.dto.PermissionDto;
import com.berkbektas.humanresource.client.dto.request.CreatePermissionRequest;
import com.berkbektas.humanresource.mapper.PermissionMapper;
import com.berkbektas.humanresource.model.Permission;
import com.berkbektas.humanresource.repository.PermissionRepository;
import com.berkbektas.humanresource.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService {
    private final PermissionRepository permissionRepository;
    private final PermissionMapper permissionMapper;
    @Override
    public PermissionDto createPermission(CreatePermissionRequest permissionRequest) {
        Permission permission = permissionMapper.toPermissionFromCreatePermissionRequest(permissionRequest);
        return permissionMapper.toPermissionDto(permissionRepository.save(permission));
    }


}
