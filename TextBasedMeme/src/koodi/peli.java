package koodi;
	import java.io.IOException;
	import java.util.Random;
	import java.util.Scanner;

	public class peli {
		public static void main(String[] args) throws IOException{
			
			Scanner lukijaint = new Scanner( System.in );
			Scanner lukijas = new Scanner( System.in );
			Random rand = new Random();
			
			//Tähän laitetaan niitten scriptattujen eventtien vihollisten nimet, hp ja attack.
			String[] koirat ={"Pörö Koira", "Tolkien Koira","Burgeri Koira","Tavi Koira","Api Koira","Spörö Koira","Ravi Koira","YLYL Koira","gOIRa"}; //koiran nimiä. et peli randomilla valitsee jonkun näist.
			String[] koiraAse ={"Luu","Irronnut luu","I've got a bone to pick with you","Haukuttaja","Much WOW","Luutin"};
			int maxhpv= 100;
			int maxatv= 45;
			
			//Pelaaja
			String pelaaja = null;
			int hp=100;
			int at= 20;
			int koiraAt=3;
			int potion=3;      //kuinka monta potionia pelaaja saa heti
			int potionhp=30;   //kuinka paljon potion healaa
			int potiondrop=35; //prosentti
			int koiradrop=33; // aseen drop rate
			
			
			// peli
			int eka;
			String valinta1 = null;
			String valinta2 = null;
			String valinta3 = null;
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("     __ __ _  _          _______                _     _              ___");
			System.out.println("    |  \\/  (_) |        |__   __|              | |   | |            |__ \\ ");
			System.out.println("    | \\  / |_| |_ __ _     | | __ _ _ __   __ _| |__ | |_ _   _ _   _  ) |");
			System.out.println("    | |\\/| | | __/ _` |    | |/ _` | '_ \\ / _` | '_ \\| __| | | | | | |/ /");
			System.out.println("    | |  | | | || (_| |    | | (_| | |_) | (_| | | | | |_| |_| | |_| |_|");
			System.out.println("    |_|  |_|_|\\__\\__,_|    |_|\\__,_| .__/ \\__,_|_| |_|\\__|\\__,_|\\__,_(_)  ");
			System.out.println("                           |_|                                  ");
			System.out.println("");
			System.out.println("                         -The Text Adventure Game-                  ");
	        	System.out.println("------------------------------------------------------------------------------");
	        System.out.println("");
	        
	        System.out.println("Aloita peli | [1]");
	        System.out.println("Lopeta peli | [2]");
	        
	        eka = lukijaint.nextInt();
	 
	         while(eka !=1 & eka !=2){
	        	System.out.println("Komentoa ei tunnistettu");
	        	System.out.println("");
	        	System.out.println("");
	        	System.out.println("Aloita peli | [1]");
	         	System.out.println("Lopeta peli | [2]");
	            eka = lukijaint.nextInt();
	         
	        }
	         if(eka==2){
	         	System.out.println("Lopetit pelin");
	         	System.out.println("Paina ENTER lopettaaksesi");
	         	lukijas.nextLine();
	         	System.exit(0);
	         }else if(eka==1){
	         	System.out.println("Kerro nimesi:");
	         	pelaaja = lukijas.nextLine();
	         	
	         	System.out.println("Selvä "+pelaaja+"!");
	         	System.out.println("Paina ENTER jatkaaksesi");
	         	lukijas.nextLine();
	         	System.out.println("");
	         	System.out.println("Peli Alkaa...");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("");
	         	System.out.println("------------------------------------------------------------------------------");
	         	System.out.println("_______      /\\                  &                                            ");
	         	System.out.println("|o o o|     /--\\               &&                                             ");
	         	System.out.println("|o o o|    /----\\          ___II__                                            ");
	         	System.out.println("|o o o|    | OO |          |  0  |                       /\\                   ");
	         	System.out.println("|o o o| 0  | OO |   /  \\   |  0  |       /\\      ()     /__\\                  ");
	         	System.out.println("|o o o| |  | OO |  / || \\  |  0  |      /__\\    (__)   /____\\                 ");
	         	System.out.println("|__A__| |  |_AA_| /  ||  \\ |__A__| |-----||------||------||------|            ");
	         	System.out.println("------------------------------------------------------------------------------");
	         	System.out.println("Sijainti: Kaupunki? | Päivämäärä: tuntematon | Aika: Yö?");
	         	System.out.println(" -Kuulet kovan äänen- ");
	         	System.out.println("");
	         	System.out.println(pelaaja+": Mitä?");
	         	System.out.println(" -Avaat silmäsi ja huomaat että makaat pimeällä, kylmällä kadulla- ");
	         	System.out.println("");
	         	System.out.println("Nousetko ylös?");
	         	System.out.println("Kyllä vai Ei");
	         	valinta1 = lukijas.nextLine();
	         }
	         if(valinta1.equals("Ei") || valinta1.equals("ei")){
	         	System.out.println(" -Laitoit silmäsi kiinni- ");
	         	System.out.println(" ");// lisää tähän paskaa kun peli on valmis. End credits, tarinan loppu jne
	         	System.exit(0);
	         }else if(valinta1.equals("Kyllä") || valinta1.equals("kyllä")){
	         	System.out.println(" -Nouset ylös, näkösi on vähän sumea ja päätäsi särkee- ");
	         	System.out.println("");
	         	System.out.println(pelaaja+": Missä olen? ");
	         	System.out.println(" -Hierot silmiäsi- ");
	         	System.out.println(" -Kun näkösi selvenee katsot ympärillesi ja huomaat maassa kolme pulloa jossa on punaista nestettä. Pullossa lukee HP- ");
				System.out.println(" -Otat pullot maasta ja pistät ne taskuun. Huomaat loputtomalta tuntuvan kadun päässä valon");
				System.out.println("");
	         	System.out.println(pelaaja+": Onko siellä joku?");
	         	System.out.println(" -Kuulet saman kovan äänen uudestaan- ");
	         	System.out.println("");
	         	System.out.println(pelaaja+": Mistä tuo tulee?");
	         	System.out.println(" - Käännyt ympäri ja huomaat että ääni kuuluu nyt edessäsi olevalta kujalta- ");
	         	System.out.println("");
	         	System.out.println(" Seuraatko ääntä? ");
	         	System.out.println("Kyllä vai Ei");
	         	valinta2 = lukijas.nextLine();
	         
	         
	         if(valinta2.equals("Ei") || valinta2.equals("ei")){
	         	System.out.println(" -Lähdet seuraamaan aiemmin näkemääsi valoa- ");
	         	System.out.println(" ");// TIE 1: JOKU LISÄÄ TÄHÄN PASKAA
	         	System.out.println(" -Matkalla valoa päin, sinut pysäyttää mustiin pukeutunut mies");
	         	System.out.println("?: Hei kamu, tuuks mukaan? Mennää mettää");
	         	System.out.println("?: Jos tuut messii, voin pitää sut turvassa");
	         	System.out.println(" ");
	         	System.out.println(" Menetkö hänen mukaan? ");
	         	System.out.println("Kyllä vai Ei");
	         	valinta3 = lukijas.nextLine();
	         	
	         	if(valinta3.equals("Ei") || valinta3.equals("ei")){
	         		System.out.println(" -Et huomio miestä ja jatkat matkaa");
	         		System.out.println(" ");
	         		System.out.println(" -Pääset vihdoin valon tuottajan luokse");
	         		System.out.println("                 ______");
                    System.out.println("                /      \\"); 
                    System.out.println("               /  __   /"); 
                    System.out.println("              /  /-/  /");
                    System.out.println("             /  /O/  /");
                    System.out.println("            /___    /");
                    System.out.println("           /    \\ /");
                    System.out.println("     ----  |(O) | / ----");
                    System.out.println("        ´  \\____//  ´ ");
                    System.out.println("       ´  ´ /  \\    ´  ´");
                    System.out.println("      ´  ´ /    \\  ´  ´");
					System.out.println(" -Huomaat, että valon tuottaja oli todella vahva taskulamppu"); //TIE 4: JOKU LISÄÄ TÄHÄN PASKAA
	         		
	         	}else if(valinta3.equals("Kyllä") || valinta3.equals("kyllä")){ // TIE 3: JOKU LISÄÄ TÄHÄN PASKAA
	         		
	         	}	
	         	
	         }else if(valinta2.equals("Kyllä") || valinta2.equals("kyllä")){ // TIE 2: JOKU LISÄÄ TÄHÄN PASKAA
	        	 System.out.println("Kävelet kujaa päin ja eteesi hyppää villi koira");
	        	 System.out.println("");
	        	 System.out.println(pelaaja+": Kiltti koira, en tahdo sinulle pahaa");
	        	 System.out.println("Koira murisee ja hyökkää. Sinun on pakko taistella");
	        	 
	        	 int hpv = rand.nextInt (maxhpv);
	        	 int atv = rand.nextInt(maxatv);
	        	 String koira = koirat[rand.nextInt(koirat.length)];
	        	 System.out.println("------------------------------------------------------------------------------");
	        	 System.out.println("                  /\\__/\\ ");
                 System.out.println("               __/ O  O \\_");
                 System.out.println("              /          __\\O");
                 System.out.println("              |	        |");
				 System.out.println("              \\        /");								
	        	 System.out.println("\t# " + koira + " ilmestyi! #\n" );
	        	 System.out.println("------------------------------------------------------------------------------");
	        	 
	        	 
	        	 while(hpv > 0) {
	        		 System.out.println("\t" + koira + "n HP: "+ hpv);
	        		 System.out.println("\t "+pelaaja+" HP: " + hp);
	        		 System.out.println("\n\tMitä teet?");
	        		 System.out.println("\t1. Hyökkää");
	        		 System.out.println("\t2. Juo HP juoma");
	        		 
	        		 String t1 = lukijas.nextLine();
	        		 if(t1.equals("1")) {
	        			 int hyökkäys = rand.nextInt(at);
	        			 int vahinko = rand.nextInt(atv);
	        			 
	        			 hpv -= hyökkäys;
	        			 hp -= vahinko;
	        			 
	        			 System.out.println("\t> "+pelaaja+" lyö ja osuu "+koira+"an ja tekee "+hyökkäys+ " vahinkoa");
	        			 System.out.println("\t> "+koira+" osuu ja "+pelaaja+" menettää "+vahinko+" Hp pistettä");
	        			 System.out.println("");
	        			 
	        			 if(hp < 1) {
	        				 System.out.println(pelaaja+" on saanut liian paljon vahinkoa");
	        				 System.out.println("-Näkösi sumenee ja menetät tajuntasi-");
	        				 System.out.println("Paina ENTER jatkaaksesi");
	        		         	lukijas.nextLine();
	        				 System.out.println("");// lisää credits tähän
	        			 }
	        				 
	        			 }
	        		 else if(t1.equals("2")) {
	        			 if(potion > 0) {
	        				 hp += potionhp;
	        				 potion--;
	        				 System.out.println("\t> "+pelaaja+" Juo HP juoman ja saa "+potionhp+ "HP:ta takaisin");
	        				 System.out.println("");
	        				 System.out.println("\n\t> "+pelaaja+": HP on nyt "+hp+" HP pistettä");
	        				 System.out.println("\n\t> "+pelaaja+": HP juomia on nyt "+potion+"\n");
	        			 }
	        			 else {
	        				 System.out.println(pelaaja+": Huomaat että sinulla ei enään ole pulloja...");
	        			 }
	        			 
	        		 }
	        		 else {
	        			 System.out.println("Komentoa ei tunnistettu");
	        		 }
	        	 }
	        	 System.out.println("------------------------------------------------------------------------------");
	        	 System.out.println("                  /\\__/\\ ");
                 System.out.println("               __/ X   X \\_");
                 System.out.println("              /          __\\O");
                 System.out.println("              |	        |");
				 System.out.println("              \\        /");		
	        	 System.out.println("\t# " + koira + " voitettiin! #\n" );
	        	 System.out.println("\t# "+pelaaja+": Minulle jäi "+hp+" HP:ta jäljelle #\n" );
	        	 System.out.println("------------------------------------------------------------------------------");
	        	 if(rand.nextInt(100) < potiondrop) {
	        		 potion++;
	        		 System.out.println(pelaaja+": Löysin yhden HP pullon");
	        		 System.out.println(pelaaja+": HP pulloja on nyt "+potion);
	        	 }
	        	 if(rand.nextInt(100) < koiradrop) {
	        		String ase = koiraAse [rand.nextInt(koiraAse.length)];
	        		 at+=koiraAt;
	        		 System.out.println(pelaaja+": Löysin "+ase+" aseen");
	        		 System.out.println(" __                                  __"); 
                     System.out.println("/  \\________________________________/  \\");
                     System.out.println("\\                                      / ");
                     System.out.println("/    ________________________________  \\");
                     System.out.println("\\__/                                \\__/");
					 System.out.println(pelaaja+": Hyökkäykseni tekee nyt maximissaan "+at+" vahinkoa");
	        	 }
	        	 System.out.println(""); // Jatka tarinaa tästä
	        
	         }else{//jos et vastaa oikein tokaan kysymykseen
	      		System.out.println("Tuntematon komento");
	      	}
		
	}
	         else{ //jos et vastaa oikein nousetko ylös kysymykseen
	      		System.out.println("Tuntematon komento");
	      	}
	}
	}