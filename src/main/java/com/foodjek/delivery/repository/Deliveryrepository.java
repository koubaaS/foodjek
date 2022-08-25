package com.foodjek.delivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.foodjek.delivery.model.Delivery;


//repository that extends CrudRepository  
public interface Deliveryrepository extends CrudRepository<Delivery, Integer>  
{  
}  
