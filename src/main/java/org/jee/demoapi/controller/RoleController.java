package org.jee.demoapi.controller;

import org.jee.demoapi.model.Role;
import org.jee.demoapi.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleRepo roleRepo;
    @GetMapping
    public List<Role> findAll() {
        return roleRepo.findAll();
    }
    @GetMapping("/{id}")
    public Role findById(@PathVariable int id) {
        return roleRepo.findById(id).orElse(null);
    }
}
