/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;

/**
 *
 * @author sebas
 */
public enum Rol {
    ADMIN,
    VENDEDOR,
    CLIENTE;

    public static Rol getADMIN() {
        return ADMIN;
    }

    public static Rol getVENDEDOR() {
        return VENDEDOR;
    }

    public static Rol getCLIENTE() {
        return CLIENTE;
    }
}
