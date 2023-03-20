package web.service;
import web.model.*;
import java.util.List;


public interface CarService {
    List<Car> getCarList(int count);
}
