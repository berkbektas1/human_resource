package com.berkbektas.humanresource.controller;


import com.berkbektas.humanresource.client.dto.response.PermissionDto;
import com.berkbektas.humanresource.client.dto.request.CreatePermissionRequest;
import com.berkbektas.humanresource.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/permission")
@RequiredArgsConstructor
public class PermissionController {

    private final PermissionService permissionService;

    @PostMapping
    public ResponseEntity<PermissionDto> createPermission(@RequestBody CreatePermissionRequest createPermissionRequest){
        return ResponseEntity.ok(permissionService.createPermission(createPermissionRequest));
    }

    @GetMapping
    public ResponseEntity<List<PermissionDto>> getAllPermission(){
        return ResponseEntity.ok(permissionService.getAllPermission());
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<PermissionDto>> getAllPermissionByEmployeeId(@PathVariable Integer id){
        return ResponseEntity.ok(permissionService.getAllPermissionByEmployeeId(id));
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable Integer id){
        permissionService.deletePermission(id);
    }

}
