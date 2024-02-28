package Vista.Empleado.Mozo;
import javax.swing.JOptionPane;
import Vista.Empleado.Mozo.Menu_Mozo_Mesa;
import Controlador.ListaPedidos;
public class Menu_Mozo {
    public void mostrar_menu_mozo(ListaPedidos listaPedidos) {
        
        Menu_Mozo_Mesa menu_mozo_mesa = new Menu_Mozo_Mesa();
        int opcion_m=0;
        String menu_m = """
                1. Ver la carta
                2. Pedido
                3. Imprimir cuenta
                4. Salir
        """;
        do {
            String input_m = JOptionPane.showInputDialog(menu_m);

            if (input_m == null) {
                opcion_m = 4;     // Si se presiona "Cancelar", establece la opción a 5
            } else {
                try{ opcion_m = Integer.parseInt(input_m); } 
                    catch(Exception e){ System.out.println(e); }
            }
            switch(opcion_m){
                case 1->{
                    listaPedidos.verCarta();
                }
                case 2->{
                    menu_mozo_mesa.mostrar_menu_mozo_mesa(listaPedidos);
                }
                case 3 ->{
                    listaPedidos.imprimirCuenta(); 
                }
                case 4 -> {
                    break;
                }
                default ->{
                    JOptionPane.showMessageDialog(null, "Coloque un número entre 1-4");
                }
            }
        } while(opcion_m!=4);
    }
}
