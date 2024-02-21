package Controlador;
import Modelo.Cocinero;
import Modelo.Mozo;

public class ListaEmpleados {
    
    public Mozo[] empleadosMozo=new Mozo[10];
    
    
    //empleadosMozo[1]=new Mozo("James","Piñas","SJL #15",15,"785642",1); 
    //empleadosMozo[2]=new Mozo("Adrian","Romani","San Isidro 2155",50,"18962",1); 
    //empleadosMozo[3]=new Mozo("Erick","Quiñonez","Miraflores 7896",49,"78961",1); 
    Cocinero[] empleadosCocinero=new Cocinero[3];
    
    
    
    public void agregarEmpleado(Mozo mozo){
        
        int contadorMozo=0;
        if(contadorMozo<empleadosMozo.length){
            empleadosMozo[contadorMozo]=mozo;
            contadorMozo++;
        }                             
    }
    
    
    
    // Constructor que presenta error. ERRORRRRRRRRRRR
    /*public ListaEmpleados() {
        Mozo mozo1=new Mozo("A","B","C",1,"D",1); 
        this.empleadosMozo[0]=mozo1;        
    }*/
    
}