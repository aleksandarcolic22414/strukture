package strukture.dvostrukoSpregnute;

public class Lista {
	
	CvorDSListe glava = null;
	CvorDSListe rep = null;
	
	public void dodajElementNaKrajListe(CvorDSListe noviElement){
		if(glava == null){
			glava = noviElement;
			rep = noviElement;
		}
		else {
			noviElement.prethodni = rep;
			noviElement.sledeci = null;
			rep.sledeci = noviElement;
			rep = noviElement;
		}
	}
	public void dodajElementNaKrajListe(int podatak){
		CvorDSListe noviElement = new CvorDSListe(podatak);
		if(glava == null){
			glava = noviElement;
			rep = noviElement;
		}
		else {
			noviElement.prethodni = rep;
			noviElement.sledeci = null;
			rep.sledeci = noviElement;
			rep = noviElement;
		}
	}
	
	public void dodajElementNaPocetakListe(CvorDSListe noviElement){
		if(glava == null){
			glava = noviElement;
			rep = noviElement;
		}
		else {
			noviElement.sledeci = glava;
			noviElement.prethodni = null;
			glava.prethodni = noviElement;
			glava = noviElement;
		}
	}
	
	public void dodajElementNaPocetakListe(int podatak){
		CvorDSListe noviElement = new CvorDSListe(podatak);
		if(glava == null){
			glava = noviElement;
			rep = noviElement;
		}
		else {
			noviElement.sledeci = glava;
			noviElement.prethodni = null;
			glava.prethodni = noviElement;
			glava = noviElement;
		}
	}
	
	public void stampajListu(){
		if(glava == null)
			System.out.println("Lista je prazna");
		else {
			for(CvorDSListe pom = glava; pom != null; pom = pom.sledeci)
				System.out.print(pom.getPodatak() + " ");
			System.out.println();
		}
	}
	
}
