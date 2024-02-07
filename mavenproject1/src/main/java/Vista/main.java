package Vista;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {
    public static void main (String[] args){
        
        int opcion;
        String menu = """
                ############################
                        VENTANA ADMINISTRADOR
                ############################
                1. REGISTRAR NUEVO TRABAJADOR
                2. ELIMINAR CUENTA TRABAJADOR
                3. LISTA DE EMPLEADOS
                4. SALIR
                """;
        do {
        String input = JOptionPane.showInputDialog(menu);
        
        if (input == null) {
                opcion = 4;     // Si se presiona "Cancelar", establece la opción a 5
        } else {
                opcion = Integer.parseInt(input);
        }
         
        switch (opcion) {
            case 1->{
        
                // Solicitar y capturar nombre
                String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");

                // Solicitar y capturar apellido
                String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido:");

                // Solicitar y capturar edad
                String edadStr = JOptionPane.showInputDialog(null, "Ingrese su edad:");
                int edad = Integer.parseInt(edadStr); // Convertir la edad a un valor entero

                // Solicitar y capturar DNI
                String dni = JOptionPane.showInputDialog(null, "Ingrese su DNI:");

                // Solicitar y capturar dirección
                String direccion = JOptionPane.showInputDialog(null, "Ingrese su dirección:");

                // Solicitar y capturar fecha de ingreso
                String fechaIngreso = "6/2/2024";

                // Mostrar los datos ingresados
                String mensaje = "CUENTA REGISTRADA CON ÉXITO"+"\n"+
                                 "Nombre: " + nombre + "\n" +
                                 "Apellido: " + apellido + "\n" +
                                 "Edad: " + edad + "\n" +
                                 "DNI: " + dni + "\n" +
                                 "Dirección: " + direccion + "\n" +
                                 "Fecha de ingreso: " + fechaIngreso;

                JOptionPane.showMessageDialog(null, mensaje);
            }
            case 2->{
                
                /*String menu_2 = """
                ############################
                SE TIENE QUE INGRESAR EL DNI 
                SE AGREGA LA FECHA DE DESPIDO           
                """;
                String input_2 = JOptionPane.showInputDialog(menu_2);*/
                
                // Solicitar y capturar DNI
                String dni = JOptionPane.showInputDialog(null, "Ingrese su DNI:");
                JOptionPane.showMessageDialog(null, dni+" eliminado del sistema");
            }
            case 3->{
                String menu_3 = """
                ############################
                NOMBRE, EDAD, DNI, DIRECCIÓN, FECHA DE INGRESO. FECHA DE DESPIDO (cuando elimino un trabajador) 
                ############################
                """;
                String input_3 = JOptionPane.showInputDialog(menu_3);
            }
            case 4 -> {
                break;
            }
            default -> System.out.println("Ingresa un número correcto");
        }
        } while(opcion!=4);
    }
}