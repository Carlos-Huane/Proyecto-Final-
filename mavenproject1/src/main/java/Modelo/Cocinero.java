package Modelo;

public class Cocinero {
    private String nombre, apellido, direccion, fechaIngreso, fechaSalida, tipoEmpleo;
    private int tipoTrabajador; // tipoTrabajador = 1--> tipoEmpleo = mozo, tipoTrabajador=2 --> tipoEmpleo = cocinero
    private int edad; 
    private String dni;
    
    public Cocinero(String nombre, String apellido, String direccion, int edad, String dni, int tipoTrabajador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        //this.fechaIngreso = fechaIngreso;
        //this.fechaSalida = fechaSalida;
        this.tipoEmpleo = tipoTrabajador==1?"Mozo": tipoTrabajador==2?"Cocinero":"Administrador";
        this.edad = edad;
        this.dni = dni;
        this.tipoTrabajador = tipoTrabajador;
    }
    
    public String getNombre()       {return nombre;}
    public String getApellido()     {return apellido;}
    public String getDireccion()    {return direccion;}
    public String getFechaIngreso() {return fechaIngreso;}
    public String getFechaSalida()  {return fechaSalida;}
    public String getTipoEmpleo()   {return tipoEmpleo;}
    public String getDni()          {return dni;}
    public int getTipoTrabajador()  {return tipoTrabajador;}
    public int getEdad()            {return edad;}
    
    public void agregarComida(){
        //agregar
    }
  
    public void elimnarComida(){
        //agregar
    }
    
    
    
    
    
    
    
    
    
}

