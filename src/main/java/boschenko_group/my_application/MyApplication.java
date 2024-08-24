package boschenko_group.my_application;

import boschenko_group.my_application.db.MyDB;
import boschenko_group.my_application.my_app_config.MyAppConfigImpl;
import boschenko_group.my_application.my_controller.MyControllerImpl;
import boschenko_group.my_application.my_model.MyRepoImpl;
import boschenko_group.my_application.my_service.MyServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class MyApplication {

    public static void main(String[] args) {
        System.out.println("111111111111111111111111111111");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfigImpl.class);
        System.out.println(context.getBean(MyAppConfigImpl.class));
        System.out.println(context.getBean(MyControllerImpl.class));
        System.out.println(context.getBean(MyRepoImpl.class));
        System.out.println(context.getBean(MyServiceImpl.class));
        System.out.println(context.getBean(MyDB.class));
        System.out.println("111111111111111111111111111111");
        /**
         * Метод @myDoPost в контролере ждет, когда введем id и имя,
         * передает на сервер, сервер проверяет данные, если все ок, передает в репозиторий,
         * в репе отправляем данные в БД, от БД получает ответ о том, записались ли данные или перезаписались (выведет в консоль)
         **/
        context.getBean(MyControllerImpl.class).myDoPost();
        System.out.println("111111111111111111111111111111");
        context.getBean(MyDB.class).getAllList();
    }

}
