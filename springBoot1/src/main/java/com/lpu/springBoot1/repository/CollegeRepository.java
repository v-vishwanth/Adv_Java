package com.lpu.springBoot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lpu.springBoot1.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

}
