package Controlador;
import Modelo.GestorMozo;
import Modelo.Mozo;
import Modelo.GestorCocinero;
import Modelo.Cocinero;
import javax.swing.JOptionPane;

public class ListaEmpleados {
    private GestorMozo gestorM = new GestorMozo(10);
    private GestorCocinero gestorC = new GestorCocinero(10);
    public ListaEmpleados(){
        gestorM.agregarMozo(new Mozo("Carlos","Huane","Comas",1,"72180433",1));
        gestorM.agregarMozo(new Mozo("James","Piñas","SJL #15",15,"785642",1));
        gestorM.agregarMozo(new Mozo("Adrian","Romani","San Isidro 2155",50,"18962",1));
        gestorM.agregarMozo(new Mozo("Erick","Quiñonez","Miraflores 7896",49,"78961",1));
        gestorC.agregarCocinero(new Cocinero("Toji", "Fushiguro", "Av. España 310", 25, "10222323", 2));
        gestorC.agregarCocinero(new Cocinero("Goku", "Rex", "Av. DB", 35, "20123", 2));
    }
    /*
    public ListaEmpleados1(GestorMozo gestorMozo){
        this.gestorM = gestorMozo;
    }
    */
    public void agregarEmpleado(String tipo_empleo, String nombre, String apellido, String direccion, int edad, String dni){
        switch(tipo_empleo){
                    case "MOZO"->{
                        Mozo mozo=new Mozo(nombre,apellido,direccion,edad,dni,1);                 
                        gestorM.agregarMozo(mozo);
                    }
                    
                    case "COCINERO"->{
                        Cocinero cocinero=new Cocinero(nombre,apellido,direccion,edad,dni,2); 
                        gestorC.agregarCocinero(cocinero); 
                    }
                    default -> {System.out.println("No existe ese trabajador");}
                }
    }
    public void eliminarTrabajador(String dni){
        gestorM.eliminarMozo(dni);
        gestorC.eliminarCocinero(dni);
    }
    public void mostrarMozos(){
        gestorM.verEmpleadosMozos();
    }
    public void mostrarCocineros(){
        gestorC.verEmpleadosCocineros();
    }
    public void mostrarEmpleados(){
        StringBuilder menuBuilder = new StringBuilder();

        // Encabezado del menú
        menuBuilder.append(String.format("%-17s", "Nombre"))
                    .append(String.format("%-20s", "Apellido"))
                    .append(String.format("%-20s", "Edad"))
                    .append(String.format("%-20s", "Dni"))
                    .append(String.format("%-20s", "Dirección"))
                    .append(String.format("%-20s", "Fecha de ingreso"))
                    .append(String.format("%-20s", "Cargo"))
                    .append("\n");
        String menuHeader = menuBuilder.toString();
        String menuMozos = gestorM.verEmpleadosMozos();
        String menuCocineros = gestorC.verEmpleadosCocineros();
        JOptionPane.showMessageDialog(null, menuHeader+menuMozos+menuCocineros);
       
        
    }
        
}
