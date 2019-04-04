package TP2;

class NouvelleActivite extends Thread {
    Thread th;
    NouvelleActivite() {
        super("Activité demo");
        System.out.println("Activite enfant : " + this);
        start();
        // Debuter l’activite
    }
    // Point d’entree de la nouvelle activite
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Activite enfant : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Enfant interrompu.");
        }
        System.out.println("Sortie de l’activite enfant");
    }// run()
}// class NouvelleActivite