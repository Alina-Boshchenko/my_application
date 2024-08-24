package boschenko_group.my_application.my_app_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "boschenko_group.my_application")
public class MyAppConfigImpl implements MyAppConfig {


    @Override
    public String toString() {
        return "MyAppConfigImpl{}";
    }
}
