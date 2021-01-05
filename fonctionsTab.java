package manipTab;
import java.util.ArrayList;

// D�finition de la classe fonctionsTab 
// Celle-ci permet de manipuler un tableau(d'entiers) dynamique

public class fonctionsTab {
	
	//Seul attribut de la classe
	// Sur ce tableau, on va faire quelques manipulations � travers des m�thodes d�finies ci-dessous
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
	
	
	//M�thode permettant de rajouter un �lement � la fin du tableau
	public void ajoutElement(int elt) {
		tab.add(elt);
	}
	
	//M�thode permettant d'afficher les �lements du tableau
	public void affiche() {
		System.out.println("Les �lements du tableau :");
		for(int i=0;i<tab.size();i++)
			System.out.println("tab["+i+"]="+tab.get(i));
	}
	
	//M�thode permettant de supprimer l'�lemenet du tableau dont l'indice est pass� en argument 
	public void suppElement(int i) {
		// Si le tableau est vide, on  peut pas supprimer d'�lements
		if (tab.size()==0)
		System.out.println("Impossible d'effectuer l'op�ration. Le tableau est vide");// Affichage d'un message
		
		// Si l'indice pass� en argument est sup�rieur au nombre d'�lements du tableu, il est impossible
		// d'�ffectuer la suppresion
		else if(i>=tab.size()) 
			// Affichage d'un message
			System.out.println("Impossible d'effectuer l'op�ration.\nL'indice saisi d�passe le nombre d'�lments du tableau");
		else //sinon la suppresion est r�alis�e
			tab.remove(i);
	}
	
	//M�thode permettant de trier le tableau 
	public void tri() {
		
		
		for(int i=0;i<tab.size();i++) {
			// la variable ind_min d�signe l'indice du minimum de la partie du tableau commencant par l'�lement
			// d'indice i jusqu'� la fin du tableau 
			int ind_min=i;
			
			// Cette boucle for servira � d�terminer ind_min
			for(int j=i+1;j<tab.size();j++) {
				if(tab.get(j)<tab.get(ind_min)) 
					ind_min=j;
			}
			
			// i�i on permute l'�lemnt d'indice i avec le minimum de la partie du tableau comman�ant par l'�l�ment
			// d'indice i jusqu'� la fin
			int temp=tab.get(i);
			tab.set(i,tab.get(ind_min));
			tab.set(ind_min,temp);
		}
	}
	

}
