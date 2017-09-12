package guimodule;

import processing.core.PApplet;

public class Mydisplay extends PApplet {

	public void setup(){
		size(400,400);
		background(200,200,200);
	}
	
	public void draw(){
		fill(255,255,0);
		ellipse(width/2,height/2,width-10,height-10);
		
		noFill();
		arc(width/2,height*3/5,width*2/3,height*2/3,0,PI);
		
	}
}
