package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    public List<Car> getAllCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada","Brown", 11234));
        cars.add(new Car("Vaz", "Black", 1235));
        cars.add(new Car("BMV","Black", 4846));
        cars.add(new Car("Geely","Yellow", 464));
        cars.add(new Car("mersedez"," Green", 46541));
        return cars;
    }
}
