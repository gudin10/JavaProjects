/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author carlo
 */
public class Recursividad {
    
    public static int sumarNaturalesRecursividad(int num){
        int resul;
        if(num==1)return 1;//Se termina recursion
        else{
            resul=num+sumarNaturalesRecursividad(num-1);
        }
        return resul;//Devuelve el resultado
    }
    
    public static int factorial(int num){
        int resul=0;
        if(num==1 || num==0){
        return resul=1;
        }else{
            resul=num*factorial(num-1);
            return resul;
        }
    }
    
    public static void arrayRecursivo(int [] arreglo,int pos){
        if(pos==(arreglo[pos])){
            System.out.println(arreglo[pos]);
            arrayRecursivo(arreglo, pos+1);
        }
    }
   //Funcion principal
    public static void main(String[] args){
        int n=10;
        int []n2={1,2,3,4,5};
        int resultado=factorial(n);
        arrayRecursivo(n2,3);
        //System.out.println("Resultado: "+resultado);
    }
}
