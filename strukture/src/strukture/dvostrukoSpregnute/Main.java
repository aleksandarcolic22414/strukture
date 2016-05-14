package strukture.dvostrukoSpregnute;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList<Integer> lista = new LinkedList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		Main.izbaciIzListe(lista);
	}
	
	public static Integer izbaciIzListe(LinkedList<Integer>lista){
		return lista.remove(3);
	}

}
