/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameObject;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import math.Vector2d;

/**
 *
 * @author carlo
 */
public abstract class GameObject {
    protected BufferedImage texture;
    protected Vector2d position;
    
    public GameObject(Vector2d position, BufferedImage texture){
        this.position=position;
        this.texture= texture;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);//Si es abstract no tiene cuerpo

    public Vector2d getPosition() {
        return position;
    }

    public void setPosition(Vector2d position) {
        this.position = position;
    }
    
    
}
