/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;

/**
 *
 * @author sebas
 */
public class Producto {
    public String ID;
    public String nombre;
    public String tipo;
    public double precio_unidad;
    public int stock;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(double precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Producto(String ID, String nombre, String tipo, double precio_unidad, int stock) {
        this.ID = ID;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio_unidad = precio_unidad;
        this.stock = stock;
    }

    public void cambiarPrecio() { }
    public void ajustarStock() { }
    public void agregarProducto() { }
}