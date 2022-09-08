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

    private CarService service = new CarServiceImpl();

    @GetMapping()
    public String allCarList(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", service.lstCar(count));
        return "car";
    }

}
