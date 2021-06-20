package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.SportCar;

public class CarFactory {
	public static Car newCar(String carType){
		if(carType.equals("SedanCar")){
			return new SedanCar();
		}
		else if(carType.equals("CoupleCar")){
			return new CoupleCar();
		}
		else if(carType.equals("SportCar")){
			return new SportCar();
		}
		else if(carType.equals("LuxuryCar")){
			return new LuxuryCar();
		}
		
		return null;
	}
}
