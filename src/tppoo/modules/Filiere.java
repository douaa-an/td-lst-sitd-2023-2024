package tppoo.modules;

import java.util.ArrayList;
import java.util.List;

public class Filiere {
    private int idfiliere;
    private String intitule;
   private Enseignant responsable;
  private Departement departement;
    List<Module> modules = new ArrayList<>();
  public Filiere(){

  }
  public Filiere(int idfiliere, Enseignant responsable, Departement departement, String intitule)
  {
     this.departement=departement;
     this.idfiliere=idfiliere;
     this.responsable=responsable;
     this.intitule=intitule;
  }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Departement getDepartement() {
        return departement;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public int getIdfiliere() {
        return idfiliere;
    }

    public void setIdfiliere(int idfiliere) {
        this.idfiliere = idfiliere;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Override
    public String toString() {
        return "l'enseignant "+responsable+" est le responsable du departement  "+departement+" du filiere "+intitule;
    }
}
