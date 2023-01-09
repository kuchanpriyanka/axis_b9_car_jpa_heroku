package com.example.carjpademo.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.carjpademo.Entity.Car;

@Repository
public interface CarRepository extends CrudRepository <Car, Long>{

	@Modifying
	@Query("update Car set name=?1, fuelType=?2, engineCapacity=?3, mileage=?4 where engineNumber=?5")
	void updateCarInfo(String name, String fuelType,Integer engineCapacity,double mileage, Long engineNumber);
}
