package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;


public class DivisaoTest {
    
    Divisao divisao;


    @BeforeEach
    public void beforeEach() {
        divisao = new Divisao(); 
    }

    @Test
    public void testCasoBase() {
        double resultado = divisao.divi_resultado(2,2);
        assertEquals(1, resultado);
    }
    @Test
    public void numero_negativos() {
        double resultado = divisao.divi_resultado(-4,(2));
        assertEquals(-2, resultado);
    }

    @Test
    public void Numeros_decima() {
        double resultado = divisao.divi_resultado(1000,0.5);
        assertEquals(2000, resultado);
    }

    
}



    