package tppoo.modules;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private int id;
     private String nom,prenom,email;
   private int apogee;
   private Filiere filiere;
    List<Note> notes = new ArrayList<>();
public Etudiant(){
}
public Etudiant(String nom, String prenom, String email, int apogee, Filiere filiere){
this.apogee=apogee;
this.nom=nom;
this.email=email;
this.prenom=prenom;
this.filiere=filiere;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public int getApogee() {
        return apogee;
    }

    public void setApogee(int apogee) {
        this.apogee = apogee;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Étudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", apogee=" + apogee +
                ", filiere=" + filiere +
                '}';
    }
}
