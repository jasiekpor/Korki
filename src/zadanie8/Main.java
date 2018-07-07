package zadanie8;

public class Main {

    public static void main(String[] args) {
        wypiszTablice(stworzTablice(parsujTablice(args)));
    }

    public static int[] parsujTablice(String[] tab) {
        int[] wynik = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            wynik[i] = Integer.parseInt(tab[i]);
        }
        return wynik;
    }

    public static String[][] stworzTablice(int[] tab) {

        String[][] wynik = new String[tab.length][];

        for (int i = 0; i < tab.length; i++) {
            wynik[i] = new String[tab[i]];
        }

        for (int w = 0; w < wynik.length; w++) {
            for (int k = 0; k < wynik[w].length; k++) {
                wynik[w][k] = w + "-" + k;
            }
        }
        return wynik;
    }

    public static void wypiszTablice(String[][] tab) {
        for (int w = 0; w < tab.length; w++) {
            for (int k = 0; k < tab[w].length; k++) {
                System.out.print(tab[w][k] + "\t");
            }
            System.out.println();
        }
    }
}

