/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.DecimalFormat;

/**
 *
 * @author carlo
 */
public class Producto {
    private int cantidad;
    private int precio;
    //Contructor por defecto

    public Producto(int cantidad, int precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }
    //DEvuelve cantidad de productos
    public int getCantidad() {
        return cantidad;
    }
    //Devuelve el valor del producto
    public int getPrecio() {
        return precio;
    }
    //Se cambia el formato del precio final para tener mejor presicion
    public double precioFinal(){
        DecimalFormat df= new DecimalFormat("#,##");
        return Double.parseDouble(df.format(this.precio*this.cantidad));
    }
}
