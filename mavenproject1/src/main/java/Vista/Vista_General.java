package Vista;

import javax.swing.JOptionPane;
import Vista.Admin.Menu_Admin;
import Vista.Empleado.Empleado;
import Modelo.GestorPedido;
import Controlador.ListaPedidos;

public class Vista_General {
    public static void main (String[] args){
        
        Menu_Admin menu_admin = new Menu_Admin();               //Creación de la vista admin
        Empleado menu_empleado= new Vista.Empleado.Empleado();  //Creacion de la vista menu_empleado
        
        //Inicialización de los gestores y controladores 
        GestorPedido gestorPedido = new GestorPedido(10);          //Creacion del gestor pedido
        ListaPedidos listaPedidos = new ListaPedidos(gestorPedido);         //controlador listaPedidos
        
        int opcion=0;
        String menu = """
                ############################
                              Bienvenido
                ############################
                1. INICIAR COMO ADMINISTRADOR
                2. INICIAR COMO EMPLEADO
                3. Salir
        """;
        
        do {
        String input = JOptionPane.showInputDialog(menu);
        
        if (input == null) {
            opcion = 3;     // Si se presiona "Cancelar", establece la opción a 5
        } else {
            try{ opcion = Integer.parseInt(input); } 
                catch(Exception e) { System.out.println(e);}
        }
        switch (opcion) {
            case 1 -> {
                menu_admin.mostrar_menu_admin();
            }
            case 2 -> {
                menu_empleado.mostrar_menu_empleado(listaPedidos);
            }
            case 3 -> {
                break;
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Coloque un número entre 1-3");
            }
        }
        }while (opcion!=3);
    }
}
