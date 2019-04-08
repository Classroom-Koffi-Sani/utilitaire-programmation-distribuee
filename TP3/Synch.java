package TP3;

class Synch {
    public static void main(String args[]) {
        Callme cible = new Callme();
        Caller activ1 = new Caller(cible, "Bonjour");
        Caller activ2 = new Caller(cible, "monde");
        Caller activ3 = new Caller(cible, "synchronise");
        // On attend que les activites se terminent
        try {
            activ1.th.join();
            activ2.th.join();
            activ3.th.join();
        } catch(InterruptedException e) {
            System.out.println("Interrompue");
        }
    }
}// class Synch