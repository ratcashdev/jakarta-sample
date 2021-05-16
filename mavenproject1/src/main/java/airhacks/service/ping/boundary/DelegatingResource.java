package airhacks.service.ping.boundary;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

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
