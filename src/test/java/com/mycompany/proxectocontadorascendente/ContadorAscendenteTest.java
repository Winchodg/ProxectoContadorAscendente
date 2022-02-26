/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proxectocontadorascendente;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Wences
 */
public class ContadorAscendenteTest {
    
    public ContadorAscendenteTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    

    /**
     * Test of incrementarClaseValida method, of class ContadorAscendente.
     */
    @Test
    public void testIncrementarClaseValida() {
        ContadorAscendente instance = new ContadorAscendente();
        instance.setValorActual(538);
        assertEquals(539,instance.incrementar());
        
    }  
    /**
     * Test of incrementarClaseNonValida method, of class ContadorAscendente.
     */
    @Test
    public void testIncrementarClaseNonValida() {
        ContadorAscendente instance = new ContadorAscendente();
        instance.setValorActual(1050);
        assertEquals(1000,instance.incrementar());
        
    } 
    
    /**
     * Test of testIncrementarClaseValidaValorLimite method, of class ContadorAscendente.
     */
    @Test
    public void testIncrementarClaseValidaValorLimite() {
        ContadorAscendente instance = new ContadorAscendente();
        instance.setValorActual(999);
        assertEquals(1000,instance.incrementar());
        
    } 
    
    /**
     * Test of testIncrementarClaseValidaValorLimite method, of class ContadorAscendente.
     */
    @Test
    public void testIncrementarClaseNonValidaValorLimite() {
        ContadorAscendente instance = new ContadorAscendente();
        instance.setValorActual(1000);
        assertEquals(1000,instance.incrementar());
        
    } 
}
