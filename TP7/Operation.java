package TP7;

public class Operation extends Thread {
  private Compte compte;

  public Operation(String nom, Compte compte) {
    super(nom);
    this.compte = compte;
  }

  public void run() {
    while (true) {
      int i = (int) (Math.random() * 10000);
      String nom = getName();
      System.out.println(nom);
//        compte.ajouter(i);
//        compte.retirer(i);
      synchronized (compte) {
        compte.ajouter(i);
        compte.retirer(i);
        //compte.operationNulle(i);
      }
      int solde = compte.getSolde();
      System.out.println(nom);
      if (solde != 0) {
        System.out.println(nom + ":**solde=" + solde);
        System.exit(1);
      } else {
        System.out.println(nom + ":**solde=" + solde);
        System.exit(0);
      }
    }
  }

  public static void main(String[] args) {
    Compte compte = new Compte();
    for (int i = 0; i < 20; i++) {
      Operation operation = new Operation("" + (char)('A' + i), compte);
      operation.start();
    }
  }
}

  
