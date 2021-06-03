/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameObject;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import math.Vector2d;

/**
 *
 * @author carlo
 */
public abstract class MovingObject extends GameObject{
    
    protected Vector2d velocity;
    protected AffineTransform at;
    protected double angle;
    protected double maxVel;
    
    
    public MovingObject(Vector2d position,Vector2d velocity,double maxVel, BufferedImage texture) {
        super(position, texture);
        this.velocity=velocity;
        this.maxVel=maxVel;
        angle=0;
        
        
    }
    
    
    
}
