package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;


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
        double resultado = multiplicacao.multi_resultado(2000,85);
        assertEquals(170000, resultado);
    }

    
}



    