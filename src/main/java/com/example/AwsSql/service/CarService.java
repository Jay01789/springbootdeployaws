package com.example.AwsSql.service;

import com.example.AwsSql.model.Car;
import com.example.AwsSql.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepo carRepo;

    public void add(Car car) {

        carRepo.save(car);
    }

    public List<Car> getall() {

        return carRepo.findAll();
    }
}
