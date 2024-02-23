package Modelo;
import Controlador.ListaEmpleados;
public class Administrador {
    private String usuario, contraseña;
    
    public void registrarNuevoTrabajador(String tipo_empleo, String nombre, String apellido, String direccion, int edad, String dni){
        ListaEmpleados empleado = new ListaEmpleados();
        switch(tipo_empleo){
                    case "MOZO"->{
                        //Mozo mozo=new Mozo(nombre,apellido,direccion,edad,dni,1);                 
                        empleado.agregarEmpleado(tipo_empleo, nombre, apellido, direccion, edad, dni);
                    }
                    case "COCINERO"->{
                        //Cocinero cocinero=new Cocinero(nombre,apellido,direccion,edad,dni,2); 
                        //empleado.agregarCocinero()
                        empleado.agregarEmpleado(tipo_empleo, nombre, apellido, direccion, edad, dni); 
                    }
                    default -> {System.out.println("No existe ese trabajador");}
                }
        
    }
    public void eliminarCuentaTrabajador(){
        
    }
    public void listaEmpleados(){
        
    }
}
