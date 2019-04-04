package TP2;

// import NouvelleActivite.*;

class ActiviteDemo {
    public static void main(String args[]) {
        new NouvelleActivite();
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Activité parente : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Parent interrompu.");
        }
        System.out.println("Sortie de l’activite parent");
    }// run()
}// class Activite