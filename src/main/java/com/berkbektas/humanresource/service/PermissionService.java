package com.berkbektas.humanresource.service;

import com.berkbektas.humanresource.client.dto.PermissionDto;
import com.berkbektas.humanresource.client.dto.request.CreatePermissionRequest;
import org.springframework.stereotype.Service;

@Service
public interface PermissionService {

    PermissionDto createPermission(CreatePermissionRequest createPermissionRequest);
}
