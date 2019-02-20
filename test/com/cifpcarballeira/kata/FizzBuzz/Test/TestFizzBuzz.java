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
    @Test
    public void test2devuelve2(){
        fizzbuzz fb = new fizzbuzz();
        String result = fb.getFizzbuzz(2);
        assertEquals("2", result);
    }
    @Test
    public void test3devuelvefizz(){
        fizzbuzz fb = new fizzbuzz();
        String result = fb.getFizzbuzz(3);
        assertEquals("fizz", result);
    }
    @Test
    public void test5devuelvebuzz(){
        fizzbuzz fb = new fizzbuzz();
        String result = fb.getFizzbuzz(5);
        assertEquals("buzz", result);
    }
    @Test
    public void test15devuelvefizzbuzz(){
        fizzbuzz fb = new fizzbuzz();
        String result = fb.getFizzbuzz(15);
        assertEquals("fizzbuzz", result);
    }
}
