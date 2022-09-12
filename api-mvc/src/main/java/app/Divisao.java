package app;

import io.jooby.annotations.*;

@Path("/divi/{op}/{op2}")
public class Divisao {

    @GET
    public double divi_resultado(@PathParam double op ,@PathParam double op2) {
         return op/op2;
    }
}