package com.employee.expertise.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class ExpertsPerDomain {
    private Map<String, List<String>> expertsPerDomain = new HashMap<>();
}
