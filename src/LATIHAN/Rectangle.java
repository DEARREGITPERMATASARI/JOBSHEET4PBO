/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN;

/**
 *the rectangle class, subclass of Shape
 * @author Nita
 */
public class Rectangle extends Shape {
    //private member variables
    private int lenght;
    private int width;
    
    //constructor
    public Rectangle (String color, int lenght, int width) {
        super(color);
        this.lenght = lenght;
        this.width = width;        
    }
    @Override
    public String toString() {
        return "Rectangle[lenght=" + lenght + ",width=" +width + "," + super.toString() +"]" ;      
    }
    //Override the inherited getArea() to provide the proper implementation
    @Override
    public double getArea() {
        return lenght*width;
    }


public class Triangle extends Shape {
    //private member variables
    private int base;
    private int height;
    
    //Constructor
    public Triangle (String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Triangle[base=" +base+ ",height=" +height+ "," +super.toString() + "]";
    }
    //Override the inherited getArea()
    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}
}


 
    

