package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private List<Car> cars = List.of(
            new Car("BMW", "X3", 2021),
            new Car("Audi", "A4", 2020),
            new Car("Toyota", "Camry", 2022),
            new Car("Honda", "Civic", 2018),
            new Car("Ford", "Mustang", 2023)
    );

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count > 5) {
            count = 5;
        }
        return cars.subList(0, count);
    }
}
