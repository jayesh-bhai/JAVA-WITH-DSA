import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the range for fibonacci series : ");
        int n = sc.nextInt();

        //Using for loop 
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        
        // for (int i = 2; i<=n; i++) {
            
        //     int temp = b;
        //     b = b+a;
        //     a = temp;
        //     System.out.println(b);
        // }

        // Using while loop 
        int count = 2;
        while (count <=n ) {
            int temp = b;
            b+=a;
            a = temp;
            System.out.println(b);
            count++;
        }
    }
    
}
