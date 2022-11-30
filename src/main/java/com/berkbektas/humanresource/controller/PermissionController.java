package com.berkbektas.humanresource.controller;


import com.berkbektas.humanresource.client.dto.PermissionDto;
import com.berkbektas.humanresource.client.dto.request.CreatePermissionRequest;
import com.berkbektas.humanresource.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/permission")
@RequiredArgsConstructor
public class PermissionController {

    private final PermissionService permissionService;

    @PostMapping
    public ResponseEntity<PermissionDto> createPermission(@RequestBody CreatePermissionRequest createPermissionRequest){
        return ResponseEntity.ok(permissionService.createPermission(createPermissionRequest));
    }


}
