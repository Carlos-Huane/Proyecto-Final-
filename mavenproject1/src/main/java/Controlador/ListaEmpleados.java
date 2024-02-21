package Controlador;
import Modelo.Cocinero;
import Modelo.Mozo;

public class ListaEmpleados {
    //Al crear la clase, automaticamente asigna los datos
    private static Mozo[] empleadosMozo=new Mozo[5];
    private static Cocinero[] empleadosCocinero=new Cocinero[5];
    static {
        empleadosMozo[0] = new Mozo("Carlos","Huane","C",1,"D",1);
        empleadosMozo[1]=new Mozo("James","Piñas","SJL #15",15,"785642",1); 
        empleadosMozo[2]=new Mozo("Adrian","Romani","San Isidro 2155",50,"18962",1); 
        empleadosMozo[3]=new Mozo("Erick","Quiñonez","Miraflores 7896",49,"78961",1);
        empleadosCocinero[0] = new Cocinero("Toji", "Fushiguro", "Av. España 310", 25, "10222323", 2);
        empleadosCocinero[1] = new Cocinero("Goku", "Rex", "Av. DB", 35, "20123", 2);
    } 
    
    public void agregarEmpleado(Mozo mozo){
        //tenemos un objeto de tipo mozo, lo que quiero es agregarle al arreglo
        int contadorMozo=0;
        for (int i=0; i<empleadosMozo.length; i++) {
            System.out.println("empleado mozo->"+empleadosMozo[i]);
            if(empleadosMozo[i] !=null){contadorMozo++;}
        }
        if(contadorMozo<empleadosMozo.length){
                empleadosMozo[contadorMozo] = mozo;
        }else {
            //Aca debe mostrar en pantalla que son muchos mozos
            System.out.println("Demasiados mozos");
        }
    }
    public void agregarEmpleado(Cocinero cocinero){
        //tenemos un objeto de tipo mozo, lo que quiero es agregarle al arreglo
        int contadorCocinero=0;
        for (int i=0; i<empleadosCocinero.length; i++) {
            if(empleadosCocinero[i] !=null){ contadorCocinero++;}
        }
        if(contadorCocinero<empleadosMozo.length){
                empleadosCocinero[contadorCocinero] = cocinero;
        }else {
            //Aca debe mostrar en pantalla que son muchos mozos
            System.out.println("Demasiados cocineros");
        }
    }
    public static void verEmpleadosMozos() {
        for (int i = 0; i < empleadosMozo.length; i++){
            if (empleadosMozo[i] != null) {
                Mozo mozo = empleadosMozo[i];
                System.out.println(mozo.getNombre() + " tipo empleo: " + mozo.getTipoEmpleo());
            }
        }
    }
    public static void verEmpleadosCocineros() {
        for (int i = 0; i<empleadosCocinero.length; i++){
            if (empleadosCocinero[i] != null) {
                Cocinero cocinero = empleadosCocinero[i];
                System.out.println(cocinero.getNombre() + " tipo empleo: " + cocinero.getTipoEmpleo());
            }
        }
    }
    
    /* //Si funciona, pero para inicializar el constructor debes declarar un objeto y recien tienes la data inicial
       //Mejor lo coloco directamente en static, para que cuando se llame a la clase sin la necesidad de crear un objeto ya se hallan creado los datos (usamos el metodo static ListaEmpleados.verEmpleadosMozo();)
    // Constructor que inicializa con cierta cantidad de trabajadores
    public ListaEmpleados() {
        this.empleadosMozo[0]=new Mozo("Carlos","Huane","C",1,"D",1);        
        this.empleadosMozo[1]=new Mozo("James","Piñas","SJL #15",15,"785642",1); 
        this.empleadosMozo[2]=new Mozo("Adrian","Romani","San Isidro 2155",50,"18962",1); 
        this.empleadosMozo[3]=new Mozo("Erick","Quiñonez","Miraflores 7896",49,"78961",1);
        
        this.empleadosCocinero[0] = new Cocinero("Toji", "Fushiguro", "Av. España 310", 25, "10222323", 2);
        this.empleadosCocinero[1] = new Cocinero("Goku", "Rex", "Av. DB", 35, "20123", 2);
    }
    */
    
}