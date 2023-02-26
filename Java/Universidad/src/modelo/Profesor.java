package modelo;

/**
 *
 * @author flash
 */
public class Profesor extends Persona {

    private String subjectMatter;
    private boolean isActivated;

    public Profesor() {
        // Constructor Vacío //
    }

    public Profesor(String name, String lastName, String documentType, String identificationDocument, String subjectMatter, boolean isActivated) {
        // constructor extends and send attributes necessary for the other constructor Persona for can access to information from this same class or instance of this class
        super(name, lastName, documentType, identificationDocument, "profesor");

        this.subjectMatter = subjectMatter;
        this.isActivated = isActivated;
    }

    public String getSubjectMatter() {
        return subjectMatter;
    }

    public void setSubjectMatter(String subjectMatter) {
        this.subjectMatter = subjectMatter;
    }

    public boolean isIsActivated() {
        return isActivated;
    }

    public void setIsActivated(boolean isActivated) {
        this.isActivated = isActivated;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nMateria: " + this.subjectMatter;
    }
}
