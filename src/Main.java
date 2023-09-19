import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k;

        //Kullanıcaya bir sayı seçtirip sayıların bu değere kadar çift olup olmadığını sorgulama
        //Sonrasında bunun modunu yani 2ye bölümünden kalanın 0 olma durumunu sorgulatmak

        System.out.print("Bir Sayı Giriniz : ");
        Scanner input = new Scanner(System.in);
        k = input.nextInt();

        int i = 1;
        while (i < k) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
