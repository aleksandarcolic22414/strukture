package strukture.stabla;

public class Main {

	public static void main(String[] args) {

		CvorStabla k = new CvorStabla();
		
		StabloGenerator.napraviStablo_17(k);
		CvorStabla cvor = Stablo.vratiNajdubljiCvor(k);
		System.out.println(cvor.podatak);
	}

}
