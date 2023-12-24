package tppoo.controllers;
import tppoo.Main;
import tppoo.services.DB;
import tppoo.modules.Enseignant;
import tppoo.services.Deptservice;
import tppoo.services.Ensngntservice;
import tppoo.services.Moduleservice;

public class EnseignantsController {
    public static void showMenu() {
        System.out.println("-------------------------[ Enseignant ]---------------------------");


        System.out.println("1: Pour ajouter un enseignant");
        System.out.println("2: Pour afficher les enseignants");
        System.out.println("3: Pour modifier un enseignant");
        System.out.println("4: Pour supprimer un enseignant");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                createEnseignant();
                break;
            case 2:
                showEnseignants();
                break;
            case 3:
                editEnseignant();
                break;
            case 4:
                destroyEnseignant();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }

    public static void showEnseignants() {
        for (Enseignant enseignant : DB.ens) {
            System.out.print("Id : " + enseignant.getId());
            System.out.print(" | Nom : " + enseignant.getNom() + " " + enseignant.getPrenom());
            System.out.print(" | Email : " + enseignant.getEmail());
            if (!Main.isNull(enseignant)) {
                System.out.print(" | Responsable : " + enseignant.getNom() + " " + enseignant.getPrenom());
            }
            System.out.println("");
        }
    }

    public static void createEnseignant() {
        String nom = Main.getStringInput("Entrez le nom de l'enseignant :");
        String prenom = Main.getStringInput("Entrez le prenom de l'enseignant :");
        String email = Main.getStringInput("Entrez lemail de l'enseignant :");
        String grade = Main.getStringInput("Entrez le grade de l'enseignant :");
        ModulesController.showModule();
        int id = Main.getIntInput("Sélecionnez le module  par id :");
        Ensngntservice.addEns(nom, prenom, email, grade, Deptservice.getDeptById(id));

        showEnseignants();
        showMenu();

    }

    public static void editEnseignant() {
        showEnseignants();
        int id = Main.getIntInput("Sélecionnez un enseignat id :");
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        String prenom = Main.getStringInput("Sélecionnez un nom d'enseignant :");
        String email = Main.getStringInput("Entrez l'email du enseignant :");
        String grade = Main.getStringInput("Entrez grade du enseignant :");
        ModulesController.showModule();
        //????????????
        int idMod = Main.getIntInput("Sélecionnez un module par id :");

        Ensngntservice.updateEns(id, intitule, prenom, email, grade, Deptservice.getDeptById(idMod));

        showEnseignants();
        showMenu();
    }

    public static void destroyEnseignant() {

        showEnseignants();
        int id = Main.getIntInput("Sélecionnez un enseignant par id :");
        Ensngntservice.deleteEnsById(id);
        showEnseignants();
    }
}
