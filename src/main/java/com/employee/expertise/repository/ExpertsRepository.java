package com.employee.expertise.repository;

import com.employee.expertise.dao.Experts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertsRepository extends JpaRepository<Experts, Long> {

}
