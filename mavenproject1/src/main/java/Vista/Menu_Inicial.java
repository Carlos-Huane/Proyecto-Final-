package Vista;
import javax.swing.JOptionPane;
import Vista.Prueba;
public class Menu_Inicial {
    public static void main (String[] args){
        Prueba menu_trabajo = new Prueba();
        int opcion;
        String menu = """
                ############################
                              Bienvenido
                ############################
                1. INICIAR COMO ADMINISTRADOR
                2. INICIAR COMO EMPLEADO
                3. LISTA DE EMPLEADOS
                4. Salir
        """;
        do {
        String input = JOptionPane.showInputDialog(menu);
        if (input == null) {
            opcion = 4;     // Si se presiona "Cancelar", establece la opción a 5
        } else {
            opcion = Integer.parseInt(input);
        }
        switch (opcion) {
            case 1 -> {
               menu_trabajo.menu_trabajador();
            }
            case 2 -> {
                System.out.println("Presione 2");
            }
            case 3 -> {
                System.out.println("Presione 3");
            }
            case 4 -> {
                break;
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Coloque un número entre 1-4");
            }
        }
        }while (opcion!=4);
    }
}
