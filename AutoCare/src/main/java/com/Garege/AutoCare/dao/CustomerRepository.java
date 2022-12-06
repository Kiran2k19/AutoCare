package com.Garege.AutoCare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Garege.AutoCare.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
