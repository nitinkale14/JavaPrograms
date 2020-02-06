package demo.springdemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {

	public static void main(String[] args) {

        Map<String, Object> prop = new HashMap<String, Object>();
        prop.put("server.port", "8084");
        SpringApplication app = new SpringApplication(MySpringBootApplication.class);
        app.setDefaultProperties(prop);
        app.run(args);

    }
}