package tppoo.controllers;

import tppoo.Main;
import tppoo.modules.Etudiant;
import tppoo.modules.Filiere;
import tppoo.services.*;

public class EtudiantController {
    public static void showMenu() {
        System.out.println("-------------------------[ Etudiants ]---------------------------");


        System.out.println("1: Pour ajouter un etudiant");
        System.out.println("2: Pour afficher les etudiants");
        System.out.println("3: Pour modifier un etudiant");
        System.out.println("4: Pour supprimer un etudiant");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                createEtudiant();
                break;
            case 2:
                showEtudiant();
                break;
            case 3:
                editEtudiant();
                break;
            case 4:
                destroyEtudiant();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
    public static void showEtudiant() {
        for (Etudiant etudiant : DB.etd) {
            System.out.print("Id : " + etudiant.getId());
            System.out.print(" | nom : " + etudiant.getNom());
            System.out.print(" | prenom : " + etudiant.getPrenom());
            System.out.print(" | email : " + etudiant.getEmail());
            System.out.print(" | apogee : " + etudiant.getApogee());
            System.out.print(" | filiere : " + etudiant.getFiliere());
            if (!Main.isNull(etudiant)) {
                System.out.print(" | nom : " + etudiant.getNom() );
            }
            System.out.println("");
        }
    }
    public static void createEtudiant() {
        String nom = Main.getStringInput("Entrez le nom d'etudiant :");
        String prenom = Main.getStringInput("Entrez le prenom d'etudiant :");
        String email = Main.getStringInput("Entrez l'email d'etudiant :");
        int apogee = Main.getIntInput("Entrez l'apogee d'etudiant :");
   FilieresController.showFiliere();
        int idFil = Main.getIntInput("Sélecionnez une filiere par id :");
        Etudiantservice.addEtd(nom,prenom,email,apogee,Fiiservice.getFiliereById(idFil));

        showEtudiant();
        showMenu();

    }
    public static void editEtudiant() {
        showEtudiant();
        int id = Main.getIntInput("sélecionnez un etudiant id:");
        String nom = Main.getStringInput("selectionner le nom d'etudiant :");
        String prenom = Main.getStringInput(" selectionner le prenom d'etudiant :");
        String email = Main.getStringInput("selectionner l'email d'etudiant :");
        int apogee = Main.getIntInput("selectionner l'apogee d'etudiant :");
        FilieresController.showFiliere();
        int idFil = Main.getIntInput("Sélecionnez une filiere par id :");
        Etudiantservice.updateEtd(id,nom,prenom,email,apogee,Fiiservice.getFiliereById(idFil));

        showEtudiant();
        showMenu();
    }

    public static void destroyEtudiant() {

        showEtudiant();
        int id = Main.getIntInput("Sélecionnez un enseignant par id :");
        Fiiservice.deleteFiliereById(id);
        showEtudiant();
    }
    }
