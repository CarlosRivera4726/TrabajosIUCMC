package universidad;

import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

/**
 *
 * @author flash
 */
public class Universidad {

    public static void main(String[] args) {
        // Datos Estudiante
        String name = "Carlos";
        String lastName = "Rivera";
        String documentType = "TI";
        String identificationDocument = "1002820063";
        String profession = "Estudiante";
        
        // Datos Profesor
        
        String nameP = "Juan";
        String lastNameP = "Oviedo";
        String documentTypeP = "CC";
        String identificationDocumentP = "1002820064";
        String professionP = "Profesor";
        //Persona p1 = new Persona(name, lastName, documentType, identificationDocument, "profesor");
        //System.out.println(p1.toString());
        
        // Create object of Profesor 
        //documentType = "CC";
        
        Profesor d1 = new Profesor(nameP, lastNameP, documentTypeP, identificationDocumentP, "Profesor", true);
        //System.out.println(d1);
        
        Estudiante e1 = new Estudiante(name, lastName, documentType, identificationDocument, profession, d1);
        e1.setMaterias("Matematicas", 0);
        e1.setMaterias("Español", 1);
        e1.setMaterias("Ingles", 2);
        e1.setMaterias("Religion", 3);
        e1.setMaterias("Calculo", 4);
        System.out.println(e1);
        
        
    }
    
}
