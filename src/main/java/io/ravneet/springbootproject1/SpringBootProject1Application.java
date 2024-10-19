package io.ravneet.springbootproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootProject1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootProject1Application.class, args);
        System.out.println(context.getBean(PlexOrder.class));
        System.out.println(context.getBean(Movie.class));
        System.out.println(context.getBean(Customer.class));


    }

}
