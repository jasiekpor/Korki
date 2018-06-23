package Zadanie24;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    static String readLine(){
        String line = null;

        Scanner scanner = new Scanner(System.in);
        try {
            line = scanner.nextLine();
        }catch (NoSuchElementException e){
            System.out.println("Brak lini!");
        }
        scanner.close();
        return line;
    }

    static String readLine2() throws Exception{
        String line = null;

        Scanner scanner = new Scanner(System.in);

        line = scanner.nextLine();
        System.out.println("Brak lini!");

        scanner.close();
        return line;
    }

    public static void main(String[] args){
        try {
            int x = 1 / 0;
        }catch (Exception e){
            System.out.println("Nie dzielimy przez 0!");
        }
        int[] tab = new int[3];

        try {
            System.out.println(tab[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Zły indeks tabeli!");
        }

        System.out.println(readLine());
        try {
            System.out.println(readLine2());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
