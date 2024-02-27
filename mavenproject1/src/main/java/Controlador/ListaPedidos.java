package Controlador;
import Modelo.GestorPedido;
import Modelo.Pedido;
import javax.swing.JOptionPane;
public class ListaPedidos {
    private GestorPedido gestorP = new GestorPedido(10);
    private String[] pedidosCliente = new String[10];
    private int contadorCliente;
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
    
    public void verPedidoCliente(){
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
    //Elimina una bebida o plato de la lista de pedidos del cliente x
    public void eliminarPedido(String id){
        gestorP.eliminarPedidos(id);
    }
    //Elimina todos los pedidos del cliente x
    public void eliminarPedidoCliente(){
        gestorP.eliminarPedidoCliente(); //falta añadirle el contador de cliente +1
        contadorCliente=contadorCliente+1; //opcional luego miras k pasa cuando eliminas
    }
    public void imprimirCuenta(){
        contadorCliente=contadorCliente+1;
        String header = String.format("%-10s %s \n", "Cliente", contadorCliente);
        String body = gestorP.verPedidos();
        pedidosCliente[contadorCliente-1] = header+body+"\n";
        gestorP.eliminarPedidoCliente(); //Resetea la lista de pedidos del cliente X 
    }
    public void verPedidoClientes(){
        StringBuilder menuBuilder = new StringBuilder();
        String body="";
        for (int i=0; i<contadorCliente; i++){
            body = body+pedidosCliente[i]+"\n";
            //System.out.println(pedidosCliente[i]);
        }
        menuBuilder.append(body);
        System.out.println(body);
        JOptionPane.showMessageDialog(null, menuBuilder.toString());
    }
}
