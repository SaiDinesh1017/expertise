package com.employee.expertise.controller;

import com.employee.expertise.dao.Candidate;
import com.employee.expertise.domain.ExpertsPerDomain;
import com.employee.expertise.service.ExpertConsolidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Sai Dinesh Chandaluri
 */
@RestController
public class ExpertiseController {

    @Autowired
    private ExpertConsolidationService consolidationService;

    @GetMapping("/get_all_experts")
    public ExpertsPerDomain getExpertise() {
        return consolidationService.getAllExperts();
    }

    /**
     * @param candidate
     * We receive name of the candidate and his expertise
     */
    @PostMapping("/experts/add")
    public String addExperts(@RequestBody Candidate candidate) {
        consolidationService.addExpert(candidate);
        return "Successfully added candidate and his expertise ";
    }
}
