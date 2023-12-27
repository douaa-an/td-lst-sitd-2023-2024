package douaaanoura.td2;
public class ex4 {
    public static class Temps {
        private int h;
        private int m;
        private int s;

        // Constructeur par défaut
        public Temps() {
            this.h = 0;
            this.m = 0;
            this.s = 0;
        }

        // Constructeur avec heures
        public Temps(int h) {
            this.h = h;
            this.m = 0;
            this.s = 0;
        }

        // Constructeur avec heures et minutes
        public Temps(int heures, int minutes) {
            this.h = heures;
            this.m = minutes;
            this.s = 0;
        }

        // Constructeur avec heures, minutes et secondes
        public Temps(int heures, int minutes, int secondes) {
            this.h = heures;
            this.m = minutes;
            this.s = secondes;
        }

        // Constructeur copie
        public Temps(Temps temps) {
            this.h = temps.getHeures();
            this.m = temps.getMinutes();
            this.s = temps.getSecondes();
        }

        // Accesseurs et mutateurs
        public int getHeures() {
            return h;
        }

        public void setHeures(int heures) {
            this.h = heures;
        }

        public int getMinutes() {
            return m;
        }

        public void setMinutes(int minutes) {
            this.m = minutes;
        }

        public int getSecondes() {
            return s;
        }

        public void setSecondes(int secondes) {
            this.s = secondes;
        }

        // Méthodes pour ajouter temps
        public void ajouterHeures(int heures) {
            this.h += heures;
            this.h %= 24; // Assurer que les heures restent dans la plage de 0 à 23
        }

        public void ajouterMinutes(int minutes) {
            this.m += minutes;
            this.h += this.m / 60; // Ajouter les heures additionnelles des minutes
            this.m %= 60; // Assurer que les minutes restent dans la plage de 0 à 59
            this.h %= 24; // Assurer que les heures restent dans la plage de 0 à 23
        }

        public void ajouterSecondes(int secondes) {
            this.s += secondes;
            this.m += this.s / 60; // Ajouter les minutes additionnelles des secondes
            this.h += this.m / 60; // Ajouter les heures additionnelles des minutes
            this.s %= 60; // Assurer que les secondes restent dans la plage de 0 à 59
            this.m %= 60; // Assurer que les minutes restent dans la plage de 0 à 59
            this.h %= 24; // Assurer que les heures restent dans la plage de 0 à 23
        }

        // Méthode toString pour représenter la classe Temps
        public String toString() {
            return String.format("%02d:%02d:%02d", h, m, s);
        }
    }
    public class Main {
        public static void main(String[] args) {
            // Tests de la classe Temps
            Temps temps1 = new Temps(); // Constructeur par défaut
            System.out.println("Temps 1 (par défaut): " + temps1);

            Temps temps2 = new Temps(5); // Avec heures
            System.out.println("Temps 2 (avec heures): " + temps2);

            Temps temps3 = new Temps(2, 30); // Avec heures et minutes
            System.out.println("Temps 3 (avec heures et minutes): " + temps3);

            Temps temps4 = new Temps(1, 45, 30); // Avec heures, minutes et secondes
            System.out.println("Temps 4 (avec heures, minutes et secondes): " + temps4);

            Temps temps5 = new Temps(temps4); // Constructeur copie
            System.out.println("Temps 5 (copie de temps4): " + temps5);

            // Ajout de temps
            temps1.ajouterHeures(3);
            temps1.ajouterMinutes(20);
            temps1.ajouterSecondes(15);
            System.out.println("Temps 1 après ajout: " + temps1);
        }
    }


}
