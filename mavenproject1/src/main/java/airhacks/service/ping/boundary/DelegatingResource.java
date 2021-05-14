package airhacks.service.ping.boundary;

import jakarta.annotation.security.DeclareRoles;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("delegate")
@DeclareRoles({"user", "admin"})
public class DelegatingResource {
    @Inject
    AsyncService svc;

    @GET
    @RolesAllowed({"user"})
    public String getName() {
        return svc.name();
    }

}
