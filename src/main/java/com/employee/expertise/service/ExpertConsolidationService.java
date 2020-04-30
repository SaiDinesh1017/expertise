package com.employee.expertise.service;

import com.employee.expertise.dao.Candidate;
import com.employee.expertise.dao.Experts;
import com.employee.expertise.domain.ExpertsPerDomain;
import com.employee.expertise.repository.ExpertsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ExpertConsolidationService {

    @Autowired
    private ExpertsRepository expertsRepository;

    public ExpertsPerDomain getAllExperts() {
        List<Experts> completeExpertsList = expertsRepository.findAll();
        return convertExpertListToExpertListPerDomain(completeExpertsList);
    }

    private ExpertsPerDomain convertExpertListToExpertListPerDomain(List<Experts> completeExpertsList) {
        ExpertsPerDomain expertsPerDomain = new ExpertsPerDomain();
        Map<String, List<String>> expertsDomainMap = expertsPerDomain.getExpertsPerDomain();
        completeExpertsList.forEach(experts -> {
            if(expertsDomainMap.get(experts.getDomainName()) == null) {
                List<String> expertNames = new ArrayList<>();
                expertNames.add(experts.getEmployeeName());
                expertsDomainMap.put(experts.getDomainName(), expertNames);
            } else {
                expertsDomainMap.get(experts.getDomainName()).add(experts.getEmployeeName());
            }
        });
        return expertsPerDomain;
    }

    public void addExpert(Candidate candidate) {
        candidate.getExpert().parallelStream().forEach(strings -> {
            Experts experts = new Experts();
            experts.setDomainName(strings);
            experts.setEmployeeName(candidate.getName());
            expertsRepository.save(experts);
        });
    }
}
