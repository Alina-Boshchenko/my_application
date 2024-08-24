package boschenko_group.my_application.my_service;

import boschenko_group.my_application.my_model.MyRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Autowired
    private MyRepoImpl repo;

    public void checkingData(String value) {
        String[] strings = value.trim().split(" ", 2);
        if (Integer.parseInt(strings[0]) >= 0) {
            repo.save(Integer.parseInt(strings[0]), strings[1]);
        } else System.out.println("неверные значения");
    }


    @Override
    public String toString() {
        return "MyServiceImpl{}";
    }
}
