/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import gameObject.Player;
import graphics.Assets;
import java.awt.Graphics;
import math.Vector2d;

/**
 *
 * @author carlo
 */
public class GameState {
    
    private Player player;
    
    public GameState(){
        player = new Player(new Vector2d(100, 480),new Vector2d(),5, Assets.player);
    }
    
    public void update(){
        player.update();
    }
    
    public void draw(Graphics g){
        player.draw(g);
    }
}
