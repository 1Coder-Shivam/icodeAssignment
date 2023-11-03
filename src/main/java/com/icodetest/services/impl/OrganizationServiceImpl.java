package com.icodetest.services.impl;

import com.icodetest.entity.Organization;
import com.icodetest.repository.OrganizationRepository;
import com.icodetest.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;

    @Autowired
    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    @Override
    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }
}
