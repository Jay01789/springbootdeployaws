package com.example.AwsSql.repo;

import com.example.AwsSql.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo  extends JpaRepository<Car,Integer> {
}
