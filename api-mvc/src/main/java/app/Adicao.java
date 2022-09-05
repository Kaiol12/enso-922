package app;

import io.jooby.annotations.*;

@Path("/raiz/{op}")
public class Adicao {

    @GET
    public double adicao(@PathParam double op ,@PathParam double op2) {
        double resultadodaadicao = op+op2;
        return resultadodaadicao;
    }
}