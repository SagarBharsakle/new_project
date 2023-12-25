package com.driving.orderservice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Integer>{

	public List<Orders> findByUsername(String username);
}