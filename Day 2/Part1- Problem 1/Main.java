import java.util.Scanner;
// Part1
// Problem 1  - Menghitung luas segitiga
public class Main {
    public static void main(String[] args) {
        double luas;
        int alas, tinggi;

        Scanner input = new Scanner(System.in);

        System.out.println(">> Menghitung Luas Segitiga <<");
        System.out.print("Masukan alas: ");
        alas = input.nextInt();
        System.out.print("Masukan tinggi: ");
        tinggi = input.nextInt();

        luas = Double.valueOf((alas*tinggi)/2);

        System.out.println(">>Luas segitiga = " + luas);

    }
}