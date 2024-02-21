package Modelo;

public class Trabajador {
    public String nombre;
    private String  apellido, direccion, fechaIngreso,  tipoEmpleo;
    private int tipoTrabajador, edad, dni;   // tipoTrabajador = 1--> tipoEmpleo = mozo, tipoTrabajador=2 --> tipoEmpleo = cocinero
    public Trabajador(){
        this.fechaIngreso = "10/20/2024";
    }
}
