package douaaanoura.td3;

public class ex2 {
    public void main(String[] args) {
        PointNom pointAvecNom = new PointNom(3, 5, 'A');
        pointAvecNom.affCoordNom(); // Affiche Coordonnees : 3 5 Nom : A

        pointAvecNom.setNom('B');
        pointAvecNom.affCoordNom(); // Affiche Coordonnees : 3 5 Nom : B

        pointAvecNom.setPointNom(7, 9, 'C');
        pointAvecNom.affCoordNom();
    }
    class Point {
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }

        public void affCoord() {
            System.out.println("Coordonnees : " + x + " " + y);
        }

        int x;
        int y;
    }
    class PointNom extends Point {
        private char nom;

        public PointNom(int x, int y, char nom) {
            super(x, y);
            this.nom = nom;
        }

        public void setPointNom(int x, int y, char nom) {
            super.deplace(x - this.x, y - this.y);
            this.nom = nom;
        }

        public void setNom(char nom) {
            this.nom = nom;
        }

        public void affCoordNom() {
            System.out.println("Coordonnees : " + super.x + " " + super.y + " Nom : " + nom);
        }
    }

}
