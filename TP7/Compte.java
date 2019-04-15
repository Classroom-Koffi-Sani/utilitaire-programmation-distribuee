package TP7;

public class Compte {
  private int solde = 0;

  public void ajouter(int somme) {
    solde += somme;
    System.out.println(" ajoute " + somme);
  }

  public void retirer(int somme) {
    solde -= somme;
    System.out.println(" retire " + somme);
  }

  public void operationNulle(int somme) {
    solde += somme;
    System.out.println(" ajoute " + somme);
    solde -= somme;
    System.out.println(" retire " + somme);
  }

  public int getSolde() {
    return solde;
  }
}
    
