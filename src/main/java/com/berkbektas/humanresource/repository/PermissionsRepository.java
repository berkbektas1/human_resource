package com.berkbektas.humanresource.repository;

import com.berkbektas.humanresource.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionsRepository extends JpaRepository<Permission, Integer> {
}
