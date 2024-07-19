package es.rickyepoderi.microprofilejwt;

import jakarta.annotation.security.DeclareRoles;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.SecurityContext;
import org.eclipse.microprofile.jwt.Claims;
import org.eclipse.microprofile.jwt.JsonWebToken;

/**
 *
 * @author rickyepoderi
 */
@Stateless
@Path("/hello")
@DeclareRoles(value = {"user"})
public class HelloWorldEndpoint {

    @Inject
    private JsonWebToken jwt;

    @Inject
    SecurityContext securityContext;

    @GET
    @RolesAllowed({"user"})
    @Path("/hello")
    public String hello() {
        return "Hello " + jwt.getClaim(Claims.upn) + "!!!";
    }

    @GET
    @PermitAll
    @Path("/test")
    public String test() {
        return "test";
    }
}
