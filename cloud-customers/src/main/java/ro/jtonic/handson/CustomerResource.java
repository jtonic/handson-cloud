package ro.jtonic.handson;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Antonel Ernest Pazargic on 27/10/2016.
 *
 * @author Antonel Ernest Pazargic
 */
@Component
@Path("customers")
public class CustomerResource {

    @GET
    public String getHello() {
        return "Hello";
    }

}
