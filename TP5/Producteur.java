package TP5;

class Producteur implements Runnable {
    FileAttente f;
    
    Producteur(FileAttente f) {
        this.f = f;
        new Thread(this, "Producteur").start();
    }

    public void run() {
        int i = 0;
        while(true) {
            f.mettre(i++);
        }
    }
} // class Producteur