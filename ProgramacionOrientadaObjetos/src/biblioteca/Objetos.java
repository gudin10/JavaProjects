/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author carlo
 */
public class Objetos {
    
    public static void main(String []args){
        
        Libro libro1=new Libro(111111, "La Iliada", "Homero", 100);
        Libro libro2=new Libro(111112, "La Odisea", "Homero", 230);
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        libro1.setNpaginas(300);
        
        System.out.println("*********************");
        if(libro1.getNpaginas()>libro2.getNpaginas()){
            System.out.println(libro1.getTitulo()+" Tiene más páginas");
        }else{
            System.out.println(libro2.getTitulo()+" Tiene más páginas");
        }
    }
}
