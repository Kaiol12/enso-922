package app;

import io.jooby.annotations.*;

@Path("/Subtracao/{op1}/{op2}")
public class Subtracao {

    @GET
    public double calcularSubtracao(@PathParam double op1, @PathParam double op2) {
        double resultado = op1-op2
        return resultado;
    }
}