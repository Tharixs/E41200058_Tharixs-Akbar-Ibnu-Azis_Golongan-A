/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class DrawShapes extends Applet{
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    @Override
    public void init(){
    // the font is arial size, 18 and is italicized
    font = new Font("Arial",Font.ITALIC,18);
    
    //some colors are predefined in the Color class
    redColor = Color.red;
    backgroundColor = Color.ORANGE;
    
    //Color can be created using Red, Green, Blue, Values
    blueColor = new Color(0,0,122);
    
    //she the bacgkround Color of the applet
    setBackground(backgroundColor);
    }
    @Override
    public void stop(){
        
    }
    // the method pants the shapes to the screen
    @Override
    public void paint(Graphics graph){
    //set fon
    graph.setFont(font);
    //create a tittle
    graph.drawString("Draw Shapes", 90, 50);
    //set the coler for the first shape
    graph.drawRect(120, 120, 120, 120);
    //this will fill a rectangle
    graph.setColor(redColor);
    //Draw a circle using drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
    graph.fillArc(110, 110, 50, 50, 0, 360);
    //Set color for next shape
    graph.setColor(Color.CYAN);
    //draw another rectangle
    graph.drawRect(50, 50, 50, 50);
    //this will fill a rectangle
    graph.fillRect(50, 50, 60, 60);     
    
    }
}
