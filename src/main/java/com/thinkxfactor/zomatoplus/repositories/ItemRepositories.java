package com.thinkxfactor.zomatoplus.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Item;

public interface ItemRepositories extends JpaRepository<Item, Long> {

		List<Item> findAllByRestaurantId(long restaurantId);
}
