package com.springtech.companyms.company;

import com.springtech.companyms.company.dto.ReviewMessage;

import java.util.List;

public interface CompanyService {
    public List<Company> getAllCompanies();

    public Boolean updateCompany(Long companyId, Company company);

    public void createCompany(Company company);

    public Boolean deleteCompany(Long companyId);

    public Company getCompanyById(Long companyId);

    public void updateCompanyRating(ReviewMessage reviewMessage);
}