package Vista.Empleado.Cocinero;
import Controlador.ListaPedidos;
import javax.swing.JOptionPane;

public class Menu_Cocinero {
    public void mostrar_menu_cocinero (ListaPedidos listaPedidos) {
        int opcion_c = 1;
        String menu_c = """
                            Mozo
                            1.Ver todos los pedidos
                            2.Salir
                            """;
        do {
            String input_c = JOptionPane.showInputDialog(menu_c);
            

            if (input_c == null) {
                opcion_c = 2;     // Si se presiona "Cancelar", establece la opción a 5
            } else {
                try{ opcion_c = Integer.parseInt(input_c); } 
                    catch(Exception e){ System.out.println(e); }
            }
            switch (opcion_c) {
                case 1->{
                    listaPedidos.verPedidoClientes();
                }
                case 2->{
                    break;
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Coloque un número entre 1-2");
                }
            }
        } while (opcion_c!= 2);
    }
}
