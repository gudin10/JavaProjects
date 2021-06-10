/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

/**
 *
 * @author carlo
 */
public class EcuacionsegGrado {
    
    private double a;
    private double b;
    private double c;
    
    public EcuacionsegGrado(double a,double b, double c){
        this.a=a;//Es para difetencia variable con atributo mismo nombre
        this.b=b;
        this.c=c;
    }
    
    private void obtenerRaices(){
        double x1=((-b)+Math.sqrt(getDiscriminante()))/(2*a);
        double x2=((-b)-Math.sqrt(getDiscriminante()))/(2*a);
        System.out.print("Solucion X1: ");
        System.out.println(x1);
        System.out.print("Solucion X2: ");
        System.out.println(x2+"\n");
    }
    
    private void obtenerRaiz(){
        double x=((-b)/(2*a));
        System.out.print("Solucion unica: ");
        System.out.print(x+"\n");
    }
    
    private double getDiscriminante(){//lo que va dentro de la raiz
        return (Math.pow(b,2))-(4*a*c);
    }
    
    private boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    
    private boolean tieneRaiz(){
        return getDiscriminante()==0;//como un if condensado
    }
    
    public void calcular(){
        if(tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene soluciones la ecuación");
        }
    }
}
