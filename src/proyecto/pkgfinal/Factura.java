/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;

/**
 *
 * @author sebas
 */
public class Factura {
    public String ID;
    public java.util.Date fecha;
    public Cliente cliente;
    public Usuario Usr;
    public java.util.List<DetalleFactura> items;
    public double subtotal;
    public double impuesto;
    public double total;

    public void agregarItems() { }
    public void calcularTotales() { }
    public void generarFactura() { }

    public Factura(String ID, java.util.Date fecha, Cliente cliente, Usuario Usr,
                   java.util.List<DetalleFactura> items, double subtotal,
                   double impuesto, double total) {
        
    }
    public java.util.List<DetalleFactura> getItems() {
        return items;
    }

    public void setItems(java.util.List<DetalleFactura> items) {
        this.items = items;
    }

    public java.util.Date getFecha() {
        return fecha;
    }

    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }

 
}

