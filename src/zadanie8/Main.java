package zadanie8;

public class Main {

    public static void main(String[] args) {
        wypiszTablice(args);
    }

    public static void wypiszTablice(String[] args) {
        int iloscWierszy = args.length;
        int tab[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            tab[i] = Integer.parseInt(args[i]);
        }
        int max = tab[0];
        for (int i : tab) {
            if (i > max) {
                max = i;
            }
        }
        String macierz[][] = new String[iloscWierszy][max];

        for (int w = 0; w < iloscWierszy; w++) {
            for (int k = 0; k < tab[w];k++){
                macierz[w][k] = ""+w+"-"+k;
            }
        }

        for (int w = 0; w < macierz.length; w++) {
            for (int k = 0; k < macierz[0].length;k++){
                if (macierz[w][k] != null) {
                    System.out.print(macierz[w][k] + "\t");
                }
            }
            System.out.println();
        }
    }
}

