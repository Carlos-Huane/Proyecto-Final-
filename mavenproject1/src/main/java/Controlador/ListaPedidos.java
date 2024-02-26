package Controlador;
import Modelo.GestorPedido;
import Modelo.Pedido;
import javax.swing.JOptionPane;
public class ListaPedidos {
    private GestorPedido gestorP = new GestorPedido(10);
    //public ListaPedidos(int n){
        
    //}
    public void agregarPedido(String id){
        gestorP.agregarPedido(id);
    }
    public void verCarta(){ //está para modificar
            StringBuilder menuBuilder = new StringBuilder();
            String menu = gestorP.verCarta();
            JOptionPane.showMessageDialog(null, menu);
    }
    
    public void verPedidos(){
            StringBuilder menuBuilder = new StringBuilder();
            // Encabezado del menú
            menuBuilder.append(String.format("%-20s", "Código"))
                        .append(String.format("%-20s", "Nombre"))
                        .append(String.format("%-20s", "Cantidad"))
                        .append(String.format("%-20s", "Precio"))
                        .append("\n");
            String menuHeader = menuBuilder.toString();
            String menuPedidos = gestorP.verPedidos();
            JOptionPane.showMessageDialog(null, menuHeader+menuPedidos);
    }
    public void eliminarPedido(String id){
        gestorP.eliminarPedidos(id);
    }
}
