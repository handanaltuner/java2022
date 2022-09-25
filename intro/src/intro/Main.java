package intro;

import java.util.Iterator;

public class Main {

	//main javada başlangıç noktasıdır
	public static void main(String[] args) {
		System.out.println("Hello World");

		//Değişken isimlendirmeleri camelCase yazılır
		String ortaMetin = "ilginizi çekebilir";
		String altMetin = "Vade süresi";
				
		System.out.println(ortaMetin);
		
		int vade =12;
		
		double dolarDun = 18.25;
		double dolarBugun= 18.30;
		
		boolean dolarDustuMu= false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {//true
			okYonu= "down.svg";
			System.out.println(okYonu);
			
		} else if(dolarBugun>dolarDun) {
			okYonu= "up.svg";
			System.out.println(okYonu);
			
		} 
			
		else {
			okYonu= "equal.svg";
			System.out.println(okYonu);

		}
		
		//array
		
		String [] krediler = {"Hızlı kredi","Maaşını Halkbanktan","Mutlu Emekli"};

		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}
	
}
