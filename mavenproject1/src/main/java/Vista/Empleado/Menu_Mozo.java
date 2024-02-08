package Vista.Empleado;
import javax.swing.JOptionPane;
public class Menu_Mozo {
    public void mostrar_menu_mozo() {
        int opcion_m;
        String menu_m = """
                1. Ver la carta
                2. Ingresar la mesa
                3. Extra: Eliminar pedido
                4. Salir
        """;
        do {
            String input_m = JOptionPane.showInputDialog(menu_m);

            if (input_m == null) {
                opcion_m = 4;     // Si se presiona "Cancelar", establece la opción a 5
            } else {
                opcion_m = Integer.parseInt(input_m);
            }
            switch(opcion_m){
                case 1->{
                    System.out.println("ingrese mozo 1");
                }
                case 2->{
                    System.out.println("Ingrese cocinero 2");
                }
                case 3 ->{
                    System.out.println("Ingreso extra");
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
