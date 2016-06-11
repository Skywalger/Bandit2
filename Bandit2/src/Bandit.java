/**
 * @author Sky aka. David Leister
 */
public class Bandit {

    public static void main(String[] args) throws InterruptedException {

        Mechanik bm = new Mechanik();

        System.out.println("Willkommen zum Spiel: BANDIT\nErstellt von David Leister");
        char frage;

        do {
            bm.guthaben -= 1;
            bm.rolleFuellen();
            bm.wurfAnzeigen();

            for (int i = 0; i < 6; i++) {
                System.out.print(" # ");
                for (int j = 0; j < 5; j++) {
                    Thread.sleep(50);
                }
            }

            if (bm.guthabenCheck() == true) {
                System.exit(0);
            }
            bm.ergebnisBerechnenUndAusgeben();
            frage = bm.weiterspielenUndGuthaben();


        } while (frage == 'j' || frage == 'J');
        System.out.printf("Sie haben das Spiel mit einem Guthaben von %d beendet.\nSchönen Tag noch!", bm.guthaben);
        System.exit(0);
    }
}
