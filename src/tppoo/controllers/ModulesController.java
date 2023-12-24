package tppoo.controllers;

import tppoo.Main;
import tppoo.modules.Enseignant;
import tppoo.modules.Module;
import tppoo.services.*;

public class ModulesController {
    public static void showMenu() {
        System.out.println("-------------------------[ Modules ]---------------------------");


        System.out.println("1: Pour ajouter un module");
        System.out.println("2: Pour afficher les modules");
        System.out.println("3: Pour modifier un module");
        System.out.println("4: Pour supprimer un module");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                createModule();
                break;
            case 2:
                showModule();
                break;
            case 3:
                editModule();
                break;
            case 4:
                destroyModule();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
    public static void showModule() {
        for (Module module : DB.mod) {
            System.out.print("Id : " + module.getId());
            System.out.print(" | Intitule : " + module.getIntitule() + " " + module.getIntitule());
            System.out.print(" | Filiere : " + module.getFilière());
            System.out.print(" | Professeur : " + module.getProfesseur());
            if (!Main.isNull(module)) {
                System.out.print(" | nom : " + module.getIntitule() );
            }
            System.out.println("");
        }
    }
    public static void createModule() {
        String intitule = Main.getStringInput("Entrez l'intitule  du module :");

        EnseignantsController.showEnseignants();
        int idEns = Main.getIntInput("Sélecionnez un enseignant par id :");
        FilieresController.showFiliere();
        int idfil = Main.getIntInput("Sélecionnez la filiere  par id :");
        Moduleservice.addModule(intitule,Ensngntservice.getEnsById(idEns), Fiiservice.getFiliereById(idfil));

        showModule();
        showMenu();

    }
    public static void editModule() {
        showModule();
        int id = Main.getIntInput("Sélecionnez un module par id :");
        String intitule = Main.getStringInput("Entrez l'intitulé :");

        FilieresController.showFiliere();
        EnseignantsController.showEnseignants();
        int idEns = Main.getIntInput("Sélecionnez un enseignant par id :");
        int idFil = Main.getIntInput("Sélecionnez une filiere par id :");

        Moduleservice.updateModule(id,intitule,Ensngntservice.getEnsById(idEns), Fiiservice.getFiliereById(idFil));

        showModule();
        showMenu();
    }
    public static void destroyModule() {

        showModule();
        int id = Main.getIntInput("Sélecionnez un module par id :");
        Moduleservice.deleteModuleById(id);
        showModule();
    }


}
