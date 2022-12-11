package com.berkbektas.humanresource.service.impl;

import com.berkbektas.humanresource.client.dto.response.PermissionDto;
import com.berkbektas.humanresource.client.dto.request.CreatePermissionRequest;
import com.berkbektas.humanresource.mapper.PermissionMapper;
import com.berkbektas.humanresource.model.Permission;
import com.berkbektas.humanresource.repository.EmployeeRepository;
import com.berkbektas.humanresource.repository.PermissionRepository;
import com.berkbektas.humanresource.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService {
    private final PermissionRepository permissionRepository;
    private final EmployeeRepository employeeRepository;
    private final PermissionMapper permissionMapper;
    @Override
    public PermissionDto createPermission(CreatePermissionRequest permissionRequest) {
        var employee = employeeRepository.findById(permissionRequest.getEmployee_id())
                .orElseThrow(()-> new RuntimeException("Customer not exist"));
        var permission = permissionMapper.toPermissionFromCreatePermissionRequest(permissionRequest);
        permission.setEmployee(employee);
        return permissionMapper.toPermissionDto(permissionRepository.save(permission));
    }

    @Override
    public List<PermissionDto> getAllPermissionByEmployeeId(@PathVariable Integer id) {
        List<Permission> permissionList = permissionRepository.findAllPermissionByEmployeeId(id);
        return permissionList.stream()
                .map(permissionMapper::toPermissionDto)
                .toList();
    }

    @Override
    public List<PermissionDto> getAllPermission() {
        var permissionList = permissionRepository.findAll();

        return permissionList.stream()
                .map(permissionMapper::toPermissionDto)
                .toList();
    }

    @Override
    public void deletePermission(Integer id) {
        permissionRepository.deleteById(id);
    }
}
