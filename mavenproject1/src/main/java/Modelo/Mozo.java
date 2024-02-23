package Modelo;

public class Mozo {
    private String nombre, apellido, direccion, fechaIngreso, fechaSalida, tipoEmpleo;
    private int edad; 
    private String dni;  
    private int tipoTrabajador; // tipoTrabajador = 1--> tipoEmpleo = mozo, tipoTrabajador=2 --> tipoEmpleo = cocinero

    public Mozo(String nombre, String apellido, String direccion, int edad, String dni, int tipoTrabajador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaIngreso = this.nombre=="Carlos"|this.nombre=="Adrian"|this.nombre=="James"|this.nombre=="Erick"? "10/11/2018": "Recien entró";
        //this.fechaSalida = fechaSalida;
        this.tipoEmpleo = tipoTrabajador==1?"Mozo": tipoTrabajador==2?"Cocinero":"Administrador";
        this.edad = edad;
        this.dni = dni;
        this.tipoTrabajador = tipoTrabajador;
    }
    
    public String getNombre()       {return this.nombre;}
    public String getApellido()     {return this.apellido;}
    public String getDireccion()    {return this.direccion;}
    public String getFechaIngreso() {return this.fechaIngreso;}
    public String getFechaSalida()  {return this.fechaSalida;}
    public String getTipoEmpleo()   {return this.tipoEmpleo;}
    public String getDni()          {return this.dni;}
    public int getEdad()            {return this.edad;}
    public int getTipoTrabajador()  {return this.tipoTrabajador;}
    
    public void setFechaIngreso(String fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
}

