/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public int getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time 
    int sum = 0;
    
    for(int i = 2; i <= n; i++){
        boolean primeChecker = true;
        for(int j = 2; j < i; j++){
            if(i % j == 0){
                primeChecker = false;
                break;
            }
        }
        if(primeChecker){
            sum += i;
        }    
    }
        return sum;
    }
    
}
