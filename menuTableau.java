package manipTab;
import java.util.Scanner;
import java.util.ArrayList;

// Programme proposant un menu pour manipuler un tableau dynamique 
public class menuTableau {

	public static void main(String[] args) {
		
		
		
		Scanner key=new Scanner(System.in);
		int choix;// variable utilisée dans le menu pour stocker le choix de l'utilisateur
		
		System.out.println("Bienvenue dans le menu !\n");
		
		fonctionsTab t=new fonctionsTab();// déclaration d'un objet de type fonctionTab. Cet objet contient un seul
		//attribut : un tableau d'entier dynamique
		
		do {// Présentation des choix
			System.out.println("Saissez un entier pour choisir une option");
			System.out.println("1- Ajouter un élement au tableau");
			System.out.println("2- Trier le tableau");
			System.out.println("3- Supprimer un élement du tableau");
			System.out.println("4- Afficher les élements du tableau\n");
			
			choix=key.nextInt();// lecture du choix saisi par l'utilisateur
			
		// Selon la variable choix on appelle la méthode de fonctionsTab
		// Pensez à voir la définition de la classe fonctionTab pour voir les détails de chaque méthode appelée ci-dessous
		
			switch (choix){
			
			case 1:// Ajouter un élement à la fin du tableau
				System.out.println("Veuillez saisir l'entier à ajouter au tableau");
				int elt=key.nextInt();//lecture de l'entier saisi
				t.ajoutElement(elt);// appel de la méthode ajoutElement permettant d'ajouter un élement à la fin du tableau
				break;
				
			case 2:
				t.tri();// méthode permettant de trier le tableau
				break;
				
			case 3:
				System.out.println("Veuillez saisir l'indice de l'élement du tableau à supprimer");
				int i=key.nextInt();//Lecture de l'indice de l'élement à virer du tableau
				t.suppElement(i);// appel de la méthode en question
				break;
				
			
			case 4:
				t.affiche();// méthode permettant d'afficher les élements du tableau
				break;
		}
			
			
		System.out.println("Tapez 0 si vous voulez quitter. Sinon saisir autre chose");
		choix=key.nextInt();
		}while(choix!=0);// Aprés l'éxecution de la méthode associée au choix, on peut quitter le menu(sotir de la boucle do while)
		// il suffit juste de taper 0
	}

}
