package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplicandoTest {
    
    Multiplicacao multiplicacao;


    @BeforeEach
    public void beforeEach() {
        multiplicacao = new Multiplicacao(); 
    }

    @Test
    public void testCasoBase() {
        double resultado = multiplicacao.multi_resultado(2,2);
        assertEquals(4, resultado);
    }
    @Test
    public void numero_negativos() {
        double resultado = multiplicacao.multi_resultado(-2,(-4));
        assertEquals(8, resultado);
    }

    @Test
    public void Numeros_grandes() {
        double resultado = multiplicacao.multi_resultado(1000,368);
        assertEquals(368000, resultado)
    }

    
}



    