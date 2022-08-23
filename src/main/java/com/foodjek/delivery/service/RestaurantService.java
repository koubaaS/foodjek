package com.foodjek.delivery.service;


import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.foodjek.delivery.model.Restaurant;
import com.foodjek.delivery.repository.RestaurantRepository;

//defining the business logic  
@Service  
public class RestaurantService   
{  
	@Autowired  
	RestaurantRepository restaurantRepository;  
	//getting all Restaurant record by using the method findaAll() of CrudRepository  
	public List<Restaurant> getAllRestaurant()   
	{  
		List<Restaurant> restaurants = new ArrayList<Restaurant>();  
		restaurantRepository.findAll().forEach(Restaurant1 -> restaurants.add(Restaurant1));  
		return restaurants;  	
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Restaurant getRestaurantById(int id)   
	{  
		return restaurantRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Restaurant Restaurant)   
	{  
		restaurantRepository.save(Restaurant);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		restaurantRepository.deleteById(id);  
	}  

}  
