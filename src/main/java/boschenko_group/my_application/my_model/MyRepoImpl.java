package boschenko_group.my_application.my_model;

import boschenko_group.my_application.db.MyDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepoImpl implements MyRepo {

    @Autowired
    private MyDB myDB;

    public void save(Integer id, String name){
        myDB.save(id, name);
    }

    @Override
    public String toString() {
        return "MyRepoImpl{}";
    }
}
