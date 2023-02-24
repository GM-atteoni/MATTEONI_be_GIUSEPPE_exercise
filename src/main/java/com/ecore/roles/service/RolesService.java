package com.ecore.roles.service;

import com.ecore.roles.model.Role;

import java.util.List;
import java.util.UUID;

public interface RolesService {

    Role CreateRole(Role role);

    Role GetRole(UUID id);

    Role GetRole(UUID teamId, UUID userId);

    List<Role> GetRoles();

}
