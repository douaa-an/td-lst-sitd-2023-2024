package tppoo.services;

import tppoo.modules.Departement;
import tppoo.modules.Enseignant;

import java.util.ArrayList;

public class Deptservice {
public static Departement addDept(String nom, Enseignant ...responsable){
    Departement dprt=new Departement();
    dprt.setNom(nom);
    dprt.setId(DB.getDeptid());
    if (responsable.length>0 ){
        dprt.setResponsable(responsable[0]);
    }
    DB.dep.add(dprt);
    return dprt;
}
    public static Departement updateDept(int id , String nom, Enseignant... responsable){
        for (Departement departement : DB.dep) {
            if (departement.getId() == id) {
                departement.setNom(nom);
                if (responsable.length > 0){
                    departement.setResponsable(responsable[0]);
                }
                return departement;
            }
        }

        return  new Departement();
    }
    public static ArrayList<Departement> deleteDeptById(int id){
        DB.dep.remove(getDeptById(id));
        return (ArrayList<Departement>) DB.dep;
    }

    public static Departement getDeptById(int id){
        for (Departement departement : DB.dep) {
            if (departement.getId() == id) return  departement;
        }
        return  new Departement();
    }

    public static ArrayList<Departement> getAllDept(){

        return (ArrayList<Departement>) DB.dep;
    }
}
