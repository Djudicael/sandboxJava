/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sylwya;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

/**
 *
 * @author judicael
 */
public class Block extends Rectangle{
    
    Image pic;
	int dx =3;
	int dy = -3;
	Rectangle left, right;
	boolean destroyed = false;
	boolean powerup = false;

	Block(int a, int b, int w, int h, String s){
		x =a;
		y= b;
		width = w;
		height = h;
		left = new Rectangle(a-1,b, 1, h);
		right = new Rectangle(a+w+1, b, 1, h);
		pic = Toolkit.getDefaultToolkit().getImage(s);	
		
	}
	
	public void draw(Graphics g, Component c){
		if(!destroyed){
			g.drawImage(pic,x, y, width, height, c );
		}
		
	}
}
