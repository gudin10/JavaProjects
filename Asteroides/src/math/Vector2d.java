/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author carlo
 */
public class Vector2d {
    private double x,y;
    
    public Vector2d(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    
    public Vector2d(){
        x=0;
        y=0;
    }
    
    public Vector2d add(Vector2d v){
        return new Vector2d(x + v.getX(),y + v.getY());
    }
    
    public Vector2d scale(double value){
        return new Vector2d(x * value,y * value);
    }
    
    public void limit(double value){
        if(x>value){
            x=value;
        }
        if(x<-value){
            x=-value;
        }
        if(y>value){
            y=value;
        }
        if(y<-value){
            y=-value;
        }
    }
    
    public Vector2d normalize(){
        return new Vector2d(x/getMagnitude(),y/getMagnitude());
    }
    public double getMagnitude(){
        return Math.sqrt(x*x+y*y);
    }
    //----------------
    public Vector2d setDirection(double angle){
        return new Vector2d(Math.cos(angle)*getMagnitude(),Math.sin(angle)*getMagnitude());
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
