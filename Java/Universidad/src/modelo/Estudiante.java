/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author Estudiante
 */
public class Estudiante extends Persona{
    String materia;
    Profesor profesor;
    String[] materias = new String[5];
    public Estudiante(String name, String lastName, String documentType, String identificationDocument, String profession, Profesor profesor){
        super(name, lastName, documentType, identificationDocument, "Estudiante");
        this.profesor = profesor;
        //materias = new String[5];
    }
    
    public void setMaterias(String materia, int cont){
        this.materias[cont++] = materia;
    }
    
    @Override
    public String toString(){
        String format = super.toString() + "\nMaterias: ";
        for(int i=0; i < 5; i++){
            format += materias[i] + " "; 
        }
        return format + "\n\n\nProfesor: " + this.profesor;
    }
}
