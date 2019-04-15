Voici 2 classes `Compte` (correspond à un compte bancaire) et `Operation` (thread qui effectue des opérations sur un compte bancaire).
 

1. Examinez le code et faites exécuter la classe `Operation`. Constatez le problème : opération effectue des opérations qui devraient laisser le sode du compte inchangé, et pourtant, après un moment, le solde ne reste pas à 0. Expliquez.
    
2. Modifiez le code pour empêcher ce problème.


3. Dans le code de `Operation`, remplacez l'opération nulle par 2 opérations ajouter et retirer qui devraient elles aussi laisser le solde du compte à 0 (elles sont en commentaire dans le code). 
Lancez l'exécution et constatez le problème. Modifiez le code pour que ça marche.
