package Controlador;
import Modelo.Trabajador;
public class ListaEmpleados {
    Trabajador[] empleados;

    // Constructor
    public ListaEmpleados() {
        empleados = new Trabajador[10];
        for (int i = 0; i < 10; i++) {
            empleados[i] = new Trabajador();
            
            
            // Aquí podrías inicializar cada Trabajador con sus datos
            // empleados[i] = new Trabajador("Nombre", "Apellido", "Dirección", "Fecha", "Puesto", ...);
        }
    }
}