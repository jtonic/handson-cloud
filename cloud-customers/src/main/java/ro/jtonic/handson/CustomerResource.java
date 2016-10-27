package ro.jtonic.handson;

import org.springframework.beans.factory.annotation.Value;
// import org.springframework.cloud.context.config.annotation.RefreshScope;
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
// @RefreshScope
public class CustomerResource {

    @Value("${message}")
    private String message;

    @GET
    @Path("message")
    public String getHello() {
        return message;
    }

}
