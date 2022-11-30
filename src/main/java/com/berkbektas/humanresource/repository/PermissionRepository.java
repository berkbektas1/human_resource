package com.berkbektas.humanresource.repository;

import com.berkbektas.humanresource.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
    @Query("""
        SELECT per
        FROM Permission per
        WHERE per.employee.id = :id
    """)
    List<Permission> findAllPermissionByEmployeeId(Integer id);
}
