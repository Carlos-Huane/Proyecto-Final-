package Modelo;
import Modelo.Mozo;
import javax.swing.JOptionPane;
public class GestorMozo {
    private Mozo[] mozos;
    private int contador;
    
    public GestorMozo(int cantidad) {
        mozos = new Mozo[cantidad];
        contador = 0;
        for (int i=0; i<mozos.length; i++){
            if(mozos[i]!=null) {
                contador++;
            }
        }
    }
    public void agregarMozo(Mozo mozo){
        if(contador<mozos.length) {
            mozos[contador] = mozo;
            contador++;
        } else {
            System.out.println("No se pueden agregar más mozos");
        }
    }
    public void eliminarMozo(String dni){
        for(int i=0; i<contador; i++){
            if(mozos[i].getDni().equals(dni)){
                mozos[i] = mozos[contador-1]; //El actual lo igual al último elemento
                mozos[contador-1] = null; //El último elemento lo eliminas
                contador--;
                break;
            }
        }
    }
    
    public String verEmpleadosMozos() {
        StringBuilder menuBuilder = new StringBuilder();
        
        // Agregar los datos de los mozos al menú
        for (int i = 0; i < mozos.length; i++) {
            if (mozos[i] != null) {
                Mozo mozo = mozos[i];
                menuBuilder.append(String.format("%-20s",mozo.getNombre()))
                            .append(String.format("%-20s",mozo.getApellido()))
                            .append(String.format("%-20s",mozo.getEdad()))
                            .append(String.format("%-20s",mozo.getDni()))
                            .append(String.format("%-20s",mozo.getDireccion()))
                            .append(String.format("%-20s",mozo.getFechaIngreso()))
                            .append(String.format("%-20s",mozo.getTipoEmpleo())).append("\n");
            }
        }

        // Construir el menú con un formato mejorado
        String menu = menuBuilder.toString();
        return menu;
    }
}
