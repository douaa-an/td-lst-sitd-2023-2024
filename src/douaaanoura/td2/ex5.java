package douaaanoura.td2;

public class ex5 {
    public static class Rectangle {
        private double longueur;
        private double largeur;

        // Constructeur par défaut
        public Rectangle() {
            this.longueur = 0;
            this.largeur = 0;
        }

        // Constructeur avec longueur et largeur
        public Rectangle(double longueur, double largeur) {
            if (longueur > 0 && largeur > 0) {
                this.longueur = longueur;
                this.largeur = largeur;
            } else {
                // Gestion des valeurs négatives ou nulles
                System.out.println("Les valeurs doivent être positives pour définir un rectangle.");
                this.longueur = 0;
                this.largeur = 0;
            }
        }

        // Constructeur copie
        public Rectangle(Rectangle rectangle) {
            this.longueur = rectangle.getLongueur();
            this.largeur = rectangle.getLargeur();
        }

        // Accesseurs et mutateurs
        public double getLongueur() {
            return longueur;
        }

        public void setLongueur(double longueur) {
            if (longueur > 0) {
                this.longueur = longueur;
            } else {
                System.out.println("La longueur doit être positive.");
            }
        }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            if (largeur > 0) {
                this.largeur = largeur;
            } else {
                System.out.println("La largeur doit être positive.");
            }
        }

        // Méthode pour calculer le périmètre
        public double perimetre() {
            return 2 * (longueur + largeur);
        }

        // Méthode pour calculer l'aire
        public double aire() {
            return longueur * largeur;
        }

        // Méthode pour vérifier si le rectangle est un carré
        public boolean isCarre() {
            return longueur == largeur;
        }

        // Méthode toString pour représenter le rectangle
        public String toString() {
            return "Rectangle [Longueur=" + longueur + ", Largeur=" + largeur + "]";
        }
    }
    public class TestRectangle {
        public static void main(String[] args) {
            // Tests de la classe Rectangle
            Rectangle rectangle1 = new Rectangle(); // Constructeur par défaut
            System.out.println("Rectangle 1 (par défaut): " + rectangle1);

            Rectangle rectangle2 = new Rectangle(5, 3); // Avec longueur et largeur
            System.out.println("Rectangle 2 (avec longueur et largeur): " + rectangle2);
            System.out.println("Périmètre du rectangle 2: " + rectangle2.perimetre());
            System.out.println("Aire du rectangle 2: " + rectangle2.aire());
            System.out.println("Est-ce que le rectangle 2 est un carré ? " + rectangle2.isCarre());

            Rectangle rectangle3 = new Rectangle(rectangle2); // Constructeur copie
            System.out.println("Rectangle 3 (copie de rectangle 2): " + rectangle3);

            // Test de mutateurs avec des valeurs négatives
            rectangle3.setLongueur(-2);
            rectangle3.setLargeur(-4);
            System.out.println("Rectangle 3 après modification avec des valeurs négatives: " + rectangle3);
        }
    }

}
