/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import graphics.Assets;
import input.KeyBoard;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import states.GameState;

/**
 *
 * @author carlo
 */
public class Window extends JFrame implements Runnable{
    
    public static final int WIDTH=800,HEIGHT=600;
    private Canvas canvas;//crear el canvas
    private Thread thread;
    
    private BufferStrategy bs;
    private Graphics g;
    
    private final int FPS=60;//final es constante , fotogramas
    private double TAGETTIME=1000000000/FPS;
    private double delta=0;//tiempo temporal
    private int AVERAGEFPS=FPS;
    
    private GameState gameState;
    private KeyBoard keyBoard;
    
    private boolean running=false;
    public Window(){
        
        setTitle("Space Asteroids");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//venta se pueda cerrar
        setResizable(false);//no se redimencione en ejecucion
        setLocationRelativeTo(null);
        
        setVisible(true);
        
        canvas= new Canvas();
        
        keyBoard=new KeyBoard();
        
        canvas.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH,HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH,HEIGHT));
        
        canvas.setFocusable(true);//Entradas para teclado
        
        add(canvas);
        canvas.addKeyListener(keyBoard);
    }
    public static void main(String[] args){
        new Window().start();
    }
    
    private void init(){
        Assets.init();
        gameState = new GameState();
    }
    @Override
    public void run() {
        long now = 0;
        long lastTime = System.nanoTime();//Hora actual del sistema en nano seg
        int frames=0;
        long time=0;
        
        init();
        while(running){
            now=System.nanoTime();
            delta+=(now -lastTime)/TAGETTIME;
            time +=(now -lastTime);
            lastTime= now;
            
            
            if(delta>=1){
                update();
                draw();
                delta--;
                frames++;
                
            }
            if(time>=1000000000){
                AVERAGEFPS =frames;
                frames=0;
                time =0;
            }
        }
        stop();
    }
    //actualizar
    int x=0;
    private void update(){
        keyBoard.update();
        gameState.update();
        //x++;
    }
    //dibijar
    private void draw(){
        bs=canvas.getBufferStrategy();
        if(bs==null){
            canvas.createBufferStrategy(3);
            return;
        }
        
        g=bs.getDrawGraphics();
        //.....................ahi ya se va a dibujar
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        gameState.draw(g);
        //g.drawImage(Assets.player, 0, 0, null);
        g.drawString(""+AVERAGEFPS, 10,10);
        //---------termina
        g.dispose();
        bs.show();
    }
    
    private void start(){
        thread= new Thread(this);
        thread.start();
        running=true;
    }
    
    private void stop(){
        
        try {
            thread.join();
            running=false;
        } catch (InterruptedException ex) {
            //ex.printStackTrace();
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
