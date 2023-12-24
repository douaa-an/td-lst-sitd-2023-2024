package tppoo.services;

import tppoo.modules.*;
import tppoo.modules.Module;

import java.util.ArrayList;
import java.util.List;

public class DB {
        public static int deptid = 0;
        public static int ensid = 0;
        public static int etdid = 0;
        public static int filid = 0;
        public static int modid = 0;
        public static ArrayList<Departement> dep=new ArrayList<>();
    public static ArrayList<Enseignant> ens=new ArrayList<>();
    public static ArrayList<Filiere> fil=new ArrayList<>();
    public static ArrayList<Module> mod=new ArrayList<>();
    public static ArrayList<Etudiant> etd=new ArrayList<>();
    public static ArrayList<Note> not=new ArrayList<>();

    public static int getDeptid() {
        deptid++;
        return deptid;
    }

    public static int getEnsid() {
        ensid++;
        return ensid;
    }

    public static int getEtdid() {
        return etdid;
    }

    public static int getModid() {
        return modid;
    }

    public static int getFilid() {
        return filid;
    }
}



