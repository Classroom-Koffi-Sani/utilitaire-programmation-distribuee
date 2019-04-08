package TP5;

class ProdCons {
    public static void main(String args[]) {
        FileAttente f = new FileAttente();
        new Producteur(f);
        new Consommateur(f);
        System.out.println("Ctrl-C pour arreter.");
    }
}// class ProdCons