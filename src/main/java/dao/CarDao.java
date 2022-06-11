package dao;

import Model.Car;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDao {
    private List <Car> listCar;

    {
        listCar = new ArrayList<>();
        listCar.add(new Car("Honda", 121, "pink"));
        listCar.add(new Car("Honda", 122, "blue"));
        listCar.add(new Car("Honda", 123, "red"));
        listCar.add(new Car("Honda", 124, "yellow"));
        listCar.add(new Car("Honda", 125, "bronze"));

    }

    public List<Car> allCarList() {
        return listCar;
    }

}
