package boschenko_group.my_application.db;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MyDB {
    public Map<Integer, String> myDataBase;

    public MyDB() {
        this.myDataBase = new HashMap<>();
    }

    public void save(Integer id, String name) {
        if (myDataBase.put(id, name) == null) {
            System.out.println("В БД записалось.");
        } else System.out.println("Запись с таким айди уже была, заменили");
    }
    public void getAllList(){
        myDataBase.forEach((k,v)->
                System.out.println(k+"\t"+v));
    }

    @Override
    public String toString() {
        return "MyDB{}";
    }
}
