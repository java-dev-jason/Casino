package Casino;
import java.util.Random;
import java.util.Scanner;

public class Slot {
private static Random ran = new Random();
private static Scanner scan = new Scanner(System.in);

private static int gewonnen = 0;
private static int einsatz = 0;
private static int geld = Haupt.getGeld();
private static int durchlaufZahl = 5;
private static String angabe = "";

private static int randomNr11;
private static int randomNr12;
private static int randomNr13;
private static int randomNr21;
private static int randomNr22;
private static int randomNr23;
private static int randomNr31;
private static int randomNr32;
private static int randomNr33;

    public static void Einsatz() throws InterruptedException  {
    	geld = Haupt.getGeld();
    	Leeren();
    	System.out.println("Geld: " + geld);
    	System.out.println("_____________");
    	System.out.print("Einsatz: ");
    	einsatz = scan.nextInt();
    	if(einsatz > geld) {
    		Leeren();
    		System.out.println("Du hast nicht so viel Geld!");
    		Einsatz();
    	}else if(einsatz <= geld) {
			geld = geld - einsatz;
			Haupt.setGeld(geld);
    	}
    	if(einsatz < 0) {
    		Leeren();
    		System.out.println("Du kannst nicht weniger als 0 setzen!");
    		Einsatz();
    	}
    	Durchlauf();
    }

	private static void Durchlauf() throws InterruptedException {
		for(int i = 0; i < durchlaufZahl; i++) {
			Leeren();
			for(int j = 0; j < 3; j++) {
				switch(j) {
				case 0:
					randomNr11 = ran.nextInt(5) + 1;
					randomNr12 = ran.nextInt(5) + 1;
					randomNr13 = ran.nextInt(5) + 1;
					
					switch(randomNr11) {
					case 1:
						System.out.print(" £ ");
						break;
					case 2:
						System.out.print(" ¥ ");
						break;
					case 3:
						System.out.print(" Ψ ");
						break;
					case 4:
						System.out.print(" Ω ");
						break;
					case 5:
						System.out.print(" ∞ ");
						break;
					}
					
					switch(randomNr12) {
					case 1:
						System.out.print(" £ ");
						break;
					case 2:
						System.out.print(" ¥ ");
						break;
					case 3:
						System.out.print(" Ψ ");
						break;
					case 4:
						System.out.print(" Ω ");
						break;
					case 5:
						System.out.print(" ∞ ");
						break;
					}
					
					switch(randomNr13) {
					case 1:
						System.out.print(" £ ");
						break;
					case 2:
						System.out.print(" ¥ ");
						break;
					case 3:
						System.out.print(" Ψ ");
						break;
					case 4:
						System.out.print(" Ω ");
						break;
					case 5:
						System.out.print(" ∞ ");
						break;
					}
					
					break;
				case 1: 
					randomNr21 = ran.nextInt(5) + 1;
					randomNr22 = ran.nextInt(5) + 1;
					randomNr23 = ran.nextInt(5) + 1;
					
					switch(randomNr21) {
					case 1:
						System.out.print(" £ ");
						break;
					case 2:
						System.out.print(" ¥ ");
						break;
					case 3:
						System.out.print(" Ψ ");
						break;
					case 4:
						System.out.print(" Ω ");
						break;
					case 5:
						System.out.print(" ∞ ");
						break;
					}
					
					switch(randomNr22) {
					case 1:
						System.out.print(" £ ");
						break;
					case 2:
						System.out.print(" ¥ ");
						break;
					case 3:
						System.out.print(" Ψ ");
						break;
					case 4:
						System.out.print(" Ω ");
						break;
					case 5:
						System.out.print(" ∞ ");
						break;
					}
					
					switch(randomNr23) {
					case 1:
						System.out.print(" £ ");
						break;
					case 2:
						System.out.print(" ¥ ");
						break;
					case 3:
						System.out.print(" Ψ ");
						break;
					case 4:
						System.out.print(" Ω ");
						break;
					case 5:
						System.out.print(" ∞ ");
						break;
					}
					break;
				case 2:
					randomNr31 = ran.nextInt(5) + 1;
					randomNr32 = ran.nextInt(5) + 1;
					randomNr33 = ran.nextInt(5) + 1;
					
					switch(randomNr31) {
					case 1:
						System.out.print(" £ ");
						break;
					case 2:
						System.out.print(" ¥ ");
						break;
					case 3:
						System.out.print(" Ψ ");
						break;
					case 4:
						System.out.print(" Ω ");
						break;
					case 5:
						System.out.print(" ∞ ");
						break;
					}
					
					switch(randomNr32) {
					case 1:
						System.out.print(" £ ");
						break;
					case 2:
						System.out.print(" ¥ ");
						break;
					case 3:
						System.out.print(" Ψ ");
						break;
					case 4:
						System.out.print(" Ω ");
						break;
					case 5:
						System.out.print(" ∞ ");
						break;
					}
					
					switch(randomNr33) {
					case 1:
						System.out.print(" £ ");
						break;
					case 2:
						System.out.print(" ¥ ");
						break;
					case 3:
						System.out.print(" Ψ ");
						break;
					case 4:
						System.out.print(" Ω ");
						break;
					case 5:
						System.out.print(" ∞ ");
						break;
					}
					break;
				}
				System.out.println("");
			}
			
			Thread.sleep(1000);
		}
		Auswertung();
	}
	
