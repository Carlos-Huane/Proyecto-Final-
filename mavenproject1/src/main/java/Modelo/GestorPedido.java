package Modelo;
import Modelo.Pedido;
public class GestorPedido {
    private Pedido[] pedidos;
    private int contador;
    public GestorPedido(int n){
        pedidos = new Pedido[10];
        contador = 0;
    }
    public void agregarPedido(String id){
        System.out.println("estoy en gestor pedido");
        Pedido pedido = new Pedido(id);
        if (pedido.getNombrePedido()!=null){
            if (contador<pedidos.length){
            for(int i=0; i<contador; i++){
                if(pedidos[i].getNombrePedido()==(pedido.getNombrePedido())){
                    int cantidadPedido= pedido.getCantidad()+1;
                    pedido.setCantidad(cantidadPedido);
                    break;
                }
            }
            pedidos[contador] = pedido;
            contador++;
            } else {
                System.out.println("Exceso de pedidos");
            }
           
        }
        
    }
    public String verPedidos(){
        StringBuilder menuBuilder = new StringBuilder();
        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i] != null) {
                Pedido pedido = pedidos[i];
                menuBuilder.append(String.format("%-20s",pedido.getId()))
                            .append(String.format("%-20s",pedido.getNombrePedido()))
                            .append(String.format("%-20s",pedido.getCantidad()))
                            .append(String.format("%-20s",pedido.getPrecio()*pedido.getCantidad())).append("\n");;
            }
        }
        // Construir el menú con un formato mejorado
        String menu = menuBuilder.toString();
        
        return menu;
    }
    
}
