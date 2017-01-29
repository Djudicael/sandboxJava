/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designepatternsandbox.factorypattern.pattern.color;

import designepatternsandbox.factorypattern.pattern.*;
import designepatternsandbox.factorypattern.pattern.Shape;

/**
 *
 * @author judicael
 */
public class ShapeFactory2 extends AbstractFactory {
    
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
         return null;
      }		
      
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
    }
    
}
