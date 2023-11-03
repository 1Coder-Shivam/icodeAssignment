package com.icodetest.controller;

import com.icodetest.entity.Organization;
import com.icodetest.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {
    private final OrganizationService organizationService;

    @Autowired
    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping()
    public Organization createOrganization(@RequestBody Organization organization) {
        return organizationService.createOrganization(organization);
    }

    @GetMapping()
    public List<Organization> getAllOrganizations() {
        return organizationService.getAllOrganizations();
    }
}
