package strukture.stabla;

import java.util.*;

public class Stablo {

	CvorStabla koren;
	
	public static void prefixProlaz(CvorStabla k){
		if(k == null)
			return;
		System.out.print(k.podatak + " ");
		prefixProlaz(k.levo);
		prefixProlaz(k.desno);
		
//		K L D
	}
	
	public static void infixProlaz(CvorStabla k){
		if(k == null)
			return;
		
		infixProlaz(k.levo);
		System.out.print(k.podatak + " ");
		infixProlaz(k.desno);
		
//		L K D
	}
	
	public static void postfixProlaz(CvorStabla k){
		if(k == null)
			return;
		postfixProlaz(k.levo);
		postfixProlaz(k.desno);
		System.out.print(k.podatak + " ");
		
//		L D K
	}
	
	public static int brojElemenataStabla(CvorStabla k){
		if(k == null)
			return 0;
		else return brojElemenataStabla(k.levo) + 1 + brojElemenataStabla(k.desno);
	}
	
	public static int zbirElemenataStabla(CvorStabla k){
		if(k == null)
			return 0;
		else return k.podatak + zbirElemenataStabla(k.levo) + zbirElemenataStabla(k.desno);
	}
	
	public static int vratiNajvecuVrednostUStablu(CvorStabla k){
		if(k == null)
			return Integer.MIN_VALUE;
		else return max(k.podatak,max(vratiNajvecuVrednostUStablu(k.levo) 
				, vratiNajvecuVrednostUStablu(k.desno)));
	
	}
	
	public static int max(int a, int b){
		return a < b ? b : a;
	}
	
	public static CvorStabla max(CvorStabla a, CvorStabla b){
		return a.podatak < b.podatak ? b : a;
	}
	
	public static CvorStabla vratiNajveciCvor(CvorStabla k){
		if(k == null)
			return new CvorStabla(Integer.MIN_VALUE);
		else {
			return k.podatak > max(vratiNajveciCvor(k.levo),vratiNajveciCvor(k.desno)).podatak 
					? k : max(vratiNajveciCvor(k.levo),vratiNajveciCvor(k.desno));
		}
	}
	
	public static CvorStabla maxCvor(CvorStabla k){
		if(k == null)
			return null;
		
		CvorStabla max = k;
		CvorStabla maxl = maxCvor(k.levo);
		CvorStabla maxd = maxCvor(k.desno);
		
		if(maxl != null)
			if(max.podatak < maxl.podatak)
				max = maxl;
				
		if(maxd != null)
			if(max.podatak < maxd.podatak)
				max = maxd;
		
		return max;
		
	}
	
	public static int min(int a, int b){
		return a > b ? b : a;
	}
	
	public static int vratiNajmanjuVrednostUStablu(CvorStabla k){
		if(k == null)
			return Integer.MAX_VALUE;
		else return min(k.podatak , 
				min(vratiNajmanjuVrednostUStablu(k.levo),vratiNajmanjuVrednostUStablu(k.desno)));
	}
	
	public static CvorStabla vratiMinCvor(CvorStabla k){
		if(k == null)
			return null;
		
		CvorStabla min = k;
		CvorStabla minl = vratiMinCvor(k.levo);
		CvorStabla mind = vratiMinCvor(k.desno);
		
		if(minl != null)
			if(minl.podatak < min.podatak)
				min = minl;
		
		if(mind != null)
			if(mind.podatak < min.podatak)
				min = mind;
		
		return min;
	}
	
	public static int dubina(CvorStabla k){
		if(k == null)
			return 0;
		
		int dubinal = 1 + dubina(k.levo);
		int dubinad = 1 + dubina(k.desno);
		
		return dubinal < dubinad ? dubinad : dubinal;
	}
	
	public static CvorStabla pronadji(CvorStabla k, int podatak){
		if(k == null || k.podatak == podatak)
			return k;
		
		CvorStabla pom = pronadji(k.levo, podatak);
		if(pom == null)
			return pronadji(k.desno,podatak);
		else return pom;
	}
	
