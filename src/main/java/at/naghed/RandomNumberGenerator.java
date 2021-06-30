package at.naghed;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("/api/")
public class RandomNumberGenerator {

    //from https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int randomNumber(){
        int min = 500;
        int max = 600;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
}


