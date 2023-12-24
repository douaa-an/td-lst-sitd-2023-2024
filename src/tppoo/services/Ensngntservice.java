package tppoo.services;

import tppoo.modules.Departement;
import tppoo.modules.Enseignant;

import java.util.ArrayList;

public class Ensngntservice {



    public static Enseignant addEns(String nom, String prenom, String email, String grade, Departement dept){
        return  new Enseignant();
    }

    public static Enseignant updateEns(int id, String nom, String prenom, String email, String grade, Departement dept){
        return  new Enseignant();
    }
    public static ArrayList<Enseignant> deleteEnsById(int id){
        return (ArrayList<Enseignant>) DB.ens;
    }

    public static Enseignant getEnsById(int id){
        for (Enseignant enseignant : DB.ens) {
            if (enseignant.getId() == id) return  enseignant;
        }
        return  new Enseignant();
    }

    public static ArrayList<Enseignant> getAllEns(){
        return (ArrayList<Enseignant>) DB.ens;
    }
}
