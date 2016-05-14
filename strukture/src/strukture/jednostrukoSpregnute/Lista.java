package strukture.jednostrukoSpregnute;

public class Lista {

	CvorJSListe glava = null;
	
	public void dodajElementNaKrajListe(CvorJSListe noviElement){
		if(glava == null)
			glava = noviElement;
		else {
			CvorJSListe pom = glava;
			for(; pom.sledeci != null; pom = pom.sledeci);
			pom.sledeci = noviElement;
		}
	}
	public void dodajElementNaKrajListe(int podatak){
		CvorJSListe noviElement = new CvorJSListe(podatak);
		if(glava == null)
			glava = noviElement;
		else {
			CvorJSListe pom = glava;
			for(; pom.sledeci != null; pom = pom.sledeci);
			pom.sledeci = noviElement;
		}
	}
	public void stampajListu(){
		if(glava == null){
			System.out.println("Lista je prazna");
		}
		else {
			for(CvorJSListe pom = glava; pom != null; pom = pom.sledeci)
				System.out.print(pom.getPodatak() + " ");
			System.out.println();
		}
	}
	
}
