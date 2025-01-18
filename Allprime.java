import java.util.Scanner;
public class Allprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        sc.close();
        
    }

    static boolean isPrime (int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }

}