import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse : ");
        int num = sc.nextInt();

        // My logic 

        // while (num > 0) {
        //     int rem = num % 10;
        //     System.out.print(rem);
        //     num /= 10; 
        // }

        // Another approach

        int ans = 0;
        while (num > 0 ) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);

        
    }
}
