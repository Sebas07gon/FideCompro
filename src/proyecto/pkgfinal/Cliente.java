/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;

/**
 *
 * @author sebas
 */
public class Cliente implements java.io.Serializable{
    public String ID;
    public String nombre;
    public int identificacion;
    public int telefono;
    public String email;
    public String direccion;
private static final String ARCHIVO = "clientes.clientes";

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

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente(String ID, String nombre, int identificacion, int telefono, String email, String direccion) {
        this.ID = ID;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

        public String toString() {
        return "Cliente{" +
               "ID='" + ID + '\'' +
               ", nombre='" + nombre + '\'' +
               ", identificacion='" + identificacion + '\'' +
               ", telefono='" + telefono + '\'' +
               ", email='" + email + '\'' +
               ", direccion='" + direccion + '\'' +
               '}';
    }
    public void crearCliente() {
        java.util.ArrayList<Cliente> lista = leerClientes();
        int nuevoID = lista.size() + 1;
        this.ID = "C" + nuevoID;
        lista.add(this);
        guardarClientes(lista);
        javax.swing.JOptionPane.showMessageDialog(null, "Cliente creado y guardado correctamente.");
    }

    /** Actualiza los datos de un cliente existente según el ID */
    public void actualizarDatos() {
        java.util.ArrayList<Cliente> lista = leerClientes();
        boolean encontrado = false;

        for (int i = 0; i < lista.size(); i++) {
            Cliente c = lista.get(i);
            if (c.ID.equals(this.ID)) {
                lista.set(i, this); // reemplaza por el cliente actualizado
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            guardarClientes(lista);
            javax.swing.JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "No se encontró el cliente con ese ID.");
        }
    }

    /** Elimina un cliente según su ID */
    public void eliminarCliente() {
        java.util.ArrayList<Cliente> lista = leerClientes();
        boolean eliminado = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).ID.equals(this.ID)) {
                lista.remove(i);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            guardarClientes(lista);
            javax.swing.JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "No se encontró el cliente con ese ID.");
        }
    }

   

    private static java.util.ArrayList<Cliente> leerClientes() {
        java.util.ArrayList<Cliente> lista = new java.util.ArrayList<Cliente>();
        java.io.File f = new java.io.File(ARCHIVO);
        if (!f.exists()) return lista;

        java.io.ObjectInputStream ois = null;
        try {
            ois = new java.io.ObjectInputStream(new java.io.FileInputStream(f));
            Object obj = ois.readObject();
            if (obj instanceof java.util.ArrayList) {
                lista = (java.util.ArrayList<Cliente>) obj;
            }
        } catch (Exception e) {
            lista = new java.util.ArrayList<Cliente>();

        }
        return lista;
    }

    private static void guardarClientes(java.util.ArrayList<Cliente> lista) {
        java.io.ObjectOutputStream oos = null;
        try {
            oos = new java.io.ObjectOutputStream(new java.io.FileOutputStream(ARCHIVO));
            oos.writeObject(lista);
            oos.flush();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al guardar los clientes.");
        }
    }
}
