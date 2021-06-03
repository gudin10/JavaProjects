

/**
 *
 * @author carlos
 */
public class Palindrome {
    public static void main(String[] args){
        String palabra="oso";
        
        System.out.println("Su palabra"+palabra+"es palindrome: "+Palindrome(palabra));
        
        int num=5;
        
        Numeros();
    }
    //Punto 5
    public static boolean Palindrome(String palabra){
        palabra= palabra.toLowerCase();
        
        for (int i = 0,j=palabra.length()-1;i<=j; i++,j--) {
            if(palabra.charAt(i)!=palabra.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static int Hacer(int valor){
        if(valor<3){
            return valor;
        }
        
        return Hacer(valor-1)*Hacer(valor-2);
    }
    //Punto 7
    public static int Division(int num1,int num2,int division){
        division= num1/num2;
        return division;
    }
    //Punto 8 
    public static void Numeros(){
        System.out.println("***");
        System.out.println("Numeros del 1 al 100");
        int mul3,mul5;
        String F="Fizz";
        String B="Buzz";
        for (int i = 1; i <= 100; i++) {
            if((i%3)==0&&(i%5)==0){
                System.out.println("FizzBuzz");
            }else if((i%3)==0){
                System.out.println("Fizz");
                
            }else if((i%5)==0){
                System.out.println("Buzz");
                
            }
            else{
            System.out.println(i);
            }
        }
    }
}
