import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> titulaires = new ArrayList<>();
        ArrayList<Double> soldes = new ArrayList<>();

        while(true){
            System.out.println("BIENVENUE AU NOTRE SYSTEME BANCAIRE!");
            System.out.println("1. Créer un nouveau compte\n" +
                    "2. Déposer de l'argent\n" +
                    "3. Retirer de l'argent\n" +
                    "4. Afficher tous les comptes\n" +
                    "5. Quitter");
            System.out.println("choisissez le nbre de votre choix: ");
            int choix = sc.nextInt();

            if (choix == 1){
                System.out.println("NOM DU TITULAIRE: ");
                String nom = sc.next();
                titulaires.add(nom);
                System.out.println("SOLDE INITIAL: ");
                Double soldeInitial = sc.nextDouble();
                soldes.add(soldeInitial);
                System.out.println("compte ajoutee avec succes!");
            }
            if (choix == 2){
                System.out.println("MONTANT DE L'ARGENT: ");
                Double montant = sc.nextDouble();
                soldes.add(montant);
                System.out.println("montant ajoutee avec succes!");
            }
            if (choix == 3) {
                System.out.println("ENTREZ LE NUMERO DU COMPTE (0, 1, 2...) : ");
                int index = sc.nextInt();
                if (index >= 0 && index < titulaires.size()) {
                    System.out.println("MONTANT DE L'ARGENT QUE VOUS VOULEZ RETIRER: ");
                    Double montant2 = sc.nextDouble();
                    double soldeActuel = soldes.get(index);
                    double nouveauSolde = soldeActuel - montant2;
                    soldes.set(0, nouveauSolde);
                    System.out.println("RETRAIT EFFECTUE AVEC SUCCES!");

                } else {
                    System.out.println("Erreur : Ce numéro de compte n'existe pas !");
                }
            }
            if (choix == 4) {
                System.out.println("TADA:" +titulaires + soldes);
            } else if (choix==5) {
                System.out.println("SEE U SOON");
                break;
            }
        }
    }
}
