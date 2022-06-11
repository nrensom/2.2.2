package service;

import Model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> lstCar(List <Car> lstCar, int count) {
    if(count == 0 || count > 5){
        return lstCar;
    }
        return lstCar.stream().limit(count).collect(Collectors.toList());
    }
}
