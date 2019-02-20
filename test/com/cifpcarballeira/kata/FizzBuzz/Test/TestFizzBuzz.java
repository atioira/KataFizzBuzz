package com.cifpcarballeira.kata.FizzBuzz.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cifpcarballeira.katas.FizzBuzz.fizzbuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam215
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }
    
    @Test
    public void test1devuelve1() {
        fizzbuzz fb = new fizzbuzz();
        String result = fb.getFizzbuzz(1);
        assertEquals("1", result);
        
    }
}
