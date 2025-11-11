/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;

/**
 *
 * @author sebas
 */
public class DetalleFactura {
    public Producto producto;
    public int cantidad;
    public double precioUnitario;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getTotal_unitario() {
        return total_unitario;
    }

    public void setTotal_unitario(double total_unitario) {
        this.total_unitario = total_unitario;
    }

    public DetalleFactura(Producto producto, int cantidad, double precioUnitario, double total_unitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total_unitario = total_unitario;
    }
    public double total_unitario;

    public void cambiarPrecio() { }
    public void ajustarStock() { }
    public void agregarProducto() { }
}
