package Modelo;

import javax.swing.JOptionPane;

public class Pedido {
    private String id, nombrePedido;
    private double precio;
    private int cantidad=1;
    
    public String getId()           {return id;}
    public String getNombrePedido() {return nombrePedido;}
    public int getCantidad()        {return cantidad;}
    public double getPrecio()       {return precio;}
    public void setId(String id)    {this.id = id;}
    public void setNombrePedido(String nombrePedido) {this.nombrePedido = nombrePedido;}
    public void setPrecio(double precio)  {this.precio = precio;}
    public void setCantidad(int cantidad) { this.cantidad = cantidad;}

    public Pedido(String id){
        System.out.println("estoy en gestor mozooo");
        switch(id){
            case "100"->{
                this.id="100";
                nombrePedido="Pollo a la braza";
                precio= 14.5;
            }
            case "101"->{
                this.id="101";
                nombrePedido="Chaufa";
                precio=10;
            }
            case "102"->{
                this.id="102";
                nombrePedido="Causa";
                precio=7;
            }
            case "103"->{
                this.id="103";
                nombrePedido="Arroz con pollo";
                precio=12;
            }
            case "104"->{
                this.id="104";
                nombrePedido="Caldo de gallina";
                precio=12;
            }
            case "105"->{
                this.id="105";
                nombrePedido="Pollo Broster";
                precio=15;
            }
            case "106"->{
                this.id="106";
                nombrePedido="Coca Cola";
                precio=3;
            }
            case "107"->{
                this.id="107";
                nombrePedido="Pepsi";
                precio=2.5;
            }
            case "108"->{
                this.id="108";
                nombrePedido="Jugo de papaya";
                precio=5;
            }
            case "109"->{
                this.id="109";
                nombrePedido="Limonada";
                precio=2;
            }
            case "110"->{
                this.id="110";
                nombrePedido="Tallarines rojos";
                precio=12;
            }
            default->{
                
            }
        }
    }
    
}
