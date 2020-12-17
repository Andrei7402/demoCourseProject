package com.example.demo.controller;

import com.example.demo.model.Role;
import com.example.demo.service.Impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleServiceImpl roleService;

    @GetMapping("/allRoles")
    public String getAllRoles(Model model) {
        model.addAttribute("allRoles", roleService.getAllRoles());
        return "allRoles";
    }

    @PostMapping("/{id}")
    public String removeUser(@PathVariable("id") Long id) {
        roleService.remove(id);
        return "redirect:/role/allRoles";
    }

    @GetMapping("/createRole")
    public String createRole(Model model) {
        model.addAttribute("newRole", new Role());
        return "createRole";
    }

    @PostMapping
    public String saveRole(@ModelAttribute("newRole") Role role) {
        roleService.save(role);
        return "redirect:/role/allRoles";
    }

}
