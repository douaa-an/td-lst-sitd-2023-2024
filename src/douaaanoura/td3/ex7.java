package douaaanoura.td3;

public class ex7 {
    // Classe abstraite Employe
    abstract class Employe {
        protected String nom;
        protected String prenom;

        // Constructeurs
        public Employe() {
            this.nom = "";
            this.prenom = "";
        }

        public Employe(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }

        // Accesseurs et mutateurs pour les attributs

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getPrenom() {
            return prenom;
        }

        public abstract double gains();

        public String toString() {
            return "Nom : " + nom + ", Prénom : " + prenom;
        }
    }

    // Classe Patron héritant de Employe
    class Patron extends Employe {
        private double salaire;

        // Constructeurs
        public Patron() {
            super();
            this.salaire = 0;
        }

        public Patron(String nom, String prenom, double salaire) {
            super(nom, prenom);
            this.salaire = salaire;
        }

        // Accesseurs et mutateurs pour les attributs

        public double getSalaire() {
            return salaire;
        }

        public void setSalaire(double salaire) {
            this.salaire = salaire;
        }

        public double gains() {
            return salaire; // Retourne le salaire du patron
        }

        public String toString() {
            return super.toString() + ", Salaire : " + salaire;
        }
    }

    // Classe TravailleurCommission héritant de Employe
    class TravailleurCommission extends Employe {
        private double salaire;
        private double commission;
        private int quantite;

        // Constructeurs
        public TravailleurCommission() {
            super();
            this.salaire = 0;
            this.commission = 0;
            this.quantite = 0;
        }

        public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
            super(nom, prenom);
            this.salaire = salaire;
            this.commission = commission;
            this.quantite = 0;
        }

        // Accesseurs et mutateurs pour les attributs

        public double getSalaire() {
            return salaire;
        }

        public void setSalaire(double salaire) {
            this.salaire = salaire;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }

        public double getCommission() {
            return commission;
        }

        public void setCommission(double commission) {
            this.commission = commission;
        }

        public double gains() {
            return salaire + (commission * quantite); // Retourne le salaire du travailleur à la commission
        }

        public String toString() {
            return super.toString() + ", Salaire : " + salaire + ", Commission : " + commission + ", Quantité : " + quantite;
        }
    }

    // Classe TravailleurHoraire héritant de Employe
    class TravailleurHoraire extends Employe {
        private double retribution;
        private int heures;

        // Constructeurs
        public TravailleurHoraire() {
            super();
            this.retribution = 0;
            this.heures = 0;
        }

        public TravailleurHoraire(String nom, String prenom, double retribution) {
            super(nom, prenom);
            this.retribution = retribution;
            this.heures = 0;
        }

        // Accesseurs et mutateurs pour les attributs

        public double getRetribution() {
            return retribution;
        }

        public void setRetribution(double retribution) {
            this.retribution = retribution;
        }

        public int getHeures() {
            return heures;
        }

        public void setHeures(int heures) {
            this.heures = heures;
        }

        public double gains() {
            return retribution * heures; // Retourne le salaire du travailleur horaire
        }

        public String toString() {
            return super.toString() + ", Rémunération horaire : " + retribution + ", Heures travaillées : " + heures;
        }
    }

    // Classe de test TestEmploye
    public class TestEmploye {
        public void main(String[] args) {
            // Test de la classe Patron
            Patron patron1 = new Patron("Smith", "John", 5000);
            System.out.println("Patron 1 : " + patron1);
            System.out.println("Gains du patron 1 : " + patron1.gains());

            // Test de la classe TravailleurCommission
            TravailleurCommission travailleur1 = new TravailleurCommission("Doe", "Jane", 2000, 50);
            travailleur1.setQuantite(100);
            System.out.println("Travailleur à commission 1 : " + travailleur1);
            System.out.println("Gains du travailleur à commission 1 : " + travailleur1.gains());

            // Test de la classe TravailleurHoraire
            TravailleurHoraire horaire1 = new TravailleurHoraire("Johnson", "Bob", 15);
            horaire1.setHeures(120);
            System.out.println("Travailleur horaire 1 : " + horaire1);
            System.out.println("Gains du travailleur horaire 1 : " + horaire1.gains());
        }
    }

}
