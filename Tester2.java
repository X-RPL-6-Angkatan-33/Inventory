package Inventory;

import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. CD / 2. DVD");
        int pilihan = in.nextInt();

        in.nextLine(); //reset Scanner
        System.out.println("Name : ");
        String name = in.nextLine();
        System.out.println("Number : ");
        int number = in.nextInt();
        System.out.println("Quantity : ");
        int quantity = in.nextInt();
        System.out.println("Price : ");
        double price = in.nextDouble();
        in.nextLine();
        if (pilihan == 1) {
            System.out.println("Artist : ");
            String artist = in.nextLine();
            System.out.println("Label : ");
            String label = in.nextLine();
            System.out.println("Total Song : ");
            int numSong = in.nextInt();
            CD c1 = new CD(number, name, quantity, price, artist, numSong, label);
            c1.print();
        } else if (pilihan == 2) {

        } else {
            System.out.println("Input Salah!");
        }
    }
}
