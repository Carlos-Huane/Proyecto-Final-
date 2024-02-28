package Vista.Empleado.Mozo;
import javax.swing.JOptionPane;
import Controlador.ListaPedidos;
public class Menu_Mozo_Mesa {
    public void mostrar_menu_mozo_mesa(ListaPedidos listaPedidos){
        int opcion_m_mesa=0;                 //opcion menu mesa
        String menu_m_mesa = """
                1. Registar pedidos
                2. Mostrar cuenta
                3. Eliminar un plato/bebida
                4. Descartar pedido del cliente
                5. Regresar
        """;
        do {
            String input_m_mesa = JOptionPane.showInputDialog(menu_m_mesa);

            if (input_m_mesa == null) {
                opcion_m_mesa = 5;     // Si se presiona "Cancelar", establece la opción a 4
            } else {
                try{ opcion_m_mesa = Integer.parseInt(input_m_mesa);} 
                    catch(Exception e) { System.out.println(e);}
            }
            
            switch (opcion_m_mesa) {
                case 1->{
                    int opcion_pedido = 0;
                    do {
                        String input_pedido = JOptionPane.showInputDialog("Ingresar código");
                        if (input_pedido == null) {
                        opcion_pedido = 2;     // Si se presiona "Cancelar", establece la opción a 4
                        } else {
                            try{ 
                                opcion_pedido = Integer.parseInt(input_m_mesa); //Guardo el código del plato/bebida
                                listaPedidos.agregarPedido(input_pedido);
                            } catch(Exception e) { System.out.println(e);} 
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
                             try{ menu_continuar_opcion = Integer.parseInt(menu_continuar);} //almacena el valor 1 o 2 (si desea continuar o no)
                                catch(Exception e) { System.out.println(e);}   
                        } 
                        opcion_pedido = (menu_continuar_opcion==2)? 2 : 1 ; 
                        }         
                        while (opcion_pedido!=2);
                }
                case 2->{
                    listaPedidos.verPedidoCliente();
                }
                case 3-> {
                    String id = JOptionPane.showInputDialog(null, "Ingrese el código de la comida/bebida:");
                    listaPedidos.eliminarPedido(id);
                }
                case 4-> {
                    listaPedidos.eliminarPedidoCliente();
                }
                case 5-> {
                    break;
                }
                default ->{
                    JOptionPane.showMessageDialog(null, "Coloque un número entre 1-5");
                }
            }
            
        } while(opcion_m_mesa !=5);   
    }
     
}
