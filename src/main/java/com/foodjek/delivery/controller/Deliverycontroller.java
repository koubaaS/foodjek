package com.foodjek.delivery.controller;


import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.foodjek.delivery.model.Delivery;
import com.foodjek.delivery.service.Deliveryservice;

//mark class as Controller  
@RestController  
public class Deliverycontroller  
{  
	//autowire the DeliveryService class  
	@Autowired  
	Deliveryservice deliveryService;  
	//creating a get mapping that retrieves all the Delivery detail from the database   
	@GetMapping("/Delivery")  
	private List<Delivery> getAllDelivery()   
	{  
		return deliveryService.getAllDelivery();  
	}  
	//creating a get mapping that retrieves the detail of a specific Delivery  
	@GetMapping("/Delivery/{id}")  
	private Delivery getDelivery(@PathVariable("id") int id)   
	{  
		return deliveryService.getDeliveryById(id);  
	}  
	//creating a delete mapping that deletes a specified Delivery  
	@DeleteMapping("/Delivery/{id}")  
	private void deleteDelivery(@PathVariable("id") int id)   
	{  
		deliveryService.delete(id);  
	}  
	//creating post mapping that post the Delivery detail in the database  
	@PostMapping("/Delivery")  
	private int saveDelivery(@RequestBody Delivery Delivery)   
	{  
		deliveryService.saveOrUpdate(Delivery);  
		return Delivery.getId();  
	}  
	//creating put mapping that updates the Delivery detail   
	@PutMapping("/Delivery")  
	private Delivery update(@RequestBody Delivery r)   
	{  
		deliveryService.saveOrUpdate(r);  
		return r;  
	}  
}  
