package io.ravneet.springbootproject1;

import org.springframework.stereotype.Component;

@Component
public class PlexOrder {

   Movie movie;



    public void movieOrder(){
        System.out.println("Movie Order Successful.");
        System.out.println(this.movie.getName());
        System.out.println(movie);

    }
}
