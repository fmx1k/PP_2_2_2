package web.service;



import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {




    @Override
    public List<Car> getCarList(int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Black", 42000));
        carList.add(new Car("Ferrari", "Red", 1000000));
        carList.add(new Car("Cadillac", "Gray", 18100));
        carList.add(new Car("UAZ", "Gray", 24000));
        carList.add(new Car("Ford", "Red", 6700));
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
