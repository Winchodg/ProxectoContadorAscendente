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
        ContadorAscendente instance = new ContadorAscendente(538);
        assertEquals(539,instance.incrementar());
        
    }  
    /**
     * Test of incrementarClaseNonValida method, of class ContadorAscendente.
     */
    @Test
    public void testIncrementarClaseNonValida() {
        ContadorAscendente instance = new ContadorAscendente(1050);
        assertEquals(1000,instance.incrementar());
        
    } 
    
    /**
     * Test of testIncrementarClaseValidaValorLimite1 method, of class ContadorAscendente.
     */
    @Test
    public void testIncrementarClaseValidaValorLimite1() {
        ContadorAscendente instance = new ContadorAscendente(999);
        assertEquals(1000,instance.incrementar());
    } 
    
    /**
     * Test of testIncrementarClaseValidaValorLimite2 method, of class ContadorAscendente.
     */
    @Test
    public void testIncrementarClaseValidaValorLimite2() {
        ContadorAscendente instance = new ContadorAscendente(-2147483648);
        assertEquals(-2147483647,instance.incrementar());
    } 
    
    /**
     * Test of testIncrementarClaseNonValidaValorLimite1 method, of class ContadorAscendente.
     */
    @Test
    public void testIncrementarClaseNonValidaValorLimite1() {
        ContadorAscendente instance = new ContadorAscendente(1000);
        assertEquals(1000,instance.incrementar());
        
    } 
    
      /**
     * Test of testIncrementarClaseNonValidaValorLimite2 method, of class ContadorAscendente.
     */
    @Test
    public void testIncrementarClaseNonValidaValorLimite2() {
        ContadorAscendente instance = new ContadorAscendente(2147483647);
        assertEquals(1000,instance.incrementar());
        
    } 
}
