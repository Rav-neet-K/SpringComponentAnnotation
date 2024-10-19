package io.ravneet.springbootproject1;


import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class Customer {


    private String cust_name;
    private int cust_id;
    private String age;



}
