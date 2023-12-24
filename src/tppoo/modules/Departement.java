package tppoo.modules;


import java.util.ArrayList;
import java.util.List;

public class Departement {
 private String nom;
 private int id;
 private Enseignant responsable;
 List<Filiere> filieres = new ArrayList<>();
public Departement(){

}
public Departement(String nom, Enseignant responsable, int id){
 this.nom=nom;
 this.responsable=responsable;
 this.id=id;
}

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public Enseignant getResponsable() {
  return responsable;
 }
 public void setResponsable(Enseignant responsable) {
  this.responsable = responsable;
 }

 public String getNom() {
  return nom;
 }

 public void setNom(String nom) {
  this.nom = this.nom;
 }


 public List<Filiere> getFilieres() {
  return filieres;
 }

 public void setFilieres(List<Filiere> filieres) {
  this.filieres = filieres;
 }

 @Override
 public String toString() {
  return "l'enseignant "+responsable+" est le responsable du departement de "+nom;
 }
}

