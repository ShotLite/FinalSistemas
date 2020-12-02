/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.pruebafinalsistemas.Ejemplos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Poox
 */
public class PruebaEjemplos {

    public PruebaEjemplos() {
   


}    
    Ejemplos X= new Ejemplos();
    @Test
    public void testMinutos(){
        assertEquals(600,X.Minutos(10));
    }
    @Test
    public void testEdad(){
        assertEquals(2920,X.Edad(8));
    }
    @Test
    public void testPawa(){
        assertEquals(63,X.Power(9, 7));
    }
    }