package Controlador;
import Modelo.GestorPedido;
import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ListaPedidos {
    //private GestorPedido gestorP = new GestorPedido(10);
    private GestorPedido gestorP;
    private String[] pedidosCliente = new String[10];
    private int contadorCliente;
    public ListaPedidos(GestorPedido gestorPedido){
        gestorP = gestorPedido;
        gestorP.eliminarArchivosIniciales(); //es un reiniciador de archivos.txt y funciona cada vez que inicia el proyecto
    }
    public void agregarPedido(String id) {
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
        //Strings para determinar si el id pertence al rango de códigos
        String[] arreglo = {"100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "110"};
        String elementoBuscado = id;
        boolean pertenece = false;
        for (int i=0; i<arreglo.length; i++){
            if(elementoBuscado.equals(arreglo[i])){
                pertenece = true;
                break;
            }
        }
        if (pertenece){
             gestorP.eliminarPedidos(id);
        } else {
            JOptionPane.showMessageDialog(null, " El código no permanece dentro 100-110");
        }
       
    }
    //Elimina todos los pedidos del cliente x
    public void eliminarPedidoCliente(){
        gestorP.eliminarPedidoCliente(); //falta añadirle el contador de cliente +1
        JOptionPane.showMessageDialog(null, "Todos los pedidos del cliente fueron eliminados");
        //contadorCliente=contadorCliente+1; //opcional luego miras k pasa cuando eliminas
        
    }
    public void imprimirCuenta(){
        if(gestorP.getContador() > 0) {
            contadorCliente=contadorCliente+1;
            String header = String.format("%-10s %s \n", "Cliente", contadorCliente);
            String nav=String.format("%-20s%-20s%-20s%-20s \n", "Código","Nombre","Cantidad","Precio");
            String body = gestorP.verPedidos();
            pedidosCliente[contadorCliente-1] = header+nav+body+"\n";
            
            //Aquí debo guardar el texto dentro de un txt en la carpeta boleta
      
            String contenido = pedidosCliente[contadorCliente-1];

            // Obtener la ruta del directorio "Boleta" dentro de "Source Package"
            String rutaDirectorio = "src/Boleta";

            // Crear el directorio si no existe
            File directorio = new File(rutaDirectorio);
            if (!directorio.exists()) {
                directorio.mkdirs();
            }

            // Definir el nombre del archivo
            String nombreArchivo = "cliente"+contadorCliente+".txt";

            // Combinar la ruta del directorio con el nombre del archivo
            String rutaArchivo = rutaDirectorio + "/" + nombreArchivo;

            // Escribir el contenido en el archivo
            try (FileWriter escritor = new FileWriter(rutaArchivo)) {
                escritor.write(contenido);
                System.out.println("Archivo guardado correctamente en: " + rutaArchivo);
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
            
            //----------------------------------------------------------------------------------
            gestorP.eliminarPedidoCliente(); //Resetea la lista de pedidos del cliente X 
            JOptionPane.showMessageDialog(null, " Imprimiendo cuenta");
        } else {
            JOptionPane.showMessageDialog(null, " No hay pedidos del cliente");
        }
        
    }
    public void verPedidoClientes(){
        if (contadorCliente>0){
            StringBuilder menuBuilder = new StringBuilder();
            String body="";
            for (int i=0; i<contadorCliente; i++){
                body = body+pedidosCliente[i]+"\n";
            }
            menuBuilder.append(body);
            System.out.println(body);
            JOptionPane.showMessageDialog(null, menuBuilder.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningun pedido solicitado");
        }
        
    }
}
