package airhacks.service;

import javax.security.enterprise.authentication.mechanism.http.BasicAuthenticationMechanismDefinition;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.glassfish.soteria.identitystores.annotation.Credentials;
import org.glassfish.soteria.identitystores.annotation.EmbeddedIdentityStoreDefinition;

/**
 * Configures a JAX-RS endpoint. Delete this class, if you are not exposing
 * JAX-RS resources in your application.
 *
 * @author airhacks.com
 */
@ApplicationPath("resources")
@BasicAuthenticationMechanismDefinition(realmName = "javax")
@EmbeddedIdentityStoreDefinition(
        @Credentials(callerName = "duke", password = "best", groups = {"user"}))
public class JAXRSConfiguration extends Application {

}
