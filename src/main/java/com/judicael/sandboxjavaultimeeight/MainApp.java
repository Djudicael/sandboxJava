/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judicael.sandboxjavaultimeeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import testingjava.Java8Tester;

/**
 *
 * @author judicael
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Java8Tester tester = new Java8Tester();
          System.out.println("10 + 5 = " + tester.operate(10, 5, tester.getAddition()));
     System.out.println("10 - 5 = " + tester.operate(10, 5, tester.getSubtraction()));
     System.out.println("10 x 5 = " + tester.operate(10, 5, tester.getMultiplication()));
      System.out.println("10 / 5 = " + tester.operate(10, 5, tester.getDivision()));
      
      
       List names = new ArrayList();
		
      names.add("Mahesh");
      names.add("Suresh");
      names.add("Ramesh");
      names.add("Naresh");
      names.add("Kalpesh");
		
      names.forEach(System.out::println);
      
      
      
       List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
      // Predicate<Integer> predicate = n -> true
      // n is passed as parameter to test method of Predicate interface
      // test method will always return true no matter what value n has.
		
      System.out.println("Print all numbers:");
      
      tester.eval(list, n->true);
      
       // Predicate<Integer> predicate1 = n -> n%2 == 0
      // n is passed as parameter to test method of Predicate interface
      // test method will return true if n%2 comes to be zero
		
      System.out.println("Print even numbers:");
      tester.eval(list, n-> n%2 == 0 );
		
      // Predicate<Integer> predicate2 = n -> n > 3
      // n is passed as parameter to test method of Predicate interface
      // test method will return true if n is greater than 3.
		
      System.out.println("Print numbers greater than 3:");
      tester.eval(list, n-> n > 3 );
    }
    
}
