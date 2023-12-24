package tppoo.services;

import tppoo.modules.Departement;
import tppoo.modules.Enseignant;
import tppoo.modules.Filiere;

import java.util.ArrayList;

public class Fiiservice {
    public static Filiere addFiliere(String intitule, Enseignant chef, Departement dept) {

        return  new Filiere();
    }

    public static Filiere updateFiliere(int id , String intitule, Enseignant chef, Departement dept){
        return  new Filiere();
    }
    public static ArrayList<Filiere> deleteFiliereById(int id){
        return  DB.fil;
    }

    public static Filiere getFiliereById(int id){
        return  new Filiere();
    }

    public static ArrayList<Filiere> getAllFiliere(){
        return  DB.fil;
    }
}
