package Casino;
import java.util.Scanner;

public class Haupt {
    private static int geld = 2000;
    private static String angabe;
    
    private static Scanner scan = new Scanner(System.in);
    private static Blackjack jack = new Blackjack();
    private static Slot slot = new Slot();

    public static void main(String[] args) throws InterruptedException {
        Menu();
    }
    
    public static void Menu() throws InterruptedException {
    	Leeren();
    	System.out.println("–––Menü–––   |Geld: " + geld);
    	System.out.println("- Blackjack  |b");
    	System.out.println("- Slot       |s");
    	System.out.println("- Optionen   |o ");
    	System.out.println("______________");
    	System.out.print("Spiel: ");
    	angabe = scan.next();
    	switch(angabe) {
    	case "Blackjack":
    		Leeren();
    		jack.Einsatz();
    		break;
    	case "blackjack":
    		Leeren();
    		jack.Einsatz();
    		break;
    	case "b":
    		Leeren();
    		jack.Einsatz();
    		break;
    	case "B":
    		Leeren();
    		jack.Einsatz();
    		break;
    	case "Slot":
    		Leeren();
    		slot.Einsatz();
    		break;
    	case "slot":
    		Leeren();
    		slot.Einsatz();
    		break;
    	case "s":
    		Leeren();
    		slot.Einsatz();
    		break;
    	case "S":
    		Leeren();
    		slot.Einsatz();
    		break;
    	case "Option":
    		Leeren();
    		Option.Menu();
    		break;
    	case "option":
    		Leeren();
    		Option.Menu();
    	case "o":
    		Leeren();
    		Option.Menu();
    		break;
    	case "O":
    		Leeren();
    		Option.Menu();
    	default:
    		Leeren();
    		System.out.println("Ungültige Eingabe!");
    		Menu();
    	}
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
    }

    public static int getGeld() {
        return geld;
    }
    public static Blackjack getJack() {
    	return jack;
    }
    public static Slot getSlot() {
    	return slot;
    }
    public static void setGeld(int geld) {
        Haupt.geld = geld;
    }
}
