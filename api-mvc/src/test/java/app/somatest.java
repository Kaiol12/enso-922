package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class somatest {
    
    Adicao adicao;


    @BeforeEach
    public void beforeEach() {
        adicao = new Adicao(); 
    }

    @Test
    public void testCasoBase() {
        double resultado = adicao.adicao_resultado(2,2);
        assertEquals(4, resultado);
    }
    @Test
    public void soma_com_numeros_negativos(){
        double resultado = adicao.adicao_resultado(-20,10);
        assertEquals(-10, resultado);
    }
    @Test
    public void soma_com_nnumeros_grandes(){
        double resultado = adicao.adicao_resultado(10000,10000);
        assertEquals(20000, resultado);


    }
}


    