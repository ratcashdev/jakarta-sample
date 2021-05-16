package airhacks.service.ping.boundary;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import java.security.Principal;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("secure")
@DeclareRoles({"user", "admin"})
public class SecuredResource {
    @Inject
    Principal principal;

    @GET
    @RolesAllowed({"user"})
    public String name() {
        return principal.getName();
    }
}
