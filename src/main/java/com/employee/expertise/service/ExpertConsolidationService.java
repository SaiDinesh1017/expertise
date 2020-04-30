package com.employee.expertise.service;

import com.employee.expertise.dao.Experts;
import com.employee.expertise.domain.ExpertsPerDomain;
import com.employee.expertise.repository.ExpertsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ExpertConsolidationService {

    public static Map<String, List<Long>> preloadedPageMap;

    // Todo Use Rest pagination in Spring to achieve this
    // Because of the time constraint unable to implement the proper pagination mechanism
    static {
        preloadedPageMap = new HashMap<>();
        preloadedPageMap.put("1", Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L));
        preloadedPageMap.put("2", Arrays.asList(11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L));
        preloadedPageMap.put("3", Arrays.asList(21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L));
    }


    @Autowired
    private ExpertsRepository expertsRepository;

    public ExpertsPerDomain getAllExpertsPerPage(String pageId) {
        List<Experts> completeExpertsList = expertsRepository.findAllById(preloadedPageMap.getOrDefault(pageId, new ArrayList<>()));
        return convertExpertListToExpertListPerDomain(completeExpertsList);
    }

    private ExpertsPerDomain convertExpertListToExpertListPerDomain(List<Experts> completeExpertsList) {
        ExpertsPerDomain expertsPerDomain = new ExpertsPerDomain();
        Map<String, List<String>> expertsDomainMap = expertsPerDomain.getExpertsPerDomain();
        completeExpertsList.forEach(experts -> {
            if(expertsDomainMap.get(experts.getDomainName()) == null) {
                List<String> expertNames = Collections.singletonList(experts.getEmployeeName());
                expertsDomainMap.put(experts.getDomainName(), expertNames);
            } else {
                expertsDomainMap.get(experts.getDomainName()).add(experts.getEmployeeName());
            }
        });
        return expertsPerDomain;
    }
}
