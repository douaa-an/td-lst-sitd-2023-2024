package douaaanoura.td2;

public class ex3 {

    public static class Livre {
        private String titre;
        private String auteur;
        private double prix;
        private int annee;

        // Constructeur par défaut
        public Livre() {
            this.titre = "";
            this.auteur = "";
            this.prix = 0.0;
            this.annee = 0;
        }

        // Constructeur avec titre
        public Livre(String titre) {
            this.titre = titre;
            this.auteur = "";
            this.prix = 0.0;
            this.annee = 0;
        }

        // Constructeur avec titre et auteur
        public Livre(String titre, String auteur) {
            this.titre = titre;
            this.auteur = auteur;
            this.prix = 0.0;
            this.annee = 0;
        }

        // Constructeur avec titre, auteur et prix
        public Livre(String titre, String auteur, double prix) {
            this.titre = titre;
            this.auteur = auteur;
            this.prix = prix;
            this.annee = 0;
        }

        // Constructeur avec titre, auteur, prix et annee
        public Livre(String titre, String auteur, double prix, int annee) {
            this.titre = titre;
            this.auteur = auteur;
            this.prix = prix;
            this.annee = annee;
        }

        // Constructeur de copie
        public Livre(Livre autreLivre) {
            this.titre = autreLivre.getTitre();
            this.auteur = autreLivre.getAuteur();
            this.prix = autreLivre.getPrix();
            this.annee = autreLivre.getAnnee();
        }

        // Accesseurs et mutateurs pour chaque attribut
        public String getTitre() {
            return titre;
        }

        public void setTitre(String titre) {
            this.titre = titre;
        }

        public String getAuteur() {
            return auteur;
        }

        public void setAuteur(String auteur) {
            this.auteur = auteur;
        }

        public double getPrix() {
            return prix;
        }

        public void setPrix(double prix) {
            this.prix = prix;
        }

        public int getAnnee() {
            return annee;
        }

        public void setAnnee(int annee) {
            this.annee = annee;
        }

        // Méthode toString pour afficher les informations sur le livre
        @Override
        public String toString() {
            return "Livre{" +
                    "titre='" + titre + '\'' +
                    ", auteur='" + auteur + '\'' +
                    ", prix=" + prix +
                    ", annee=" + annee +
                    '}';
        }
    }
    public class Main {
        public static void main(String[] args) {
            // Création d'instances de Livre avec différents constructeurs
            Livre livre1 = new Livre();
            Livre livre2 = new Livre("Titre1");
            Livre livre3 = new Livre("Titre2", "Auteur1");
            Livre livre4 = new Livre("Titre3", "Auteur2", 29.99);
            Livre livre5 = new Livre("Titre4", "Auteur3", 19.99, 2022);

            // Affichage des informations des livres
            System.out.println(livre1.toString());
            System.out.println(livre2.toString());
            System.out.println(livre3.toString());
            System.out.println(livre4.toString());
            System.out.println(livre5.toString());

            // Test du constructeur de copie
            Livre livreCopie = new Livre(livre4);
            System.out.println("\nLivre copié: " + livreCopie.toString());

            // Modification d'un livre
            livre2.setPrix(15.99);
            System.out.println("\nAprès modification - Livre 2: " + livre2.toString());

        }
    }
}
