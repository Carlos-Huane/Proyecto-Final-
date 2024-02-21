/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author roman
 */
public class Mozo {
    private String nombre, apellido, direccion, fechaIngreso, fechaSalida, tipoEmpleo;
    private int edad; 
    private String dni;  
    private int tipoTrabajador; // tipoTrabajador = 1--> tipoEmpleo = mozo, tipoTrabajador=2 --> tipoEmpleo = cocinero

    public Mozo(String nombre, String apellido, String direccion, int edad, String dni, int tipoTrabajador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        //this.fechaIngreso = fechaIngreso;
        //this.fechaSalida = fechaSalida;
        //this.tipoEmpleo = tipoEmpleo;
        this.edad = edad;
        this.dni = dni;
        this.tipoTrabajador = tipoTrabajador;
    }
    
    
    
    
}

