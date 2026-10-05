/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10_cesar;

/**
 *
 * @author laboratorioasu
 */
public class Personas {
    protected String nombre;
    protected String cedula; 
    protected String cel; 
    protected String email; 
    
    public Personas(String nombre, String cedula, String cel, String email ){
        this.nombre= nombre;
        this.cedula= cedula;
        this.cel= cel;
        this.email= email;
    }
    @Override
    public String toString(){
        return "Nombre: "+ nombre + " | Cedula: " + cedula + " | cel:" + cel + " | email: " + email;
    }
}
