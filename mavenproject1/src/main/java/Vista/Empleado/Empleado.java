package Vista.Empleado;
import Controlador.ListaPedidos;
import javax.swing.JOptionPane;
import Vista.Empleado.Mozo.Menu_Mozo;
import Vista.Empleado.Cocinero.Menu_Cocinero;

public class Empleado {
    
    public void mostrar_menu_empleado(ListaPedidos listaPedidos) {
        
        Menu_Mozo menu_mozo = new Menu_Mozo();
        Menu_Cocinero menu_cocinero = new Menu_Cocinero();
        int opcion_t=0;
        String menu_t = """
                1. Mozo
                2. Cocinero
                3. Salir    
        """;
        do {
            String input_t = JOptionPane.showInputDialog(menu_t);
            // Si se presiona "Cancelar", establece la opción a 5
            if (input_t == null) {
                opcion_t = 3;     
            } else {
                try{ opcion_t = Integer.parseInt(input_t); } 
                    catch(Exception e){ System.out.println(e); }
            }
            switch(opcion_t){
                case 1->{
                    menu_mozo.mostrar_menu_mozo(listaPedidos);
                }
                case 2->{
                    menu_cocinero.mostrar_menu_cocinero(listaPedidos);
                }
                case 3->{
                    break;
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Coloque un número entre 1-3");
                }
            }
        } while(opcion_t!=3);
       
    }
}
