package tppoo.modules;

public class Module {
private String intitule;
private Filiere filière;
private Enseignant professeur;
    private int id;
public Module(){

}
public Module(String intitule, Filiere filière, Enseignant professeur , int id){
this.filière=filière;
this.intitule=intitule;
this.professeur=professeur;
this.id=id;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Enseignant getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Enseignant professeur) {
        this.professeur = professeur;
    }

    public Filiere getFilière() {
        return filière;
    }

    public void setFilière(Filiere filière) {
        this.filière = filière;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Override
    public String toString() {
        return "module "+intitule+" du filiere "+filière+" d'enseignant "+professeur;
    }
}
