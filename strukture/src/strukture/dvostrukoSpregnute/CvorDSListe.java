package strukture.dvostrukoSpregnute;

public class CvorDSListe {

	int podatak;
	CvorDSListe sledeci = null;
	CvorDSListe prethodni = null;
	
	public CvorDSListe(int podatak, CvorDSListe prethodni, CvorDSListe sledeci) {
		super();
		this.podatak = podatak;
		this.sledeci = sledeci;
		this.prethodni = prethodni;
	}

	public CvorDSListe(){}

	public CvorDSListe(int podatak) {
		this.podatak = podatak;
	}
	
	public int getPodatak() {
		return podatak;
	}

	public void setPodatak(int podatak) {
		this.podatak = podatak;
	}

	public CvorDSListe getSledeci() {
		return sledeci;
	}

	public void setSledeci(CvorDSListe sledeci) {
		this.sledeci = sledeci;
	}

	public CvorDSListe getPrethodni() {
		return prethodni;
	}

	public void setPrethodni(CvorDSListe prethodni) {
		this.prethodni = prethodni;
	}
	
}
