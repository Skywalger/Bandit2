import java.util.Scanner;

/**
 * @author Sky aka. David Leister
 */
public class Mechanik {
    
    Scanner scan = new Scanner(System.in);

    int[] rollen = new int[3];
    int guthaben = 10;
    boolean lose = false;

    void rolleFuellen() {

        for (int i = 0; i < rollen.length; i++) {
            rollen[i] = (int) (Math.random() * 7) + 1;

        }
    }

    void wurfAnzeigen() throws InterruptedException {
        
        System.out.println("Ihr Ergebnis ist");
        Thread.sleep((int)(Math.random()*2000)+1);
        System.out.println("   -------------\n   |  B4NDIT   |");
        System.out.printf("   -------------\n   | %d | %d | %d |\n   -------------\n", rollen[0], rollen[1], rollen[2]);
        System.out.println("   |   |   |   |\n   |   |   |   |\n   |   |   |   |\n   -------------");
        Thread.sleep(500);
    }

    void ergebnisBerechnenUndAusgeben() {

        if (rollen[0] == rollen[1] && rollen[0] == rollen[2]) {
            System.out.printf("\nSie haben 3 Richtige! Glückwunsch\nSie haben %d Guthaben gewonnen\n", 10);
            guthaben += 10;
        } else if (rollen[0] == rollen[1] || rollen[2] == rollen[1] || rollen[0] == rollen[2]) {
            System.out.printf("\nSie haben 2 Richtige! Glückwunsch\nSie haben %d Guthaben gewonnen\n", 3);
            guthaben += 3;
        } else {
            System.out.println("\nLeider keine Übereinstimmungen :( ");
        }
    }
    boolean guthabenCheck(){
        
        if (guthaben < 1) {
            System.out.println("\nSie sind pleite! Starten Sie das Spiel neu, falls Sie Ihr Glück noch mal versuchen wollen.");
            lose = true;
        }
        return lose;
    }
    
    char weiterspielenUndGuthaben(){
        char frage;
        System.out.println("Guthaben = " + guthaben);
            System.out.println("Möchten Sie weiterspielen? j=JA / n=NEIN");
            frage = scan.next().charAt(0);
            return frage;
    }
}
