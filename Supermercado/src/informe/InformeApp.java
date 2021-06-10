package informe;
import listaenlazadasimple.ListaEnlazada;
import main.SupermercadoApp;

/**
 *
 * @author carlo
 */
public class InformeApp {
    
    public static void main(String []args){
        ListaEnlazada<Informe> informes= new ListaEnlazada<>();
    
    //Agregamos 10 informes
        for(int i=0;i<10;i++){
            //Generar informes
            informes.insertarUltimo(new Informe(i, SupermercadoApp.generarNumeroAleatorio(0, 2)));
        }
        
        System.out.println("Primeros 10 informes agregados");
        //Mostrar los ultimos informes
        
        ListaEnlazada<Informe> aux= new ListaEnlazada<>();
        
        //Paso los datos en una lista llamada aux
        while(!informes.estaVacia()){
            aux.insertarUltimo(informes.devolverUltimo());
            informes.quitarUltimo();
            System.out.println(aux.devolverUltimo());
        }
        System.out.println("Informes Eliminados");
        
        //Agregamos 5 informes mas
        for(int i=0;i<15;i++){
            //Generar informes
            informes.insertarUltimo(new Informe(i, SupermercadoApp.generarNumeroAleatorio(0, 2)));
        }
        
        System.out.println("se Agrego 5 informes");
        
        //Mostramos los ultimos informes
        aux=new ListaEnlazada<>();
        //Mostroar
        while(!informes.estaVacia()){
            aux.insertarUltimo(informes.devolverUltimo());
            informes.quitarUltimo();
            System.out.println(aux.devolverUltimo());
        }
        
        //Dejamos informes con los datos de aux
        informes=aux;
        aux=null;//Ladejamos ennull
        
        
    }
}
