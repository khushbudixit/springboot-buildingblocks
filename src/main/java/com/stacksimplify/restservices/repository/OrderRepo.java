package com.stacksimplify.restservices.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacksimplify.restservices.entities.order;
@Repository
public interface OrderRepo extends JpaRepository<order, Long>{
	

}
