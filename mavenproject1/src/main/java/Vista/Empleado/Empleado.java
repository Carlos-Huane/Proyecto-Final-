package Vista.Empleado;
import javax.swing.JOptionPane;
import Vista.Empleado.Menu_Mozo;
import Vista.Empleado.Menu_Cocinero;

public class Empleado {
    
    public void mostrar_menu_empleado() {
        
        Menu_Mozo menu_mozo = new Menu_Mozo();
        Menu_Cocinero menu_cocinero = new Menu_Cocinero();
        int opcion_t;
        String menu_t = """
                1. Mozo
                2. Cocinero
                3. Salir    
        """;
        do {
            String input_t = JOptionPane.showInputDialog(menu_t);

            if (input_t == null) {
                opcion_t = 3;     // Si se presiona "Cancelar", establece la opción a 5
            } else {
                opcion_t = Integer.parseInt(input_t);
            }
            switch(opcion_t){
                case 1->{
                    menu_mozo.mostrar_menu_mozo();
                }
                case 2->{
                    menu_cocinero.mostrar_menu_cocinero();
                }
            }
        } while(opcion_t!=3);
    }
}
