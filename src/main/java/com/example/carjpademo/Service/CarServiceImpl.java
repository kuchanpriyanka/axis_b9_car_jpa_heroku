package com.example.carjpademo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.carjpademo.Entity.Car;
import com.example.carjpademo.Exception.CarNotFoundException;
import com.example.carjpademo.Repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepository;
	
	@Override
	public Car getCarByEngineNumber(long engineNumber){
		Optional<Car> carOpt = carRepository.findById(engineNumber);
		if(!carOpt.isPresent()) {
			throw new CarNotFoundException("Car Not Found With Engine Number "+engineNumber);
		}
		return carOpt.get();
	}

	@Override
	public List<Car> getAllCars() {
          return (List<Car>) carRepository.findAll();
	}

	@Override
	public void saveCar(Car car) {

		carRepository.save(car);
	}

	@Transactional
	@Override
	public void updateCar(long engineNumber, Car updatedCar) {

		carRepository.updateCarInfo(updatedCar.getName(), updatedCar.getFuelType(),
				updatedCar.getEngineCapacity(),updatedCar.getMileage(),updatedCar.getEngineNumber());
	}

	@Override
	public void deleteCarByEngineNumber(long engineNumber) {
		
		carRepository.deleteById(engineNumber);
	}
	

}
