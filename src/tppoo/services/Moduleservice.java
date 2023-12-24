package tppoo.services;

import tppoo.modules.Departement;
import tppoo.modules.Enseignant;
import tppoo.modules.Filiere;
import tppoo.modules.Module;

import java.util.ArrayList;

public class Moduleservice {
    public static Module addModule(String intitule, Enseignant chef, Filiere filiere) {

        return  new Module();
    }

    public static Module updateModule(int id , String intitule, Enseignant chef,  Filiere filiere){
        return  new Module();
    }
    public static ArrayList<Module> deleteModuleById(int id){

        return  DB.mod;
    }



    public static ArrayList<Module> getAllModule(){
        return  DB.mod;
    }
}
