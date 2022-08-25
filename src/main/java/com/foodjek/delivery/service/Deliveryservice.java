package com.foodjek.delivery.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.foodjek.delivery.model.Delivery;
import com.foodjek.delivery.repository.Deliveryrepository;

//defining the business logic  
@Service  
public class Deliveryservice   
{  
	@Autowired  
	Deliveryrepository deliveryRepository;  
	//getting all Restaurant record by using the method findaAll() of CrudRepository  
	public List<Delivery> getAllDelivery()   
	{  
		List<Delivery> deliverys = new ArrayList<Delivery>();  
		deliveryRepository.findAll().forEach(Delivery1 -> deliverys.add(Delivery1));  
		return deliverys;  	
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Delivery getDeliveryById(int id)   
	{  
		return deliveryRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Delivery Delivery)   
	{  
		deliveryRepository.save(Delivery);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		deliveryRepository.deleteById(id);  
	}  

}  
