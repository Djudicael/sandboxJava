/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designepatternsandbox.factorypattern.pattern.color;

import designepatternsandbox.factorypattern.pattern.Shape;

/**
 *
 * @author judicael
 */
public abstract  class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape) ;
}
