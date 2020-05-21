package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

import java.security.Principal;

@Controller("/")
@Secured(SecurityRule.IS_AUTHENTICATED)
public class HomeController {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    String index(Principal principal) {
        return principal.getName();
    }
}
