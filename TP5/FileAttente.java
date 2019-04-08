package TP5;

// Implantation incorrecte d’un producteur et d’un consommateu
class FileAttente {
    int n;

    synchronized int prendre() {
        System.out.println("Pris : " + n);
        return n;
    }

    synchronized void mettre(int n) {
        this.n = n;
        System.out.println("Mis : " + n);
    }
}// class FileAttente