package edu.aman.tech.zone.awt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Shapes {

	public void draw(Graphics g){
		Graphics2D g2=(Graphics2D) g;
		Color c=new Color(110,110,110);
		g2.setPaint(c);
		g2.fillRect(10, 20, 10, 20);
		
	}
	public static void main(String[] args) {
		

	}

}
