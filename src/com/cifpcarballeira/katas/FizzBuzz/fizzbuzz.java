/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author dam215
 */
public class fizzbuzz {
    public String getFizzbuzz(int i){
        if (i%3 == 0 && i%5 == 0) return "fizzbuzz";
        if (i%3 == 0) return "fizz";
        if (i%5 == 0) return "buzz";
        return i+"";
    }
}
