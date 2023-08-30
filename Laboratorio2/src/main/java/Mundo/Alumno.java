/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Alumno {
    
    //Atributos
    private String nombre;
    private int cedula;
    private String apellido;
    private String correoElectronico;
    private int celular;
    private int semestre;
    public int getSemestre;


    public Alumno(String nombre, int cedula, String apellido, String correoElectronico, int celular,int semestre) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    public int getSemestre(int semestre){
        return semestre;
    }
    
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
    

    public void capturaDatos() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno:");
        nombre = lector.nextLine();
        System.out.println("Introduce el apellido del alumno:");
        apellido = lector.nextLine();
        System.out.println("Introduce el semestre del alumno:");
        semestre = lector.nextInt();
        lector.nextLine(); // Limpia el buffer
        System.out.println("Introduce el correo electrónico del alumno:");
        correoElectronico = lector.nextLine();
        System.out.println("Introduce el número de celular del alumno:");
        celular = lector.nextInt();
    }

    public void muestraDatos() {
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Semestre: " + semestre);
        System.out.println("Correo Electrónico: " + correoElectronico);
        System.out.println("Celular: " + celular);
    }

    public int getSemestre() {
        this.semestre = semestre;
        return semestre;
    }
    
}
