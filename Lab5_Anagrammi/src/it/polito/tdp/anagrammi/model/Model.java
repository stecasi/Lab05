package it.polito.tdp.anagrammi.model;

import java.util.*;

public class Model {

	private String parola;
	private List <String> completa = new ArrayList<String>();


	public List <String> risultato(String parola){
		List <Character> parziale = new ArrayList<Character>();
		int step=0;
		this.recursive(parziale, step, parola);
		return completa;
	}
	
	
	public void recursive (List <Character> parziale,int step, String parola)	{
	char lettere[] = parola.toCharArray();
	
	//condizione di terminazione
	if (step==parola.length()){
		String parolamerge ="";
		for (char c : parziale){
			parolamerge+=c;
		}
		completa.add(parolamerge);
		return;
	}
	
	//procedura ricorsiva
	for (int i=0;i<lettere.length;i++){
		if (!parziale.contains(lettere[i])){
			parziale.add(lettere[i]);
			this.recursive (parziale, step+1,parola);
			parziale.remove(step);
			
		}
	}
	
	
	
	
}
	
}
