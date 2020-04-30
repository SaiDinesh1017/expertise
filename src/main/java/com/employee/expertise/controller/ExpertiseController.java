package com.employee.expertise.controller;

import com.employee.expertise.domain.ExpertsPerDomain;
import com.employee.expertise.service.ExpertConsolidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExpertiseController {

    @Autowired
    private ExpertConsolidationService consolidationService;

    @GetMapping("/get_all_experts/{pageId}")
    public ExpertsPerDomain getExpertise(@PathVariable() String pageId) {
        return consolidationService.getAllExpertsPerPage(pageId);git add
    }



}
