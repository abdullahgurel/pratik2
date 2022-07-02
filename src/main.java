import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi;
        System.out.print("Bir Sayı Giriniz : ");
        sayi = input.nextInt();

        for (int i=1;i<=sayi;i*=4) {

            System.out.println("4 sayısının kuvvetleri " +i);
        }
       for (int n = 1;n<=sayi;n*=5) {


            // System.out.println(i);

            System.out.println("5 sayısının kuvvetleri " + n);

        }
    }
}
