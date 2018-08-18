package Zadanie10;

public class Main {
    public static void main(String[] args) {
        int[][] tab = {{1, 2, 3, 4, 5}, {1, 2, 3, 0, 5}};
        char[] znaki = {'+', '-', '*', '/', 'x'};

        for (int r = 0; r < tab.length; r++) {
            for (int c = 0; c < tab[0].length; c++) {
                System.out.print(tab[r][c] + "\t");
            }
            System.out.println();
        }

        for (char i : znaki){
            System.out.print(i + "\t");
        }

        System.out.println();

        int[] result = doMath(tab,znaki);
        for (int i : result){
            System.out.print(i + "\t");
        }
    }

    public static int[] doMath(int[][] tab, char[] znaki) {
        if (tab.length == 2 && tab[0].length == znaki.length) {
            int[] result = new int[tab[0].length];
            for (int c = 0; c < tab[0].length; c++) { // przechodzimy po wszystkich kolumnach
                int first = tab[0][c]; // deklarujemy pierwszy składnik działania
                int second = tab[1][c]; // deklarujemy drugi składnik działania
                switch (znaki[c]){
                    case '-':
                        result[c] = first - second;
                        break;
                    case '*':
                        result[c] = first * second;
                        break;
                    case '/':
                        if (second == 0){
                            System.out.println("Nie dziel przez 0 jełopie!");
                            break;
                        }
                        result[c] = first / second;
                        break;
                    default:
                        result[c] = first + second;
                        break;
                }
            }
            return result; // zwróć wynik
        }
        return null; // zwróć null
    }
}


