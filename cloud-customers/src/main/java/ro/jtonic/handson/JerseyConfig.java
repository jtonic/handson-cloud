package ro.jtonic.handson;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by Antonel Ernest Pazargic on 27/10/2016.
 *
 * @author Antonel Ernest Pazargic
 */
@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages(this.getClass().getPackage().getName());
    }
}
