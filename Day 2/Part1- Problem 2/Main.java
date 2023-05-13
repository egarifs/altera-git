import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int nilai;
       String huruf;

       Scanner input = new Scanner(System.in);
       System.out.println(">>Program konversi Nilai <<");
       System.out.print(">Input Nilai: ");
       nilai = input.nextInt();

       if(nilai >= 80 && nilai <=100 ){
           huruf = "A";
       } else if (nilai >= 65 && nilai <=79) {
           huruf = "B+";
       } else if (nilai >= 50 && nilai <=64 ) {
           huruf = "B";
       } else if (nilai >= 35  && nilai <=49) {
           huruf = "C";
       } else if (nilai >= 0  && nilai <=34) {
           huruf = "D";
       } else {
           huruf = "invalid";
       }

       System.out.println("Nilai Anda: " + huruf);

    }
}