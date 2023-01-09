package com.example.carjpademo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.carjpademo.Entity.Car;
import com.example.carjpademo.Service.CarService;

@RestController
public class CarController {

	@Autowired
	private CarService carService;
	
	@GetMapping("/cars")
	public List<Car> getAllCars() {
		return carService.getAllCars();
	}
	
	@GetMapping("/car/{engineNumber}")
	public Car getCarByEngineNumber(@PathVariable long engineNumber) {
		return carService.getCarByEngineNumber(engineNumber);
	}
	
	@PostMapping("/car")
	public ResponseEntity<String> saveCar(@RequestBody Car car) {
		carService.saveCar(car);
		return new ResponseEntity<String>("Car added to Database...", HttpStatus.CREATED);
	}
	
	@DeleteMapping("/car/{engineNumber}")
	public ResponseEntity<String> deleteCarByEngineNumber(@PathVariable long engineNumber){
		carService.deleteCarByEngineNumber(engineNumber);
		return new ResponseEntity<String>("Car deletedwith engineNumber:"+engineNumber, HttpStatus.OK);
	}
	
	
	@PutMapping("/car/{engineNumber}")
	public ResponseEntity<String> updateCarInfo(@PathVariable long engineNumber, @RequestBody Car updatedCar){
		if(engineNumber != updatedCar.getEngineNumber()) {
			return new ResponseEntity<String>("Engine Number Mismatch!!",HttpStatus.BAD_REQUEST);
		} else {
			carService.updateCar(engineNumber, updatedCar);
			return new ResponseEntity("Car Updated Successfully!!",HttpStatus.OK);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
