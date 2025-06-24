package Casino;
import java.util.Scanner;
import java.util.Random;

public class Blackjack {
	private static Random ran = new Random();
	private static Scanner scan = new Scanner(System.in);
	
	private static int Geld = Haupt.getGeld();
	private static int Einsatz;
	private static int maxEinsatz;
	
	private static int spielerZahl;
	private static int spielerZahl1 = 0;
	private static int spielerZahl2 = 0;
	private static int spielerZahl3 = 0;
	private static int spielerZahl4 = 0;
	private static int spielerZahl5 = 0;
	private static int spielerZahl6 = 0;
	private static int spielerZahl7 = 0;
	private static int spielerZahl8 = 0;
	
	private static int spielerPos = 0;
	private static String spielerAusgabe;
	private static int maximalEinsatz;
	private static int minimalEinsatz;
	private static int punkte;
	private static boolean elf;
	
	private static int dealerZahl;
	private static int dealerZahl1 = 0;
	private static int dealerZahl2 = 0;
	private static int dealerZahl3 = 0;
	private static int dealerZahl4 = 0;
	private static int dealerZahl5 = 0;
	private static int dealerZahl6 = 0;
	private static int dealerZahl7 = 0;
	private static int dealerZahl8 = 0;
	private static int dealerPos = 0;
	
	public static void Einsatz() throws InterruptedException {
		Geld = Haupt.getGeld();
		maximalEinsatz = Option.getMaxEinsatz();
		minimalEinsatz = Option.getMinEinsatz();
		punkte = Option.getPunkte();
		
		System.out.println("Wieviel Geld möchtest du setzen?");
		System.out.println("verfügbares Geld: " + Geld);
		System.out.print("Einsatz: ");
		Einsatz = scan.nextInt();
		
		if(Einsatz > maximalEinsatz) {
			Leeren();
			System.out.println("Du darfst nicht so viel wetten! Max Einsatz: " + maximalEinsatz);
			Einsatz();
		}
		if(Einsatz < minimalEinsatz) {
			Leeren();
			System.out.println("Du musst mehr wetten! Min Einsatz: " + minimalEinsatz);
		}
		if(Einsatz > Geld) {
			Leeren();
			System.out.println("Du hast nicht so viel Geld!");
			Einsatz();
		}else if(Einsatz <= Geld) {
			Geld = Geld - Einsatz;
			if(Einsatz < 0) {
				Leeren();
				System.out.println("Dein Einsatz ist weniger als 0 bitte ändern!");
			    Einsatz();
			}
			Leeren();
			Start();
		}
	}
	
	public static void Start() throws InterruptedException {
		spielerZahl1 = ran.nextInt(11) + 1;
		spielerZahl2 = ran.nextInt(11) + 1;
		spielerZahl3 = 0;
		spielerZahl4 = 0;
		spielerZahl5 = 0;
		spielerZahl6 = 0;
		spielerZahl7 = 0;
		spielerZahl8 = 0;
		spielerPos = 0;
		
		dealerZahl1 = ran.nextInt(11) + 1;
		dealerZahl2 = ran.nextInt(11) + 1;
		dealerZahl3 = 0;
		dealerZahl4 = 0;
		dealerZahl5 = 0;
		dealerZahl6 = 0;
		dealerZahl7 = 0;
		dealerZahl8 = 0;
		dealerPos = 0;
		
		SpielerKontrolle();
		DealerKontrolle();
		
		Update();
		System.out.println("Deine erste Zahl ist: " + spielerZahl1);
		System.out.println("Deine zweite Zahl ist: " + spielerZahl2);
		System.out.println("Gesamt: " + spielerZahl);
		System.out.println("____________________________________________");
		System.out.println("Eine Zahl des Dealers ist: " + dealerZahl1);
		System.out.println("");
		
		SpielerAbfrage();
		Update();
		while(dealerZahl < spielerZahl && dealerPos < 4) {
			DealerZiehen();
		}
		SpielerKontrolle();
		DealerKontrolle();
		Auslos();
	}
	
