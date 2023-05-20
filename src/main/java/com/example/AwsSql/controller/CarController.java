package com.example.AwsSql.controller;

import com.example.AwsSql.model.Car;
import com.example.AwsSql.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService ;

    @PostMapping("/add")
    public void addCar(@RequestBody Car car){
        carService.add(car);
    }

    @GetMapping("/getAll")
    public List<Car> getall(){
     return     carService.getall();
    }
}
