package Modelo;

public class Administrador {
    private String usuario, contraseña;
    
    public void registrarNuevoTrabajador(String tipo_empleo, String nombre, String apellido, String direccion, int edad, String dni){
        switch(tipo_empleo){
                    case "MOZO"->{
                        Mozo mozo=new Mozo(nombre,apellido,direccion,edad,dni,1); 
                                                
                    }
                    case "COCINERO"->{
                        Cocinero cocinero=new Cocinero(nombre,apellido,direccion,edad,dni,2); 
                                                
                    }
                    default -> {System.out.println("No existe ese trabajador");}
                }
        
    }
    public void eliminarCuentaTrabajador(){
        
    }
    public void listaEmpleados(){
        
    }
}