    public static void SpielerKontrolle() {
    	Update();
    	elf = Option.getElf();
    	if(elf == true) {
    		if(spielerZahl > punkte) {
    			if(spielerZahl1 == 11) {
    				spielerZahl1 = 1;
    			}else if(spielerZahl2 == 11) {
    				spielerZahl2 = 1;
    			}else if(spielerZahl3 == 11) {
    				spielerZahl3 = 1;
    			}else if(spielerZahl4 == 11) {
    				spielerZahl4 = 1;
    			}else if(spielerZahl5 == 11) {
    				spielerZahl5 = 1;
    			}else if(spielerZahl6 == 11) {
    				spielerZahl6 = 1;
    			}
    		}	
    	}
	}
	
	public static void DealerKontrolle() {
    	Update();
    	elf = Option.getElf();
    	if(elf == true) {
    		if(dealerZahl > punkte) {
    			if(dealerZahl1 == 11) {
    				dealerZahl1 = 1;
    			}else if(dealerZahl2 == 11) {
    				dealerZahl2 = 1;
    			}else if(dealerZahl3 == 11) {
    				dealerZahl3 = 1;
    			}else if(dealerZahl4 == 11) {
    				dealerZahl4 = 1;
    			}else if(dealerZahl5 == 11) {
    				dealerZahl5 = 1;
    			}else if(dealerZahl6 == 11) {
    				dealerZahl6 = 1;
    			}
    		}	
    	}
	}
	
	public static void SpielerAbfrage() throws InterruptedException {
		System.out.println("Möchtest du noch eine Ziehen? ja/nein");
		spielerAusgabe = scan.next();
		switch(spielerAusgabe) {
		case "ja":
			SpielerZiehen();
			break;
		case "nein":
			break;
		default:
			System.out.println("Ungültiges Schlüsselwort! Bitte achte auf Groß und Kleinschreibung");
			SpielerAbfrage();
			break;
		}
	}
	
	public static void SpielerZiehen() throws InterruptedException {
		switch(spielerPos) {
		case 0:
			spielerZahl3 = ran.nextInt(11) + 1;
			spielerPos++;
			SpielerKontrolle();
			Leeren();
			System.out.println("Deine dritte Zahl ist: " + spielerZahl3);
			Update();
			if(spielerZahl > punkte) {
					Auslos();
			}else {
				System.out.println("Gesamt: " + spielerZahl);
				SpielerAbfrage();
			}
			break;
		case 1:
			spielerZahl4 = ran.nextInt(11) + 1;
			spielerPos++;
			SpielerKontrolle();
			Leeren();
			System.out.println("Deine vierte Zahl ist: " + spielerZahl3);
			Update();
			if(spielerZahl > punkte) {
					Auslos();
			}else {
				System.out.println("Gesamt: " + spielerZahl);
				SpielerAbfrage();
			}
			break;
		case 2:
			spielerZahl5 = ran.nextInt(11) + 1;
			spielerPos++;
			SpielerKontrolle();
			Leeren();
			System.out.println("Deine fünfte Zahl ist: " + spielerZahl3);
			Update();
			if(spielerZahl > punkte) {
					Auslos();
			}else {
				System.out.println("Gesamt: " + spielerZahl);
				SpielerAbfrage();
			}
			break;
		case 3:
			spielerZahl6 = ran.nextInt(11) + 1;
			spielerPos++;
			SpielerKontrolle();
			Leeren();
			System.out.println("Deine sechste Zahl ist: " + spielerZahl3);
			Update();
			if(spielerZahl > punkte) {
					Auslos();
			}else {
				System.out.println("Gesamt: " + spielerZahl);
				SpielerAbfrage();
			}
			break;
		default:
			System.out.println("Du kannst nicht mehr Ziehen!");
			break;
		}
	}
	
	public static void DealerZiehen() {
		Update();
		if(dealerZahl < spielerZahl && spielerZahl < punkte + 1) {
			switch(dealerPos) {
			case 0:
				dealerZahl3 = ran.nextInt(11) + 1;
				dealerPos++;
				break;
			case 1:
				dealerZahl4 = ran.nextInt(11) + 1;
				dealerPos++;
				break;
			case 2:
				dealerZahl5 = ran.nextInt(11) + 1;
				dealerPos++;
				break;
			case 3:
				dealerZahl6 = ran.nextInt(11) + 1;
				dealerPos++;
				break;
			default:
			    System.out.println("Error: Dealer kann nicht mehr ziehen");
			    break;
			}
			Update();
		}
	}
	
