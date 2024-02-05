package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();

//   void add(Car car);
//   List<Car> listCar();

   List<User> listCarOwner(String model, int series);
}
