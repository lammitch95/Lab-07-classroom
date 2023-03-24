/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author lammi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BinarySearch b = new BinarySearch();
        int[] arr = {0,6,7,9,12,18,24,31,45,67};
        int key = 18;
        int n = b.runBinarySearchIteratively(arr, key,0,arr.length-1);
        if(n >= 0 && n < arr.length){
            if(arr[n] == key){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }else{
            System.out.println(false);
        }
         //ToDo 2: Call the above method and test the algorithm  
        // provide time and space analysis
        //BinarySearch Time Complexity  is O(log n) and the Space Complexity is O(1) 
        //-------------------------------------------------------------------------------------------------
        LinearSearch ls = new LinearSearch();
        int n2 = ls.search(arr, key);
        if(n2 == key){
            System.out.println(true);
        }else{
           System.out.println(false);
        }
        // Todo 01: - complete the implementation of linear search and test your code  
        //         - prvoide asymptotic analysis of the developed solution
        //LinearSearch Time Complexity is O(n) and the Space Complexity is O(1). 
        //This is linear time complexity, it not good for larger input sizes
        
        //--------------------------------------------------------------------------------------
        
        Problem01 p = new Problem01();
        System.out.println("Sum of all prime numbers from 1-n: " + p.getSumOfPrimes(100));
         // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
         //          Test your solution
         //          Analyze its space and time 
         //Time Complexity is O(n^2) and Space Complexity is O(1).
         
        //-------------------------------------------------------------------------------------
        
        BubbleSort bs = new BubbleSort();
        int[] arr2 = {20,0,12,3,6,4,8,9,15,18};
        int[] sortedArr = bs.bubbleSort(arr2, arr2.length);
        System.out.print("Sorted Array: ");
        for(int i = 0; i < sortedArr.length; i++){
            System.out.print(sortedArr[i] + " ");
            
        }
        //ToDo 3: complete this algorithm, test it, provide its time complexity
        //BubbleSort Time Complexity is O(n^2) and Space Complexity is O(1)
        
            
    }
        
    }

    

