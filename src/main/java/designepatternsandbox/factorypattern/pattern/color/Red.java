/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designepatternsandbox.factorypattern.pattern.color;

/**
 *
 * @author judicael
 */
public class Red implements Color {

    @Override
    public void fill() {
         System.out.println("Inside Red::fill() method.");
    }
    
}