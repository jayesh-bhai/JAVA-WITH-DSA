import java.util.Scanner;

public class CountingOccurences {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // My approach

   /* System.out.println("Enter a long Number : ");
    String numberStr = sc.nextLine();

    System.out.println("Enter the number to find occurence : ");
    char target = sc.next().trim().charAt(0);
    
    int count = 0;
    for (int i=0;i<numberStr.length();i++)
    {
        char current = numberStr.charAt(i);

        if (Character.isDigit(current) && current == target) {
            count ++;

        }
    }
    System.out.print("The "+target +" in the " + numberStr + " is repeated for " + count + " times."); */



    // More optimized and unqiue approach
    // concpet -> any number % 10 gives the last digit of that number
    int n = sc.nextInt();
    int target = sc.nextInt();
    int count = 0;

    while (n > 0) {
        if (n%10 == target) {
            count++;
        }
        n = n / 10;
    }

    System.out.println("The "+target+" is repeated for "+count+" times");


}    
}
