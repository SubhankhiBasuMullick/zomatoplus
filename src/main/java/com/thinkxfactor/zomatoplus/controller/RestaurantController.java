package com.thinkxfactor.zomatoplus.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Item;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repositories.ItemRepositories;
import com.thinkxfactor.zomatoplus.repositories.RestaurantRepositories;
import com.thinkxfactor.zomatoplus.repositories.UserRepositories;

@RestController
@RequestMapping("/restuarant")
public class RestaurantController {

	@Autowired
	private RestaurantRepositories RestaurantRepositories;
	@Autowired
	private ItemRepositories ItemRepositories;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		Restaurant persistedRestaurant=RestaurantRepositories.save(restaurant);
		return persistedRestaurant;
	}
	@GetMapping("/getAll")
	public List<Restaurant> getAll()
	{
		List<Restaurant> restaurant=RestaurantRepositories.findAll();
		return restaurant;
	}
	
	@PostMapping("/add_items")
	public Item addItem(@RequestBody Item item)
	{
		Item persistedItem=ItemRepositories.save(item);
		return persistedItem;
		
	}
}		
 
