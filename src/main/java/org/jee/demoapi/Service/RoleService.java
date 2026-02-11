package org.jee.demoapi.Service;

import org.jee.demoapi.model.Role;
import org.jee.demoapi.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepo roleRepo;

    public List<Role> getAllRoles() {
        return roleRepo.findAll();
    }
}
