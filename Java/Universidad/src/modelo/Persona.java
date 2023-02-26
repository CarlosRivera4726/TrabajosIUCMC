package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author flash
 */
public class Persona {

    private String name;
    private String lastName;
    private String documentType; // Máximo de cárateres es de 2
    private String identificationDocument; // el número de documento de identidad, cómo no se van hacer operaciones se puede dejar como string
    private String profession;

    public Persona() {
        // constructor vacio //
    }

    // Constructor con todas los atributos //
    public Persona(String name, String lastName, String documentType, String identificationDocument, String profession) {
        this.name = name;
        this.lastName = lastName;
        if (validationDocumentType(documentType)) {
            if (validationProfession(profession) && documentType.equals("CC")) {
                this.profession = profession;
                this.documentType = "CC";
            } else if(profession.equals("Estudiante")){
                this.profession = profession;
                this.documentType = documentType;
            }else {
                // this sentence apply TI because the unique documentType avalaible for be profesor is CC
                this.profession = "Usuario";
                this.documentType = "TI";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Document Type '" + documentType + "' is incorret and set default with null value!\n the avalaible documents type's (TI and CC)");
            this.documentType = null;
        }
        this.identificationDocument = identificationDocument;
    }

    private boolean validationDocumentType(String documentType) {
        int lengthDocumentType = documentType.length();
        return lengthDocumentType == 2 && documentType.equals("TI") || documentType.equals("CC");
    }

    private boolean validationProfession(String profession) {
        return profession.equals("profesor");
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getIdentificationDocument() {
        return identificationDocument;
    }

    public void setIdentificationDocument(String identificationDocument) {
        this.identificationDocument = identificationDocument;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nLast Name: " + this.lastName + "\nDocument Type: " + this.documentType + "\nIdentification Document: " + this.identificationDocument + "\nProfession: " + this.profession;
    }
}
