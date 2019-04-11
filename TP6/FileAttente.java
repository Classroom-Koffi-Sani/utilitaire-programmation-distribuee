package TP6;

// Implantation incorrecte d’un producteur et d’un consommateu
class FileAttente {
    int n;
    boolean valeurMise = false; // A-t-on mis une valeur dans
    synchronized int prendre() {
        if(valeurMise == false)
            try {
            wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException inter");
            }
        System.out.println("Pris : " + n);
        valeurMise = false;
        notify();
        return n;
    }

    synchronized void mettre(int n) {
        if(valeurMise == true)
            try {
                wait();
            } catch(InterruptedException e) {
            System.out.println("InterruptedException");
            }
        this.n = n;
        valeurMise = true;
        System.out.println("Mis : " + n);
        notify();
    }
}// class FileAttente