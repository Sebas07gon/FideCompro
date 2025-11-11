/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;

/**
 *
 * @author sebas
 */
public class Usuario {
    public String ID;
    public String nombre;
    public String email;
    public String contraseña;
    public Rol rol;

    public Usuario(String ID, String nombre, String email, String contraseña, Rol rol) {
        this.ID = ID;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.rol = rol;
    }
    
    public static Usuario[] listaUsuarios = {
    new Usuario("1", "Gabriel", "gabriel", "1111", Rol.ADMIN),
    new Usuario("2", "Bruno", "bruno", "2222", Rol.VENDEDOR),
    new Usuario("3", "Carla", "carla", "3333", Rol.CLIENTE)
};

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public static boolean iniciar_sesion(String emailIngresado, String contraseñaIngresada) {
        for (int i = 0; i < listaUsuarios.length; i++) {
            Usuario u = listaUsuarios[i];
            if (u.email.equals(emailIngresado) && u.contraseña.equals(contraseñaIngresada)) {
                return true; 
            }
        }
        return false; 
    }
    
    public void cerrar_sesion() { }
}
