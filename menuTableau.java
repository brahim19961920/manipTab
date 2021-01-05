package manipTab;
import java.util.Scanner;
import java.util.ArrayList;

// Programme proposant un menu pour manipuler un tableau dynamique 
public class menuTableau {

	public static void main(String[] args) {
		
		
		
		Scanner key=new Scanner(System.in);
		int choix;// variable utilis�e dans le menu pour stocker le choix de l'utilisateur
		
		System.out.println("Bienvenue dans le menu !\n");
		
		fonctionsTab t=new fonctionsTab();// d�claration d'un objet de type fonctionTab. Cet objet contient un seul
		//attribut : un tableau d'entier dynamique
		
		do {// Pr�sentation des choix
			System.out.println("Saissez un entier pour choisir une option");
			System.out.println("1- Ajouter un �lement au tableau");
			System.out.println("2- Trier le tableau");
			System.out.println("3- Supprimer un �lement du tableau");
			System.out.println("4- Afficher les �lements du tableau\n");
			
			choix=key.nextInt();// lecture du choix saisi par l'utilisateur
			
		// Selon la variable choix on appelle la m�thode de fonctionsTab
		// Pensez � voir la d�finition de la classe fonctionTab pour voir les d�tails de chaque m�thode appel�e ci-dessous
		
			switch (choix){
			
			case 1:// Ajouter un �lement � la fin du tableau
				System.out.println("Veuillez saisir l'entier � ajouter au tableau");
				int elt=key.nextInt();//lecture de l'entier saisi
				t.ajoutElement(elt);// appel de la m�thode ajoutElement permettant d'ajouter un �lement � la fin du tableau
				break;
				
			case 2:
				t.tri();// m�thode permettant de trier le tableau
				break;
				
			case 3:
				System.out.println("Veuillez saisir l'indice de l'�lement du tableau � supprimer");
				int i=key.nextInt();//Lecture de l'indice de l'�lement � virer du tableau
				t.suppElement(i);// appel de la m�thode en question
				break;
				
			
			case 4:
				t.affiche();// m�thode permettant d'afficher les �lements du tableau
				break;
		}
			
			
		System.out.println("Tapez 0 si vous voulez quitter. Sinon saisir autre chose");
		choix=key.nextInt();
		}while(choix!=0);// Apr�s l'�xecution de la m�thode associ�e au choix, on peut quitter le menu(sotir de la boucle do while)
		// il suffit juste de taper 0
	}

}
