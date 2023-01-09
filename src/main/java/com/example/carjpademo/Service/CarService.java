package com.example.carjpademo.Service;

import com.example.carjpademo.Entity.Car;

import java.util.List;

public interface CarService {

	//some methods to access DB
	Car getCarByEngineNumber(long engineNumber);
	
	List<Car> getAllCars();
	
	void saveCar(Car car);
	
	void updateCar(long engineNumber, Car updatedCar);
	
	void deleteCarByEngineNumber(long engineNumber);
	
}
