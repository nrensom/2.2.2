package service;

import models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private List<Car> lstCar = new ArrayList<>();


    @Override
    public List<Car> lstCar(int count) {
        lstCar.add(new Car("Honda", 121, "pink"));
        lstCar.add(new Car("Honda", 122, "blue"));
        lstCar.add(new Car("Honda", 123, "red"));
        lstCar.add(new Car("Honda", 124, "yellow"));
        lstCar.add(new Car("Honda", 125, "bronze"));
        if (count == 0 || count > 5) {
            return lstCar;
        }
        return lstCar.stream().limit(count).collect(Collectors.toList());
    }
}
