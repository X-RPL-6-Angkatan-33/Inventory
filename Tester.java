package Inventory;

import java.util.Scanner;

//Driver Class
public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Berapa objek yg dibuat? (Max 10)");
        int jumlah = in.nextInt();
        
        //Buat looping untuk mengulang membuat objek CD atau //DVD
        System.out.println("CD atau DVD?");
        String pilihan = in.next();

        // kondisi
        if (pilihan.equals("CD")) {
            CD c1 = new CD();
            c1.print();
        } else if (pilihan.equals("DVD")) {
            DVD d1 = new DVD();
            d1.print();
        } else {
            System.out.println("Input salah.");
        }

        in.close();
    }
}
