package com.employee.expertise.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "experts")
@Getter
@Setter
public class Experts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "domain_name")
    private String domainName;

    @Column(name = "employee_name")
    private String employeeName;

    public Experts() {
    }

    public Experts(String domainName, String employeeName) {
        this.domainName = domainName;
        this.employeeName = employeeName;
    }
}
