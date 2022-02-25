package com.cob.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cob.entity.InsurancePlanEntity;

@Repository
public interface InsurancePlanRepository extends JpaRepository<InsurancePlanEntity, Integer> {

}
