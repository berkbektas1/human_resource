package com.berkbektas.humanresource.service;

import com.berkbektas.humanresource.client.dto.response.PermissionDto;
import com.berkbektas.humanresource.client.dto.request.CreatePermissionRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PermissionService {

    PermissionDto createPermission(CreatePermissionRequest createPermissionRequest);

    List<PermissionDto> getAllPermissionByEmployeeId(Integer id);

    List<PermissionDto> getAllPermission();

    void deletePermission(Integer id);
}
