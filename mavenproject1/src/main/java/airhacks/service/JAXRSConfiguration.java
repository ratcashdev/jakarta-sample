package airhacks.service;

import jakarta.security.enterprise.authentication.mechanism.http.BasicAuthenticationMechanismDefinition;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.glassfish.soteria.identitystores.annotation.Credentials;
import org.glassfish.soteria.identitystores.annotation.EmbeddedIdentityStoreDefinition;

/**
 * Configures a JAX-RS endpoint. Delete this class, if you are not exposing
 * JAX-RS resources in your application.
 *
 * @author airhacks.com
 */
@ApplicationPath("resources")
@BasicAuthenticationMechanismDefinition(realmName = "jakarta")
@EmbeddedIdentityStoreDefinition(
        @Credentials(callerName = "duke", password = "best", groups = {"user"}))
public class JAXRSConfiguration extends Application {

}
