/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingjava;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author judicael
 */
public class Java8Tester {
    
    
     interface MathOperation {
      int operation(int a, int b);
   }
	
    interface GreetingService {
      void sayMessage(String message);
   }
	
   public int operate(int a, int b, MathOperation mathOperation){
      return mathOperation.operation(a, b);
   }
   
   public  void eval(List<Integer> list, Predicate<Integer> predicate) {
      for(Integer n: list) {
		
         if(predicate.test(n)) {
            System.out.println(n + " ");
         }
      }
   }
   
   //with type declaration
      MathOperation addition = (int a, int b) -> a + b;
		
      //with out type declaration
      MathOperation subtraction = (a, b) -> a - b;
		
      //with return statement along with curly braces
      MathOperation multiplication = (int a, int b) -> { return a * b; };
		
      //without return statement and without curly braces
      MathOperation division = (int a, int b) -> a / b;
      
      //with parenthesis
      GreetingService greetService1 = message ->
      System.out.println("Hello " + message);
		
      //without parenthesis
      GreetingService greetService2 = (message) ->
      System.out.println("Hello " + message);

    public MathOperation getAddition() {
        return addition;
    }

    public void setAddition(MathOperation addition) {
        this.addition = addition;
    }

    public MathOperation getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(MathOperation subtraction) {
        this.subtraction = subtraction;
    }

    public MathOperation getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(MathOperation multiplication) {
        this.multiplication = multiplication;
    }

    public MathOperation getDivision() {
        return division;
    }

    public void setDivision(MathOperation division) {
        this.division = division;
    }

    public GreetingService getGreetService1() {
        return greetService1;
    }

    public void setGreetService1(GreetingService greetService1) {
        this.greetService1 = greetService1;
    }

    public GreetingService getGreetService2() {
        return greetService2;
    }

    public void setGreetService2(GreetingService greetService2) {
        this.greetService2 = greetService2;
    }
      
}
