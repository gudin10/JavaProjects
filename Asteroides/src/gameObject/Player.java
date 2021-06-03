/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameObject;

import graphics.Assets;
import input.KeyBoard;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import math.Vector2d;

/**
 *
 * @author carlo
 */
public class Player extends MovingObject {
    
    private Vector2d heading;
    private AffineTransform at;
    
    private Vector2d acceleration;
    private final double ACC=0.2;//acelera la nave
    private final double DELTAANGLE=0.1;
    
    public Player(Vector2d position, Vector2d velocity,double maxVel, BufferedImage texture) {
        super(position, velocity,maxVel, texture);
        heading= new Vector2d(0,1);
        acceleration= new Vector2d();
    }

    @Override
    public void update() {
        
        if(KeyBoard.RIGHT){
            angle += DELTAANGLE;
        }
        
        if(KeyBoard.LEFT){
            angle -=DELTAANGLE;
        }
        if(KeyBoard.UP){
            acceleration=heading.scale(ACC);
        }else{
            if(velocity.getMagnitude()!=0){
                acceleration= (velocity.scale(-1).normalize()).scale(ACC/2);
            }
        }
        
        velocity=velocity.add(acceleration);
        velocity.limit(maxVel);
        heading= heading.setDirection(angle- Math.PI/2);
        
        position= position.add(velocity);
        
        if(position.getX()> 800) position.setX(0);
        
        if(position.getY()>600) position.setY(0);
        
        if(position.getX()<0) position.setX(Window.WIDTH);
        
        if(position.getY()<0) position.setY(Window.HEIGHT);
        
        
    }
    
    @Override
    public void draw(Graphics g) {
        //g.drawImage(texture, (int)position.getX(),(int)position.getY(),null);
        Graphics2D g2d= (Graphics2D)g;
        
        at=AffineTransform.getTranslateInstance(position.getX(),position.getY());
        
        at.rotate(angle,Assets.player.getWidth()/2,Assets.player.getHeight()/2);
        
        g2d.drawImage(Assets.player, at, null);
    }

    
    
}
