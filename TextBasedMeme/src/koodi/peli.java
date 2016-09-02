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
		String[] viholliset ={""};
		int maxhpv= 100;
		int maxatv= 25;
		
		//Pelaaja
		String pelaaja = null;
		String valinta1 = null;
		int hp=100;
		int at= 20;
		int potion=3;      //kuinka monta potionia pelaaja saa heti
		int potionhp=30;   //kuinka paljon potion healaa
		int potiondrop=50; //prosentti
		
		// peli
		int eka;
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("  _______        _   ____                     _ __  __                     ");
		System.out.println(" |__   __|      | | |  _ \\                   | |  \\/  |                    ");
		System.out.println("    | | _____  _| |_| |_) | __ _ ___  ___  __| | \\  / | ___ _ __ ___   ___ ");
		System.out.println("    | |/ _ \\ \\/ / __|  _ < / _` / __|/ _ \\/ _` | |\\/| |/ _ \\ '_ ` _ \\ / _ \\");
		System.out.println("    | |  __/>  <| |_| |_) | (_| \\__ \\  __/ (_| | |  | |  __/ | | | | |  __/");
		System.out.println("    |_|\\___/_/\\_\\__|____/ \\__,_|___/\\___|\\__,_|_|  |_|\\___|_| |_| |_|\\___|");
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
         	System.out.println("Ascii kuva");
         	System.out.println("------------------------------------------------------------------------------");
         	System.out.println("Sijainti: Kaupunki? | Päivämäärä: tuntematon | Aika: Yö?");
         	System.out.println(" -Havahdut kovaan ääneen- ");
         	System.out.println(pelaaja+": Mitä?");
         	System.out.println(" -Näet tyhjän kaupungin ympärilläsi- ");
         	System.out.println(" -Makaat kylmällä kadulla-");
         	System.out.println("Nousetko ylös?");
         	System.out.println("Kyllä vai Ei");
         	valinta1 = lukijas.nextLine();
         }
         if(valinta1.equals("Ei")){
         	System.out.println(" -Laitoit silmäsi kiinni- ");
         	System.out.println(" ");// lisää tähän paskaa kun peli on valmis. End credits, tarinan loppu jne
         	System.exit(0);
         }else if(valinta1.equals("Kyllä")){
         	System.out.println(" -Nouset ylös ja näet edessäsi pimeän ja kylmältä tuntuvan kaupungin- ");
         	System.out.println(pelaaja+": Missä olen? ");
         	System.out.println(" -Kun katsot loputtomalta tuntuvaa katua edessäsi, näet himmeän valon- ");
         	System.out.println(pelaaja+": Onko siellä jo..");
         	System.out.println(" -Et saa sanaasi loppuun koska kuulet saman kovan äänen uudestaan- ");
         	System.out.println(pelaaja+": Mistä tuo tulee?");
         	System.out.println(" - Käännyt ympäri ja huomaat että ääni kuuluu nyt edessäsi olevalta kujalta- ");
         	System.out.println(" -- ");
         	
}
}
}
