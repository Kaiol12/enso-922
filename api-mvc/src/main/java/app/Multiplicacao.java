package app;

import io.jooby.annotations.*;

@Path("/Multi/{op}/{op2}")
public class Multiplicacao {

    @GET
    public double multi_resultado(@PathParam double op ,@PathParam double op2) {
         return op+op2
    }
}