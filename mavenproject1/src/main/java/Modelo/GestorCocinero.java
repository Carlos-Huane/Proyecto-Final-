package Modelo;
import Modelo.Cocinero;
public class GestorCocinero {
    private Cocinero[] cocineros;
    private int contador;
    
     public GestorCocinero(int cantidad) {
        cocineros = new Cocinero[cantidad];
        contador = 0;
        
        for (int i=0; i<cocineros.length; i++){
            if(cocineros[i]!=null) {
                contador++;
            }
        }
        
    }
    public void agregarCocinero(Cocinero cocinero){
        if(contador<cocineros.length) {
            cocineros[contador] = cocinero;
            contador++;
        } else {
            System.out.println("No se pueden agregar más cocineros");
        }
    }
    public void eliminarCocinero(String dni){
        for(int i=0; i<contador; i++){
            if(cocineros[i].getDni().equals(dni)){
                cocineros[i] = cocineros[contador-1]; //El actual lo igual al último elemento
                cocineros[contador-1] = null; //El último elemento lo eliminas
                contador--;
                break;
            }
        }
    }
    public String verEmpleadosCocineros() {
        StringBuilder menuBuilder = new StringBuilder();
    
        // Agregar los datos de los mozos al menú
        for (int i = 0; i < cocineros.length; i++) {
            if (cocineros[i] != null) {
                Cocinero cocinero = cocineros[i];
                menuBuilder.append(String.format("%-20s",cocinero.getNombre()))
                            .append(String.format("%-20s",cocinero.getApellido()))
                            .append(String.format("%-20s",cocinero.getEdad()))
                            .append(String.format("%-20s",cocinero.getDni()))
                            .append(String.format("%-20s",cocinero.getDireccion()))
                            .append(String.format("%-20s",cocinero.getFechaIngreso()))
                            .append(String.format("%-20s",cocinero.getTipoEmpleo())).append("\n");
            }
        }

        // Construir el menú con un formato mejorado
        String menu = menuBuilder.toString();
     
        return menu;
    }
}

