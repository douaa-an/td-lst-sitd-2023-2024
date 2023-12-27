package douaaanoura.td3;

public class ex5 {
    class Vehicule {
        private int nbPassager;

        public Vehicule(int n) {
            this.nbPassager = n;
        }

        public String toString() {
            return "Nombre de passagers du véhicule : " + nbPassager;
        }
    }
    class Moto extends Vehicule {
        private int nbRoues = 2;


        public Moto(int n) {
            super(n);
              }
    }
    class Avion extends Vehicule {
        private int nbMoteur;

        public Avion(int nbP) {
            super(nbP);
        }

        public Avion(int nbP, int nbM) {
            super(nbP);
            this.nbMoteur = nbM;
        }
    }


}
