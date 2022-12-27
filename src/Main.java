import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fakn=1,  n;
        int fakr=1, r;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayı Giriniz: ");
        n=input.nextInt();

        System.out.print("2. Sayı Giriniz: ");
        r=input.nextInt();

        System.out.println("------------------------------");
        for (int i = 1; i <= n; i++){
            fakn *= i;
        }
        System.out.println("1. Sayının Faktöriyeli: " +fakn);


        for (int i = 1; i <= r; i++){
            fakr *= i;
        }
        System.out.println("2. Sayının Faktöriyeli:\t" +fakr);

        int fakn_r = 1;
        int n_r = n-r;

        for (int i = 1; i <= n_r; i++){
            fakn_r *= i;
        }
        System.out.println("(n-r) 'nin Faktöriyeli:\t" +fakn_r);

        System.out.println("------------------------------");

        int kombinasyon = fakn / (fakr*fakn_r);
        System.out.println("Kombinasyon: "+kombinasyon);




    }
}