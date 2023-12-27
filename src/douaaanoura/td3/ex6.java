package douaaanoura.td3;

public class ex6 {
    // Classe abstraite Figure
    abstract class Figure {
        protected String nom;

        public abstract double getPerimeter();

        public abstract double getAire();

        public String toString() {
            return "Figure : " + nom;
        }
    }

    // Classe Disque héritant de Figure
    class Disque extends Figure {
        private double rayon;
        private double[] centre = new double[2]; // Coordonnées du centre du disque [x, y]

        // Constructeurs
        public Disque() {
            this.nom = "Disque";
            this.rayon = 0;
            this.centre[0] = 0;
            this.centre[1] = 0;
        }

        public Disque(double[] centre, double rayon) {
            this();
            this.centre = centre.clone();
            this.rayon = rayon;
        }

        public Disque(double[] centre, double rayon, String nom) {
            this(centre, rayon);
            this.nom = nom;
        }

        // Accesseurs et mutateurs
        public double getRayon() {
            return rayon;
        }

        public void setRayon(double rayon) {
            this.rayon = rayon;
        }

        public double[] getCentre() {
            return centre.clone();
        }

        public void setCentre(double[] centre) {
            this.centre = centre.clone();
        }

        // Implémentation des méthodes de la classe Figure
        public double getPerimeter() {
            return 2 * Math.PI * rayon;
        }

        public double getAire() {
            return Math.PI * rayon * rayon;
        }

        public String toString() {
            return "Nom : " + nom + ", Centre : [" + centre[0] + ", " + centre[1] + "], Rayon : " + rayon;
        }
    }

    // Classe Rectangle héritant de Figure
    class Rectangle extends Figure {
        private double longueur;
        private double largeur;

        // Constructeurs
        public Rectangle() {
            this.nom = "Rectangle";
            this.longueur = 0;
            this.largeur = 0;
        }

        public double getLongueur() {
            return longueur;
        }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            this.largeur = largeur;
        }

        public void setLongueur(double longueur) {
            this.longueur = longueur;
        }


        @Override
        public double getPerimeter() {
            return 0;
        }

        @Override
        public double getAire() {
            return 0;
        }

        public String toString() {
            return "Nom : " + nom + ", Longueur : " + longueur + ", Largeur : " + largeur;
        }
    }

    // Classe de test TestFigure
    public class TestFigure {
        public void main(String[] args) {
            // Test de la classe Disque
            double[] centreDisque = { 2, 3 };
            Disque disque1 = new Disque(centreDisque, 5);
            System.out.println("Disque 1 : " + disque1);
            System.out.println("Périmètre du disque 1 : " + disque1.getPerimeter());
            System.out.println("Aire du disque 1 : " + disque1.getAire());

            // Test de la classe Rectangle
            Rectangle rectangle1 = new Rectangle();
            rectangle1.setLongueur(5);
            rectangle1.setLargeur(3);
            System.out.println("Rectangle 1 : " + rectangle1);
            System.out.println("Périmètre du rectangle 1 : " + rectangle1.getPerimeter());
            System.out.println("Aire du rectangle 1 : " + rectangle1.getAire());
        }
    }

}
