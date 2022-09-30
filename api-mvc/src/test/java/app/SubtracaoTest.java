package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubtracaoTest {
    
    Subtracao subtracao;


    @BeforeEach
    public void beforeEach() {
        subtracao = new Subtracao(); 
    }

    @Test
    public void testCasoBase() {
        double resultado = subtracao.calcularSubtracao(2,2);
        assertEquals(0, resultado);
    }
    @Test
    public void numero_negativos() {
        double resultado = subtracao.calcularSubtracao(-2,(-4));
        assertEquals(2, resultado);
    }

    @Test
    public void Numeros_grandes() {
        double resultado = subtracao.calcularSubtracao(1000,368);
        assertEquals(632 resultado);
    }

    
}
}


    