	public static void Auslos() throws InterruptedException {
		Update();
		Leeren();
		if(spielerZahl > dealerZahl && spielerZahl < punkte + 1) {
			System.out.println("Du hast gewonnen!");
			Geld = Geld + Einsatz * 2;
			Haupt.setGeld(Geld);
			System.out.println("Dein Einsatz war: " + Einsatz);
			System.out.println("Dein neuer Geld wert: " + Geld);
		}
		
		if(spielerZahl < dealerZahl && dealerZahl > punkte) {
			System.out.println("Du hast gewonnen!");
			Geld = Geld + Einsatz * 2;
			Haupt.setGeld(Geld);
			System.out.println("Dein Einsatz war: " + Einsatz);
			System.out.println("Dein neuer Geld wert: " + Geld);
		}
		
		if(dealerZahl < spielerZahl && spielerZahl > punkte) {
			System.out.println("Der Dealer hat gewonnen!");
			Haupt.setGeld(Geld);
			System.out.println("Dein Einsatz war: " + Einsatz);
			System.out.println("Dein neuer Geld wert: " + Geld);
		}
		
		if(dealerZahl > spielerZahl && dealerZahl < punkte + 1) {
			System.out.println("Der Dealer hat gewonnen!");
			Haupt.setGeld(Geld);
			System.out.println("Dein Einsatz war: " + Einsatz);
			System.out.println("Dein neuer Geld wert: " + Geld);
		}
		
		if(dealerZahl == spielerZahl && dealerZahl < punkte + 1) {
			System.out.println("Keiner hat gewonnen! Unentschieden!");
		}
		
		System.out.println("Zahl 1: " + spielerZahl1);
		System.out.println("Zahl 2: " + spielerZahl2);
		if(spielerZahl3 != 0) {
			System.out.println("Zahl 3: " + spielerZahl3);
		}
		if(spielerZahl4 != 0) {
			System.out.println("Zahl 4: " + spielerZahl4);
		}
		if(spielerZahl5 != 0) {
			System.out.println("Zahl 5: " + spielerZahl5);
		}
		if(spielerZahl6 != 0) {
			System.out.println("Zahl 6: " + spielerZahl6);
		}
		
		System.out.println("Gesamt: " + spielerZahl);
		System.out.println("_________________________");
		System.out.println("Dealer Zahlen: ");
		System.out.println("Zahl 1: " + dealerZahl1);
		System.out.println("Zahl 2: " + dealerZahl2);
		if(dealerZahl3 != 0) {
			System.out.println("Zahl 3: " + dealerZahl3);
		}
		if(dealerZahl4 != 0) {
			System.out.println("Zahl 4: " + dealerZahl4);
		}
		if(dealerZahl5 != 0) {
			System.out.println("Zahl 5: " + dealerZahl5);
		}
		if(dealerZahl6 != 0) {
			System.out.println("Zahl 6: " + dealerZahl6);
		}
		System.out.println("Gesamt Dealer: " + dealerZahl);
		Neustart();
	}

	public static void Neustart() throws InterruptedException {
		System.out.println("");
		System.out.println("Neustart? ja/nein");
		spielerAusgabe = scan.next();
		switch(spielerAusgabe) {
		case "ja":
			Leeren();
			Einsatz();
		case "nein":
			Haupt.Menu();
			break;
		case "default":
			System.out.println("Eingabe nicht erkannt! bitte achte auf Groß und Kleinschreibung!");
			Neustart();
		}
	}
	
	public static void Update() {
		dealerZahl = dealerZahl1 + dealerZahl2 + dealerZahl3 + dealerZahl4 + dealerZahl5 + dealerZahl6 + dealerZahl7 + dealerZahl8;
		spielerZahl = spielerZahl1 + spielerZahl2 + spielerZahl3 + spielerZahl4 + spielerZahl5 + spielerZahl6 + spielerZahl7 + spielerZahl8;
	}
	
	public static void Leeren() {
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
	}

}
