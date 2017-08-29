/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.voxus;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Icaro
 */
public class TestePilhaO1 {

    private Pilha p;
    
    @Before
    public void inicializar() throws Exception {
        p = new Pilha();
        p.push(4);
        p.push(5);
        p.push(3);
        p.push(2);
    }

    @Test
    public void testarPop() throws Exception {
        assertEquals(2, p.pop());
        assertEquals(3, p.pop());
        assertEquals(5, p.pop());
        assertEquals(4, p.pop());
    }

    @Test
    public void testarMenorValor() throws Exception {
        assertEquals(2, p.min());
    }
}
