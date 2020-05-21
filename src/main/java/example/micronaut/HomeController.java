package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.security.annotation.Secured;

import java.security.Principal;

@Secured("isAuthenticated()")
@Controller("/")
public class HomeController {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    String index(Principal principal) {
        return principal.getName();
    }
}
