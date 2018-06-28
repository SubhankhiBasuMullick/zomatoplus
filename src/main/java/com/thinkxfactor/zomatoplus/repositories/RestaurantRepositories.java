package com.thinkxfactor.zomatoplus.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.thinkxfactor.zomatoplus.models.Restaurant;

public interface RestaurantRepositories extends JpaRepository<Restaurant, Long>{

}
