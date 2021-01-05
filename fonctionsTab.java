package manipTab;
import java.util.ArrayList;

// Définition de la classe fonctionsTab 
// Celle-ci permet de manipuler un tableau(d'entiers) dynamique

public class fonctionsTab {
	
	//Seul attribut de la classe
	// Sur ce tableau, on va faire quelques manipulations à travers des méthodes définies ci-dessous
	private	ArrayList<Integer> tab;
	
	
	public fonctionsTab() {
		// Constructeur sans argument
		// Il permet d'initialiser un tableau vide		
		tab=new ArrayList<Integer>();	
	}
	
	
	// Getteurs et Setteurs
	public ArrayList<Integer> getTab() {
		return tab;
	}
	public void setTab(ArrayList<Integer> tab) {
		this.tab = tab;
	}
	
	
	//Méthode permettant de rajouter un élement à la fin du tableau
	public void ajoutElement(int elt) {
		tab.add(elt);
	}
	
	//Méthode permettant d'afficher les élements du tableau
	public void affiche() {
		System.out.println("Les élements du tableau :");
		for(int i=0;i<tab.size();i++)
			System.out.println("tab["+i+"]="+tab.get(i));
	}
	
	//Méthode permettant de supprimer l'élemenet du tableau dont l'indice est passé en argument 
	public void suppElement(int i) {
		// Si le tableau est vide, on  peut pas supprimer d'élements
		if (tab.size()==0)
		System.out.println("Impossible d'effectuer l'opération. Le tableau est vide");// Affichage d'un message
		
		// Si l'indice passé en argument est supérieur au nombre d'élements du tableu, il est impossible
		// d'effectuer la suppresion
		else if(i>=tab.size()) 
			// Affichage d'un message
			System.out.println("Impossible d'effectuer l'opération.\nL'indice saisi dépasse le nombre d'élments du tableau");
		else //sinon la suppresion est réalisée
			tab.remove(i);
	}
	
	//Méthode permettant de trier le tableau 
	public void tri() {
		
		
		for(int i=0;i<tab.size();i++) {
			// la variable ind_min désigne l'indice du minimum de la partie du tableau commencant par l'élement
			// d'indice i jusqu'à la fin du tableau 
			int ind_min=i;
			
			// Cette boucle for servira à déterminer ind_min
			for(int j=i+1;j<tab.size();j++) {
				if(tab.get(j)<tab.get(ind_min)) 
					ind_min=j;
			}
			
			// içi on permute l'élement d'indice i avec le minimum de la partie du tableau commançant par l'élement
			// d'indice i jusqu'à la fin
			int temp=tab.get(i);
			tab.set(i,tab.get(ind_min));
			tab.set(ind_min,temp);
		}
	}
	

}
