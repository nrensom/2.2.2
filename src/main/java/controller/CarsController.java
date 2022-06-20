package controller;

import models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;
import service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    public CarService service = new CarServiceImpl();

    @GetMapping()
    public String allCarList(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("Honda", 121, "pink"));
        listCar.add(new Car("Honda", 122, "blue"));
        listCar.add(new Car("Honda", 123, "red"));
        listCar.add(new Car("Honda", 124, "yellow"));
        listCar.add(new Car("Honda", 125, "bronze"));
        model.addAttribute("cars", service.lstCar(listCar, count));
        return "car";
    }

}
