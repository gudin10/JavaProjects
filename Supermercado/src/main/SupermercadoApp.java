/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author carlo
 */
public class SupermercadoApp {
    
    public static void generarProductos(ArrayList<Producto> lista){
        int numeroPersonas=generarNumeroAleatorio(1,8);
        
        int cantidad;
        double precio;
        
        for(int i=0;i<numeroPersonas;i++){
            cantidad=generarNumeroAleatorio(1, 10);
            precio=generarNumeroRealAleatorio(0.05, 50);
            lista.add(new Producto(cantidad, (int)precio));
        }
    }
    public static int generarNumeroAleatorio(int min,int max){
        int num=(int)Math.floor(Math.random()*(min-(max+1))+(max+1));
        return num;
    }
    //Generar numeros aleatorios entre un rango de min-max
    public static double generarNumeroRealAleatorio(double min,double max){
        double num=Math.rint(Math.floor(Math.random()*(min-((max*100)+1))+((max*100)+1)))/100;
        return num;
    }
    public static void main(String[] args){
        //Creamos una lista de productos
        ArrayList<Producto> productos = new ArrayList<>();
        
        //Generamos la cola
        generarProductos(productos);
        
        //Declaramos variables
        String ticket="N°Producto***Cantidad**Precio**Total"+"\n";
        double precioTotal=0;
        Producto productoActual;
        
        Iterator<Producto> it= productos.iterator();
        
        for(int i=0;it.hasNext();i++){
            productoActual=it.next();
            precioTotal+=productoActual.precioFinal();
            ticket+="Producto"+(i+1)+"\t"+productoActual.getCantidad()+
                    "\t"+productoActual.getPrecio()
                    +"\t"+productoActual.precioFinal()+"\n";
        }
        ticket+="Precio Final"+"\t\t\t"+precioTotal;
        
        System.out.println(ticket);
        
    }
}
