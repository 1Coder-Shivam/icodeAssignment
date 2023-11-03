package com.icodetest.services;

import com.icodetest.entity.Organization;

import java.util.List;

public interface OrganizationService {
    Organization createOrganization(Organization organization);
    List<Organization> getAllOrganizations();
}
