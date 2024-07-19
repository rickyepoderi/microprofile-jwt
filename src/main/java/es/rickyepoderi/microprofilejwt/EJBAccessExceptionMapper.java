package es.rickyepoderi.microprofilejwt;

import jakarta.ejb.EJBAccessException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

/**
 *
 * @author rickyepoderi
 */
@Provider
public class EJBAccessExceptionMapper implements ExceptionMapper<EJBAccessException>{

    @Override
    public Response toResponse(EJBAccessException e) {
        return Response.status(Response.Status.FORBIDDEN).entity("Endpoint not allowed").build();
    }

}
