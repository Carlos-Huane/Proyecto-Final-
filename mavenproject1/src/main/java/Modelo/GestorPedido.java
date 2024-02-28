package Modelo;
import Modelo.Pedido;
import java.io.File;
import javax.swing.JOptionPane;
public class GestorPedido {
    private Pedido[] pedidos;
    private int contador;
    public GestorPedido(int n){
        pedidos = new Pedido[10];
        contador = 0;
    }
    //Agrega un plato/bebida al pedido del cliente
    public void agregarPedido(String id){
        Pedido pedido = new Pedido(id);
        if (pedido.getNombrePedido()!=null){
            if (contador<pedidos.length){
            for(int i=0; i<contador; i++){
                if(pedidos[i].getNombrePedido()==(pedido.getNombrePedido())){
                    int cantidadPedido= pedidos[i].getCantidad()+1;
                    pedidos[i].setCantidad(cantidadPedido);
                    return;
                }
            }
            pedidos[contador] = pedido;
            contador++;
            } else {
                System.out.println("Exceso de pedidos");
            }
           
        }
        
    }
    //Elimina un plato/bebida del pedido del cliente
    public void eliminarPedidos(String id){
        boolean platoEncontrado = false;
        for(int i=0; i<contador; i++) {
            if (pedidos[i].getId().equals(id)){
                pedidos[i]=pedidos[contador-1];
                pedidos[contador-1] = null;
                contador--;
                platoEncontrado=true;
            }    
        }
        if(platoEncontrado==true){
            JOptionPane.showMessageDialog(null, "código: "+id+" eliminado");
        }else {
            //Esto ejecuta cuando no se encuentra el id dentro del sistema
            JOptionPane.showMessageDialog(null, " No se ha registrado ningun plato con el código: "+id);
        }
    }
    //Elimina todos los pedidos del cliente
    public void eliminarPedidoCliente(){
        for(int i=0; i<contador; i++){
            pedidos[i]=null;
        }
        contador=0;
    }
    //Ver los pedidos de un cliente
    public String verPedidos(){
        double total=0;
        StringBuilder menuBuilder = new StringBuilder();
        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i] != null) {
                Pedido pedido = pedidos[i];
                total = total + pedido.getPrecio()*pedido.getCantidad();
                menuBuilder.append(String.format("%-20s",pedido.getId()))
                            .append(String.format("%-20s",pedido.getNombrePedido()))
                            .append(String.format("%-20s",pedido.getCantidad()))
                            .append(String.format("$ %-20s",pedido.getPrecio()*pedido.getCantidad())).append("\n");
            }
        }
        // Construir el menú con un formato mejorado
        menuBuilder.append(String.format("%-70s $ %-10s", "Total:", total));
        String menu = menuBuilder.toString();
        return menu;
    }
    //Ver la carta de todos los productos
    public String verCarta(){
        StringBuilder menuBuilder = new StringBuilder();
        menuBuilder.append(String.format("%-20s %-20s %-20s \n", "Id","Pedido","Precio"))
                    .append(String.format("%-18s %-20s %-20s \n", "100","Pollo a la braza","$ 14.5"))
                    .append(String.format("%-18s %-20s %-20s \n", "101","Chaufa","$ 10.0"))
                    .append(String.format("%-18s %-20s %-20s \n", "102","Causa","$ 7.0"))
                    .append(String.format("%-18s %-20s %-20s \n", "103","Arroz con pollo","$ 7.0"))
                    .append(String.format("%-18s %-20s %-20s \n", "104","Caldo de gallina","$ 12.0"))
                    .append(String.format("%-18s %-20s %-20s \n", "105","Pollo Broster","$ 15.0"))
                    .append(String.format("%-18s %-20s %-20s \n", "106","Coca Cola","$ 3.0"))
                    .append(String.format("%-18s %-20s %-20s \n", "107","Pepsi","$ 2.5"))
                    .append(String.format("%-18s %-20s %-20s \n", "108","Jugo de Papaya","$ 5.0"))
                    .append(String.format("%-18s %-20s %-20s \n", "109","Limonada","$ 2.0"))
                    .append(String.format("%-18s %-20s %-20s \n", "110","Tallarines Rojos","$ 12.0"));
        String menu = menuBuilder.toString();
        return menu;
    }
    public int getContador(){
        return contador;
    }
    public void eliminarArchivosIniciales(){
        // Definir la ruta de la carpeta "Boleta"
        String rutaCarpeta = "src/Boleta";

        // Crear un objeto File que represente la carpeta "Boleta"
        File carpeta = new File(rutaCarpeta);

        // Verificar si la ruta corresponde a una carpeta
        if (carpeta.isDirectory()) {
            // Obtener la lista de archivos en la carpeta
            File[] archivos = carpeta.listFiles();

            // Iterar sobre la lista de archivos
            if (archivos != null) {
                for (File archivo : archivos) {
                    // Verificar si el archivo es un archivo de texto (.txt)
                    if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".txt")) {
                        // Eliminar el archivo
                        if (archivo.delete()) {
                            System.out.println("Se eliminó el archivo: " + archivo.getName());
                        } else {
                            System.out.println("No se pudo eliminar el archivo: " + archivo.getName());
                        }
                    }
                }
            }
        } else {
            System.out.println("La ruta especificada no corresponde a una carpeta.");
        }
    }
}
