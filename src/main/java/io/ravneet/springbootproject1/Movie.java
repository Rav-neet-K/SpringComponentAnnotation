package io.ravneet.springbootproject1;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Data
public class Movie {

    private String name;
    private int year;
    private String genre;
    private String price;

}
