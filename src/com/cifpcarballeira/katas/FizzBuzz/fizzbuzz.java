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
        String cadena=i+"";
        if (i%3 == 0 && i%5 == 0) return "fizzbuzz";
        if (i%3 == 0 || cadena.contains("3")) return "fizz";
        if (i%5 == 0) return "buzz";
//        if((String.valueOf(i).contains("3") && String.valueOf(i).contains("5")) || (i%3 == 0 && i%5 == 0)) return "fizzbuzz";
//        if(String.valueOf(i).contains("5")|| i%5 == 0) return "buzz";
//        if(String.valueOf(i).contains("3") || i%3 == 0) return "fizz";
        return i+"";
    }
}
