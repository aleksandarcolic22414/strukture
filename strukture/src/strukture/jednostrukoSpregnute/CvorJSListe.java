package strukture.jednostrukoSpregnute;

public class CvorJSListe {

	int podatak;
	CvorJSListe sledeci = null;
	
	public CvorJSListe() {}

	public CvorJSListe(int podatak, CvorJSListe sledeci){
		this.podatak = podatak;
		this.sledeci = sledeci;
	}
	
	public CvorJSListe(int podatak){
		this.podatak = podatak;
	}
	
	public int getPodatak() {
		return podatak;
	}

	public void setPodatak(int podatak) {
		this.podatak = podatak;
	}

	public CvorJSListe getSledeci() {
		return sledeci;
	}

	public void setSledeci(CvorJSListe sledeci) {
		this.sledeci = sledeci;
	}
	
	
}
