import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args){
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        while (right<5){
            System.out.print("Lütfen tahmin giriniz: ");
            selected = sc.nextInt();
            if(selected <0 || selected >99){
                System.out.println("Lütfen 0-100 arasında değer girin.");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : "+(5-right));
                }else{
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if(selected == number){
                System.out.println("Tebrikler doğru tahmin! tahmin ettiğiniz sayi : "+number);
                isWin = true;
                break;
            }else{
                System.out.println("Hatalı bir sayı girdiniz!");
                if(selected > number){
                    System.out.println(selected + " sayısı gizli sayıdan büyük.");
                }else{
                    System.out.println(selected+" sayısı gizli sayıdan küçüktür");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkı : "+ (5-right));
            }
        }
        if(!isWin){
            System.out.println("Kaybettiniz!");
            if(!isWrong){
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}
