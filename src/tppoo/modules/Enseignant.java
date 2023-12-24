package tppoo.modules;

import java.util.ArrayList;
import java.util.List;

public class Enseignant {
    private String nom,prenom,email,grade;
 private Departement departement;
private int id;
    List<Module> modules = new ArrayList<>();
public Enseignant(){
}
public Enseignant(String nom){
    this.nom=nom;
}
public Enseignant(String nom, String prenom, String email, String grade, int id){
    this.nom=nom;
    this.prenom=prenom;
    this.email=email;
    this.grade=grade;
    this.id=id;
}
public Enseignant(String nom, String prenom, String email, String grade, Departement departement, int id){
    this.nom=nom;
    this.prenom=prenom;
    this.email=email;
    this.grade=grade;
    this.departement=departement;
    this.id=id;
}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "le nom du Enseignat est "+nom+" "+prenom+" son email: "+email+"  du grade  "+ grade+" du departement "+departement;
    }
    public boolean equals(Enseignant obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getId() != this.id) {
            return false;
        }

        return true;
    }
}