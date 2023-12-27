package douaaanoura.td3;

public class ex4 {
    // Classe Batiment
    class Batiment {
        private String adresse;

        // Constructeurs
        public Batiment() {
            this.adresse = "";
        }

        public Batiment(String adresse) {
            this.adresse = adresse;
        }

        // Accesseurs et mutateurs
        public String getAdresse() {
            return adresse;
        }

        public void setAdresse(String adresse) {
            this.adresse = adresse;
        }

        // Méthode toString pour représenter le bâtiment
        public String toString() {
            return "Adresse du batiment : " + adresse;
        }
    }

    // Classe Maison héritant de Batiment
    class Maison extends Batiment {
        private int nbChambres;

        // Constructeurs
        public Maison() {
            super();
            this.nbChambres = 0;
        }

        public Maison(String adresse, int nbChambres) {
            super(adresse);
            this.nbChambres = nbChambres;
        }

        // Accesseurs et mutateurs
        public int getNbChambres() {
            return nbChambres;
        }

        public void setNbChambres(int nbChambres) {
            this.nbChambres = nbChambres;
        }

        // Méthode toString pour représenter la maison
        public String toString() {
            return super.toString() + ", Nombre de chambres : " + nbChambres;
        }
    }

    // Classe Immeuble héritant de Batiment
    class Immeuble extends Batiment {
        private int nbAppart;

        // Constructeurs
        public Immeuble() {
            super();
            this.nbAppart = 0;
        }

        public Immeuble(String adresse, int nbAppart) {
            super(adresse);
            this.nbAppart = nbAppart;
        }

        // Accesseurs et mutateurs
        public int getNbAppart() {
            return nbAppart;
        }

        public void setNbAppart(int nbAppart) {
            this.nbAppart = nbAppart;
        }

        // Méthode toString pour représenter l'immeuble
        public String toString() {
            return super.toString() + ", Nombre d'appartements : " + nbAppart;
        }
    }
    public void main(String[] args) {
        // Test de la classe Batiment
        Batiment batiment1 = new Batiment("");
        System.out.println("Batiment 1 : " + batiment1);

        Batiment batiment2 = new Batiment();
        batiment2.setAdresse("casa hay chrifa");
        System.out.println("Batiment 2 : " + batiment2);

        // Test de la classe Maison
        Maison maison1 = new Maison("25 Rue du Soleil", 4);
        System.out.println("Maison 1 : " + maison1);

        Maison maison2 = new Maison();
        maison2.setAdresse("30 hay houda");
        maison2.setNbChambres(3);
        System.out.println("Maison 2 : " + maison2);

        // Test de la classe Immeuble
        Immeuble immeuble1 = new Immeuble("5 Rue de la Liberté", 10);
        System.out.println("Immeuble 1 : " + immeuble1);

        Immeuble immeuble2 = new Immeuble();
        immeuble2.setAdresse("8 Avenue du salam");
        immeuble2.setNbAppart(20);
        System.out.println("Immeuble 2 : " + immeuble2);
    }
}
