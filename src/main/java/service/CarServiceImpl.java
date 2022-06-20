package service;

import models.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> lstCar(List<Car> lstCar, int count) {
        if (count == 0 || count > 5) {
            return lstCar;
        }
        return lstCar.stream().limit(count).collect(Collectors.toList());
    }
}
