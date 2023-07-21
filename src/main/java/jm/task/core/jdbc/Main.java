package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {



    public static void main(String[] args) {

         final String testName = "Ivan";
         final String testLastName = "Ivanov";
         final byte testAge = 5;


        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser(testName, testLastName, testAge);
        userService.saveUser(testName, testLastName, testAge);
        userService.saveUser(testName, testLastName, testAge);
        userService.saveUser(testName, testLastName, testAge);

        userService.cleanUsersTable();

        userService.getAllUsers().forEach(System.out::println);
        if (userService.getAllUsers().size() != 0) {
            System.out.println("Метод очищения таблицы пользователей реализован не корректно");
        }

    }
}

