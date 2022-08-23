package com.foodjek.delivery.repository;



import org.springframework.data.repository.CrudRepository;

import com.foodjek.delivery.model.Restaurant;


//repository that extends CrudRepository  
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>  
{  
}  
