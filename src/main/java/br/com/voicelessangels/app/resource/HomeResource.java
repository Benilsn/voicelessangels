package br.com.voicelessangels.app.resource;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class HomeResource {

    @GET
    public TemplateInstance homePage() {
        return Templates.home()
                .data("pageTitle", "Incio")
                .data("name", "Test");
    }
}