	public static CvorStabla pronadjiCvor(CvorStabla k, CvorStabla cvor){
		if(k == null || k == cvor)
			return k;
		
		CvorStabla pom = pronadjiCvor(k.levo, cvor);
		if(pom != null)
			return pom;
		else return pronadjiCvor(k.desno, cvor);
		
			
	}
	
	public static int vratiVeceOdPotomaka(CvorStabla k){
		if(k == null)
			return 0;
		
		else {
			if((k.levo != null) && (k.desno != null))
				return (k.levo.podatak < k.podatak) && (k.desno.podatak < k.podatak) ?
						1 + vratiVeceOdPotomaka(k.levo) + vratiVeceOdPotomaka(k.desno)
						: vratiVeceOdPotomaka(k.levo) + vratiVeceOdPotomaka(k.desno);
			else if(k.levo != null){
				return k.levo.podatak < k.podatak ? 1 + vratiVeceOdPotomaka(k.levo) : vratiVeceOdPotomaka(k.levo);
			} else if(k.desno != null)
				return k.desno.podatak < k.podatak ? 1 + vratiVeceOdPotomaka(k.desno) : vratiVeceOdPotomaka(k.desno);
				
			else return 0;
		}
		
	}
	
	public static int vratiVisinuCvora(CvorStabla k, CvorStabla cvor){
		if(k == null)
			return 0;
		
		if(pronadjiCvor(k.levo, cvor) != null)
			return 1 + vratiVisinuCvora(k.levo, cvor);
		if(pronadjiCvor(k.desno, cvor) != null)
			return 1 + vratiVisinuCvora(k.desno, cvor);
		
		return 0;

	}
	
	public static CvorStabla vratiNajdublji(CvorStabla k){
		if(k == null)
			return null;
		
		int DL = dubina(k.levo);
		int DD = dubina(k.desno);
		
		if(DL == 0 && DD == 0)
			return k;
		
		if(DL >= DD)
			return vratiNajdublji(k.levo);
		if(DD > DL)
			return vratiNajdublji(k.desno);
		
		
		return null;
	}
	
	public static CvorStabla najpliciList(CvorStabla k){
		if(k == null || (k.levo == null && k.desno == null))
			return k;
		
		if(prviList(k.levo) <= prviList(k.desno))
			return najpliciList(k.levo);
		else return najpliciList(k.desno);
		
	}
	
	public static int prviList(CvorStabla k){
		if(k == null)
			return Integer.MAX_VALUE;
		if(k.levo == null && k.desno == null)
			return 0;
		return 1 + Math.min(prviList(k.levo), prviList(k.desno));
	}
	
	public static int zbirVecihOdTri(CvorStabla k){
		if(k == null)
			return 0;
		
		if(k.podatak > 3)
			return k.podatak + zbirVecihOdTri(k.levo) + zbirVecihOdTri(k.desno);
		else return zbirVecihOdTri(k.levo) + zbirVecihOdTri(k.desno);
		
	}
	
	public static void ispisiOpadajuceBST(CvorStabla k){
		if(k == null)
			return;
		
		ispisiOpadajuceBST(k.desno);
		System.out.print(k.podatak + " ");
		ispisiOpadajuceBST(k.levo);
	}
	
	public static void ispisiRastuceBST(CvorStabla k){
		if(k == null)
			return;
		ispisiRastuceBST(k.levo);
		System.out.print(k.podatak + " ");
		ispisiRastuceBST(k.desno);
	}
	
	public static int maxEl(CvorStabla k){
		if(k == null)
			return Integer.MIN_VALUE;
		else return Math.max(k.podatak, Math.max(maxEl(k.levo),maxEl(k.desno)));
		
	}
	
	public static void stampajDoNajveceg(CvorStabla k){
		if(k == null)
			return;
		System.out.print(k.podatak + " ");
		
		if(maxEl(k) == k.podatak)
			return;
		if(maxEl(k.levo) >= maxEl(k.desno))
			stampajDoNajveceg(k.levo);
		else stampajDoNajveceg(k.desno);
	}
	
