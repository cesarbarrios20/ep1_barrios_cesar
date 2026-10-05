/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10_cesar;

/**
 *
 * @author laboratorioasu
 */
public class Estudiante extends Personas{
    private String matricula;
    private String carrera;
    private String materia;
    
    public Estudiante(String nombre, String cedula, String matricula, String carrera, String cel, String email, String materia){
        super(nombre, cedula, cel, email); 
        this.matricula = matricula;
        this.carrera = carrera;
        this.materia = materia;
    }
    @Override
    public String toString() {
        return super.toString() + " | Matricula: " + matricula + " | Carrera: " + carrera + "| Materia: " + materia;
    }
    //main
    public static void main(String[] args){
    Estudiante e = new Estudiante ("Cesar", "6338266", "2024100195", "Informatica", "0981", "cesar06arrios@gmail.com", "Sistemas Orientados a objetos I");
        System.out.print(e);
    }
}

