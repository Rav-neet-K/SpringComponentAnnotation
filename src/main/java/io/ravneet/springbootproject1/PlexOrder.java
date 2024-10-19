package io.ravneet.springbootproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlexOrder {

//   @Autowired
    Movie movie;

//Constructor injection
   public PlexOrder(Movie movie ){

       this.movie= movie;

   }

    public void movieOrder(){
        System.out.println("Movie Order Successful.");
        System.out.println(this.movie.getName());
        System.out.println(movie);

    }
}
