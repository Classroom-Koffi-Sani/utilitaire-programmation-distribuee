package TP5;

class Consommateur implements Runnable {
    FileAttente f;
    Consommateur(FileAttente f) {
        this.f = f;
        new Thread(this, "Consommateur").start();
    }
    
    public void run() {
        while(true) {
            f.prendre();
        }
    }
} // class Consommateur