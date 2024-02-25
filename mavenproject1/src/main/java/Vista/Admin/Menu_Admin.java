package Vista.Admin;
import javax.swing.JOptionPane;
import Controlador.ListaEmpleados;

public class Menu_Admin {
    public void mostrar_menu_admin(){
       
        ListaEmpleados listaEmpleados = new ListaEmpleados();
        
        int opcion_admin;
        String menu_admin = """
                ############################
                        VENTANA ADMINISTRADOR
                ############################
                1. REGISTRAR NUEVO TRABAJADOR
                2. ELIMINAR CUENTA TRABAJADOR
                3. LISTA DE EMPLEADOS
                4. SALIR
                """;
        do {
        String input_admin = JOptionPane.showInputDialog(menu_admin);
        
        if (input_admin == null) {
                opcion_admin = 4;     // Si se presiona "Cancelar", establece la opción a 5
        } else {
                opcion_admin = Integer.parseInt(input_admin);
        }
         
        switch (opcion_admin) {
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

                // Solicitar y capturar tipo de empleo
                String tipo_empleo = JOptionPane.showInputDialog(null, "Ingrese el tipo de empleo");
                tipo_empleo=tipo_empleo.toUpperCase();
                
                // Solicitar y capturar fecha de ingreso
                String fechaIngreso = "6/2/2024";

                // aquí estamos llamando al método establecido en la clase Administrador. Para ello, se instanció previamente la clase.
                //admin.registrarNuevoTrabajador(tipo_empleo, nombre, apellido, direccion, edad, dni);
                listaEmpleados.agregarEmpleado(tipo_empleo, nombre, apellido, direccion, edad, dni);
                // Mostrar los datos ingresados
                String mensaje = "CUENTA REGISTRADA CON ÉXITO"+"\n"+
                                 "Nombre: " + nombre + "\n" +
                                 "Apellido: " + apellido + "\n" +
                                 "Edad: " + edad + "\n" +
                                 "DNI: " + dni + "\n" +
                                 "Dirección: " + direccion + "\n" +
                                 "Fecha de ingreso: " + fechaIngreso + "\n" +
                                 "Tipo de empleo: " + tipo_empleo;

                JOptionPane.showMessageDialog(null, mensaje);
            }
            case 2->{
                String dni = JOptionPane.showInputDialog(null, "Ingrese su DNI:");
                listaEmpleados.eliminarTrabajador(dni); //si dni no está en la lista de empleados
                JOptionPane.showMessageDialog(null, dni+" eliminado del sistema");
            }
            case 3->{
                listaEmpleados.mostrarEmpleados();
                System.out.println("-----------------------");
            }
            case 4 -> {
                break;
            }
            default -> JOptionPane.showMessageDialog(null, "Coloque un número entre 1-4");
        }
        } while(opcion_admin!=4);
    }
}