	private static void Auswertung() throws InterruptedException {
		System.out.println("_________");
		if(randomNr11 == randomNr12 && randomNr12 == randomNr13) {
			System.out.println("O O O");
			System.out.println("- - -");
			System.out.println("- - -");
			System.out.println("______");
			gewonnen++;
		}
		if(randomNr21 == randomNr22 && randomNr22 == randomNr23) {
			System.out.println("- - -");
			System.out.println("O O O");
			System.out.println("- - -");
			System.out.println("______");
			gewonnen++;
		}
		if(randomNr31 == randomNr32 && randomNr32 == randomNr33) {
			System.out.println("- - -");
			System.out.println("- - -");
			System.out.println("O O O");
			System.out.println("______");
			gewonnen++;
		}
		if(randomNr11 == randomNr22 && randomNr22 == randomNr33) {
			System.out.println("O - -");
			System.out.println("- O -");
			System.out.println("- - O");
			System.out.println("______");
			gewonnen++;
		}
		if(randomNr13 == randomNr22 && randomNr22 == randomNr31) {
			System.out.println("- - O");
			System.out.println("- O -");
			System.out.println("O - -");
			System.out.println("______");
			gewonnen++;
		}
		if(randomNr11 == randomNr21 && randomNr21 == randomNr31) {
			System.out.println("O - -");
			System.out.println("O - -");
			System.out.println("O - -");
			System.out.println("______");
			gewonnen++;
		}
		if(randomNr12 == randomNr22 && randomNr22 == randomNr32) {
			System.out.println("- O -");
			System.out.println("- O -");
			System.out.println("- O -");
			System.out.println("______");
			gewonnen++;
		}
		if(randomNr13 == randomNr23 && randomNr23 == randomNr33) {
			System.out.println("- - O");
			System.out.println("- - O");
			System.out.println("- - O");
			System.out.println("______");
			gewonnen++;
		}
		 if(gewonnen != 0) {
			 System.out.println("Gewonnen!");
			 Auszahlen();
			 Neustart();
		 }else {
			 System.out.println("Verloren!");
			 Neustart();
		 }
	}
	
	private static void Auszahlen() {
		switch(gewonnen) {
		case 1:
			System.out.println("Geld: + " + einsatz * 2);
			geld = geld + einsatz * 2;
			break;
		case 2:
			System.out.println("Geld: + " + einsatz * 3);
			geld = geld + einsatz * 3;
			break;
		case 3:
			System.out.println("Geld: + " + einsatz * 4);
			geld = geld + einsatz * 4;
			break;
		case 4:
			System.out.println("Geld: + " + einsatz * 5);
			geld = geld + einsatz * 5;
			break;
		case 5:
			System.out.println("Geld: + " + einsatz * 6);
			geld = geld + einsatz * 6;
			break;
		case 6:
			System.out.println("Geld: + " + einsatz * 7);
			geld = geld + einsatz * 7;
			break;
		case 7:
			System.out.println("Geld: + " + einsatz * 8);
			geld = geld + einsatz * 8;
			break;
		case 8:
			System.out.println("Geld: + " + einsatz * 8);
			geld = geld + einsatz * 8;
			break;
		}
		Haupt.setGeld(geld);
		System.out.println("Gesamt Geld: " + geld);
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
	
	private static void DatenLeeren() {
		gewonnen = 0;
	}
	
	private static void Neustart() throws InterruptedException {
		System.out.println("Neustart? ja/nein (zurück zum Menü)");
		angabe = scan.next();
		switch(angabe) {
		case "ja":
			DatenLeeren();
			Leeren();
			Einsatz();
			break;
		case "nein":
			Haupt.Menu();
			break;
		default:
			System.out.println("Ungültige Eingabe! Bitte achte auf Groß und Kleins");
			Neustart();
		}
	}

}
