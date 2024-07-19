package es.rickyepoderi.microprofilejwt;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.auth.LoginConfig;

/**
 *
 * @author rickyepoderi
 */
@ApplicationPath("/rest")
@LoginConfig(authMethod = "MP-JWT")
public class App extends Application {
}
