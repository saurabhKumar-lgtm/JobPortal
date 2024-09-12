package com.microservices.microservices.company.impl;

import com.microservices.microservices.company.Company;
import com.microservices.microservices.company.CompanyRepository;
import com.microservices.microservices.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
