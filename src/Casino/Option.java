package Casino;
import java.util.Scanner;

public class Option {
private static Blackjack jack = Haupt.getJack();
private static Slot slot = Haupt.getSlot();
private static Scanner scan = new Scanner(System.in);

private static String auswahl;
private static int Geldauswahl;
private static int maxEinsatz = 999999999;
private static int minEinsatz = 0;
private static int punkte = 21;
private static boolean elf = true;

    public static void Menu() throws InterruptedException {
    	Leeren();
    	System.out.println("Optionen");
		System.out.println("________________");
		System.out.println("Generell     |g");
		System.out.println("Blackjack    |b");
		System.out.println("Slot         |s");
		System.out.println("Menu(zurück) |m");
		System.out.println("_______________");
		System.out.print("Auswahl: ");
		auswahl = scan.next();
		switch(auswahl) {
		case "Generrell":
			Generell();
		case "Blackjack":
			Blackjack();
			break;
		case "blackjack":
			Blackjack();
			break;
		case "b":
			Blackjack();
			break;
		case "B":
			Blackjack();
			break;
		case "Slot":
			Slot();
			break;
		case "slot":
			Slot();
			break;
		case "s":
			Slot();
			break;
		case "S":
			Slot();
			break;
		case "Menu":
			Haupt.Menu();
			break;
		case "menu":
			Haupt.Menu();
			break;
		case "Menü":
			Haupt.Menu();
			break;
		case "menü":
			Haupt.Menu();
			break;
		case "m":
			Haupt.Menu();
			break;
		case "M":
			Haupt.Menu();
			break;
		case "Generell":
			Generell();
			break;
		case "generell":
			Generell();
			break;
		case "G":
			Generell();
			break;
		case "g":
			Generell();
			break;
		default:
			Leeren();
			System.out.println("Ungültige Eingabe!");
			Menu();
		}
    }

	private static void Generell() throws InterruptedException {
		Leeren();
		System.out.println("Optionen: Generell");
		System.out.println("____________________");
		System.out.println("Geld            | g");
		System.out.println("Option (zurück) | o");
		System.out.println("____________________");
		System.out.println("Eingabe: ");
		auswahl = scan.next();
		switch(auswahl) {
		case "Option":
			Menu();
			break;
		case "option":
			Menu();
			break;
		case "O":
			Menu();
			break;
		case "o":
			Menu();
			break;
		case "Geld":
			Geld();
			break;
		case "geld":
			Geld();
			break;
		case "G":
			Geld();
			break;
		case "g":
			Geld();
			break;
		default:
			Leeren();
			System.out.println("Ungültige Eingabe!");
			Generell();
		}
	}
	
	private static void Geld() throws InterruptedException {
		Leeren();
		System.out.print("Geld Betrag setzen: ");
		Geldauswahl = scan.nextInt();
		Haupt.setGeld(Geldauswahl);
		Menu();
	}
	
	private static void Blackjack() throws InterruptedException {
		Leeren();
		System.out.println("Optionen: Blackjack");
		System.out.println("_____________________");
		System.out.println("Max (max Einsatz setzen)    |x");
		System.out.println("Min (min Einsatz setzen     |n");
		System.out.println("Punkte (statt 21)           |p");
		System.out.println("11 (Regel aus/ein schalten) |r   beschreibung: Der Computer setzt automatisch eine 11 (bzw ass) auf eine 1 falls dies notwendig ist du kannst es aktivieren/deaktivieren für dich und den Dealer");
	    System.out.println("Menu (zurück)               |m");
		System.out.println("_______________________________");
	    System.out.print("Eingabe:" );
	    auswahl = scan.next();
	    switch(auswahl) {
	    case "Max":
	    	MaxEinsatz();
	    	break;
	    case "max":
	    	MaxEinsatz();
	    	break;
	    case "x":
	    	MaxEinsatz();
	    	break;
	    case "X":
	    	MaxEinsatz();
	    	break;
	    case "Min":
	    	MinEinsatz();
	    	break;
	    case "min":
	    	MinEinsatz();
	    	break;
	    case "n":
	    	MinEinsatz();
	    	break;
	    case "N":
	    	MinEinsatz();
	    	break;
	    case "Punkte":
	    	Punkte();
	    	break;
	    case "punkte":
	    	Punkte();
	    	break;
	    case "p":
	    	Punkte();
	    	break;
	    case "P":
	    	Punkte();
	    	break;
	    case "elf":
	    	Elf();
	    	break;
	    case "Elf":
	    	Elf();
	    	break;
	    case "11":
	    	Elf();
	    	break;
	    case "r":
	    	Elf();
	    	break;
	    case "Menu":
	    	Menu();
	    	break;
	    case "menu":
	    	Menu();
	    	break;
	    case "M":
	    	Menu();
	    	break;
	    case "m":
	    	Menu();
	    	break;
	    case "Menü":
	    	Menu();
	    	break;
	    default:
	    	System.out.println("Ungültige Eingabe!");
	    	Blackjack();
	    }
	}
	
	private static void Slot() {
		
	}
	
	private static void Leeren() {
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


	private static void MaxEinsatz() throws InterruptedException {
		Leeren();
		System.out.print("Max Einsatz: ");
		maxEinsatz = scan.nextInt();
		Blackjack();
	}
	
	private static void MinEinsatz() throws InterruptedException {
		Leeren();
		System.out.print("Min Einsatz: ");
		minEinsatz = scan.nextInt();
		Blackjack();
	}
    
	private static void Punkte() throws InterruptedException {
		Leeren();
		System.out.println("max Punkte: ");
		punkte = scan.nextInt();
		Blackjack();
	}
	
	private static void Elf() throws InterruptedException {
		Leeren();
		System.out.println("Elf Regel true/false machen?");
		System.out.print("Eingabe: ");
		elf = scan.nextBoolean();
		Blackjack();
	}
	
	public static int getGeldauswahl() {
		return Geldauswahl;
	}
	public static int getMaxEinsatz() {
		return maxEinsatz;
	}

	public static int getMinEinsatz() {
		return minEinsatz;
	}
	public static int getPunkte() {
		return punkte;
	}

	public static boolean getElf() {
		return elf;
	}
}