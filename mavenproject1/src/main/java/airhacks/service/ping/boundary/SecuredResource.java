package airhacks.service.ping.boundary;

import jakarta.annotation.security.DeclareRoles;
import jakarta.annotation.security.RolesAllowed;
import java.security.Principal;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

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
