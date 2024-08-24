package boschenko_group.my_application.my_controller;

import boschenko_group.my_application.my_service.MyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MyControllerImpl implements MyController {
    @Autowired
    private MyServiceImpl myService;

    public void myDoPost() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи айди и имя через пробел");
        String str = scanner.nextLine();
        myService.checkingData(str);
        scanner.close();
    }

    @Override
    public String toString() {
        return "MyControllerImpl{}";
    }
}
