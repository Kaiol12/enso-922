package app;

import io.jooby.annotations.*;

@Path("/soma/{op}/{op2}")
public class Adicao {

    @GET
    public double adicao_resultado(@PathParam double op ,@PathParam double op2) {
         return op+op2
    }
}