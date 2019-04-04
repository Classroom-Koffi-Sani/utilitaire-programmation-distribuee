class NouvelleActivite implements Runnable {
    Thread th;
    NouvelleActivite() {
        th = new Thread(this, "Activite demo");
        System.out.println("Activite enfant : " + th);
        th.start();
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
        System.out.println("Sortie de l’activité enfant");
    }// run()
}// class NouvelleActivite