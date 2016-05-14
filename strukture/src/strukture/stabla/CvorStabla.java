package strukture.stabla;

public class CvorStabla {

	CvorStabla levo;
	CvorStabla desno;
	int podatak;
	
	public CvorStabla(){}
	
	public CvorStabla(int podatak){
		this.podatak = podatak;
		levo = null;
		desno = null;
	}
	
	public CvorStabla getLevo() {
		return levo;
	}
	public void setLevo(CvorStabla levo) {
		this.levo = levo;
	}
	public CvorStabla getDesno() {
		return desno;
	}
	public void setDesno(CvorStabla desno) {
		this.desno = desno;
	}
	public int getPodatak() {
		return podatak;
	}
	public void setPodatak(int podatak) {
		this.podatak = podatak;
	}
	
	public CvorStabla(CvorStabla levo, CvorStabla desno, int podatak) {
		super();
		this.levo = levo;
		this.desno = desno;
		this.podatak = podatak;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + podatak;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CvorStabla other = (CvorStabla) obj;
		if (podatak != other.podatak)
			return false;
		return true;
	}
	
	
	
}
