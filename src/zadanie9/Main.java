package zadanie9;

public class Main {
    public static void main(String[] args) {
        int tab[][] = new int[5][5];
        for (int r = 0; r < tab.length; r++) {
            for (int c = 0; c < tab[0].length; c++) {
                tab[r][c] = r + c; // wypełnienie tablicy liczbami
            }
        }

        showTable(tab);
        switchRowsOf(tab, 1, 3);
        System.out.println();
        showTable(tab);

    }

    static void showTable(int[][] tab) {
        for (int r = 0; r < tab.length; r++) {
            for (int c = 0; c < tab[0].length; c++) {
                System.out.print(tab[r][c] + "\t"); // wypisz element tablicy
            }
            System.out.println();
        }
    }

    static void switchRowsOf(int[][] tab, int first, int second) {
        if (first < tab.length && second < tab.length) { // sprawdzenie czy parametry są mniejsze niż wielkość tabeli "tab"
            int temp[] = new int[tab[0].length]; // deklaracja tablicy pomocniczej
            for (int c = 0; c < tab[0].length; c++) {
                temp[c] = tab[first][c]; // skopiowanie elementów z "first" wiersza do tablicy pomocniczej
            }
            for (int c = 0; c < tab[0].length; c++) {
                tab[first][c] = tab[second][c]; // skopiowanie elementów z wiersza "second" do wiersza "first"
                tab[second][c] = temp[c]; // skopiowanie elemetów z tablicy pomocniczej do wiersza "second"
            }
        } else {
            System.out.println("Maćku to jebnie");
        }
    }
}
