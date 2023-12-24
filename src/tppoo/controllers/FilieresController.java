package tppoo.controllers;

import tppoo.Main;
import tppoo.modules.Filiere;
import tppoo.modules.Module;
import tppoo.services.*;

public class FilieresController {
    public static void showMenu() {
        System.out.println("-------------------------[ Filieres ]---------------------------");


        System.out.println("1: Pour ajouter une filiere");
        System.out.println("2: Pour afficher les filieres");
        System.out.println("3: Pour modifier une filiere");
        System.out.println("4: Pour supprimer une filiere");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                createFiliere();
                break;
            case 2:
                showFiliere();
                break;
            case 3:
                editFiliere();
                break;
            case 4:
                destroyFiliere();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
    public static void showFiliere() {
        for (Filiere filiere : DB.fil) {
            System.out.print("Id : " + filiere.getIdfiliere());
            System.out.print(" | Intitule : " + filiere.getIntitule());
            System.out.print(" | enseignant : " + filiere.getResponsable());
            System.out.print(" | departement : " + filiere.getDepartement());
            if (!Main.isNull(filiere)) {
                System.out.print(" | nom : " + filiere.getIntitule() );
            }
            System.out.println("");
        }
    }
    public static void createFiliere() {
        String intitule = Main.getStringInput("Entrez l'intitule du filiere :");
        EnseignantsController.showEnseignants();
        int idEns = Main.getIntInput("Sélecionnez un enseignant par id :");
        DepartementsController.showDepartements();
        int iddept = Main.getIntInput("Sélecionnez le module  par id :");
        Fiiservice.addFiliere(intitule,Ensngntservice.getEnsById(idEns), Deptservice.getDeptById(iddept));

        showFiliere();
        showMenu();

    }
    public static void editFiliere() {
        showFiliere();
        int id = Main.getIntInput("Sélecionnez un enseignat id :");
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnseignantsController.showEnseignants();
        int idEns = Main.getIntInput("Sélecionnez un enseignant par id :");
        DepartementsController.showDepartements();
        int iddept = Main.getIntInput("Sélecionnez le module  par id :");
        Fiiservice.updateFiliere(id,intitule,Ensngntservice.getEnsById(idEns), Deptservice.getDeptById(iddept));

        showFiliere();
        showMenu();
    }

    public static void destroyFiliere() {

        showFiliere();
        int id = Main.getIntInput("Sélecionnez un enseignant par id :");
        Fiiservice.deleteFiliereById(id);
        showFiliere();
    }
}
