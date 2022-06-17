package controller;

import dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.Service;

@Controller
@RequestMapping("/cars")
public class CarsController {

    public final CarDao carDao;
    public Service service = new CarService();

    @Autowired
    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }


    @GetMapping()
    public String allCarList(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", service.lstCar(carDao.allCarList(), count));
        return "car";
    }

}