	public static double nadjiProsek(CvorStabla k){
		if(k == null)
			return 0;
		return zbirElemenataStabla(k)*1.0 / brojElemenataStabla(k);
		
	}
	
	public static CvorStabla nadjiCvor(CvorStabla k,CvorStabla cvor){
		if(k == null || k == cvor)
			return k;
		
		CvorStabla pom = nadjiCvor(k.levo, cvor);
		if(pom != null)
			return pom;
		else return nadjiCvor(k.desno, cvor);
		
//		return (nadjiCvor(k.levo,cvor) != null) ? nadjiCvor(k.levo, cvor) : nadjiCvor(k.desno, cvor);
	}
	
	public static CvorStabla nadjiRoditelja(CvorStabla k,CvorStabla cvor){
		
		if(k.levo == cvor || k.desno == cvor || k == null)
			return k;
		
		
		if(nadjiCvor(k.levo, cvor) != null)
			return nadjiRoditelja(k.levo, cvor);
		else {
			if(nadjiCvor(k.desno, cvor) != null)
				return nadjiRoditelja(k.desno, cvor);
			else return null;
		}
		
	}
	
	public static CvorStabla nadjiCvor(CvorStabla k, int podatak){
		
		if(k == null)
			return null;
		if(k.podatak == podatak)
			return k;
		CvorStabla pom = nadjiCvor(k.levo, podatak);
		if(pom != null)
			return pom;
		else return nadjiCvor(k.desno, podatak);
		
	}
	
	public static CvorStabla nadjiRoditelja(CvorStabla k, int podatak){
		if(k == null)
			return k;
		if(k.levo != null && k.levo.podatak == podatak)
			return k;
		if(k.desno != null && k.desno.podatak == podatak)
			return k;
		
		if(nadjiCvor(k.levo, podatak) != null)
			return nadjiRoditelja(k.levo, podatak);
		else return nadjiRoditelja(k.desno, podatak);
		
	}
	
	public static void ispisi(CvorStabla k, CvorStabla cvor){
		if(k == null)
			return;
		if(k == cvor)
			System.out.print(k.podatak + " ");
		
		if(nadjiCvor(k.levo, cvor) != null){
			ispisi(k.levo, cvor);
			System.out.print(k.podatak + " ");
		}
		else if(nadjiCvor(k.desno, cvor) != null){
			ispisi(k.desno ,cvor);
			System.out.print(k.podatak + " ");
		}
		else return;
	}
	
	public static void ispisi(CvorStabla k ,int podatak){
		if(k == null)
			return;
		if(k.podatak == podatak && nadjiCvor(k.levo, podatak) == null && nadjiCvor(k.desno, podatak) == null)
			System.out.print(k.podatak + " ");
		
		if(nadjiCvor(k.levo, podatak) != null){
			System.out.print(k.podatak + " ");
			ispisi(k.levo, podatak);
		}
		else if(nadjiCvor(k.desno, podatak) != null){
			System.out.print(k.podatak + " ");
			ispisi(k.desno ,podatak);
		}
		else return;
		
	}
	
	public static void odstampajPutanjuOdCvoraDoKorena(CvorStabla k, int podatak){
		if(k == null)
			return;
		
		if(nadjiCvor(k.levo, podatak) != null){
			odstampajPutanjuOdCvoraDoKorena(k.levo, podatak);
			System.out.print(k.podatak + " ");
		}
		else if(nadjiCvor(k.desno, podatak) != null){
			odstampajPutanjuOdCvoraDoKorena(k.desno, podatak);
			System.out.print(k.podatak + " ");
		}else return;
		
	}
	
	public static int visina(CvorStabla k){
		if(k == null)
			return 0;
		
		else return 1 + max(visina(k.levo),visina(k.desno));
		
	}
	
	public static CvorStabla vratiNajdubljiCvor(CvorStabla k){
		if(k == null)
			return null;
		if(k.levo == null && k.desno == null)
			return k;
		
		return visina(k.levo) >= visina(k.desno) ? vratiNajdubljiCvor(k.levo) : vratiNajdubljiCvor(k.desno); 
		
	}
	
}
