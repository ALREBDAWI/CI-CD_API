package org.jee.demoapi.controller;

import org.jee.demoapi.Service.RoleService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class RoleWebController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("/roles-display")
    public String viewRoles(Model model) {
        model.addAttribute("rolesList", roleService.getAllRoles());
        return "roles_page";
    }
}
