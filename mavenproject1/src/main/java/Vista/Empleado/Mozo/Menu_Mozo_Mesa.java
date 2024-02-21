package Vista.Empleado.Mozo;
import javax.swing.JOptionPane;

public class Menu_Mozo_Mesa {
    public void mostrar_menu_mozo_mesa(){
        int opcion_m_mesa=0;                 //opcion menu mesa
        String menu_m_mesa = """
                1. Regristar el pedido
                2. Imprimir cuenta
                3. Regresar
        """;
        do {
            String input_m_mesa = JOptionPane.showInputDialog(menu_m_mesa);

            if (input_m_mesa == null) {
                opcion_m_mesa = 3;     // Si se presiona "Cancelar", establece la opción a 4
            } else {
                opcion_m_mesa = Integer.parseInt(input_m_mesa);
            }
            switch (opcion_m_mesa) {
                case 1->{
                    int opcion_pedido = 0;
                    do {
                        String input_pedido = JOptionPane.showInputDialog("Ingresar código");
                        if (input_pedido == null) {
                        opcion_pedido = 2;     // Si se presiona "Cancelar", establece la opción a 4
                        } else {
                            opcion_pedido = Integer.parseInt(input_m_mesa);
                        }
                        String menu_continuar_1 = """
                                                ¿Desea ingresar otro pedido?
                                                1. Si
                                                2. No
                                                """;
                        String menu_continuar = JOptionPane.showInputDialog(menu_continuar_1);
                        int menu_continuar_opcion = 1;
                        if (menu_continuar == null){
                            menu_continuar_opcion = 2;
                        } else {
                            menu_continuar_opcion = Integer.parseInt(menu_continuar); //almacena el valor 1 o 2 (si desea continuar o no)
                        } 
                        opcion_pedido = (menu_continuar_opcion==2)? 2 : 1 ; 
                        }         
                        while (opcion_pedido!=2);
                }
                case 2->{
                    JOptionPane.showMessageDialog(null, "Imprimiento cuenta");
                }
                case 3-> {
                    break;
                }
                default ->{
                    JOptionPane.showMessageDialog(null, "Coloque un número entre 1-3");
                }
            }
        } while(opcion_m_mesa !=3);   
    }
     
}