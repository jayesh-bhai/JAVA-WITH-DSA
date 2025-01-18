import java.util.Scanner;
public class Assignment_3_conditional_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    /*  Q1) Programs for Areas of mathematicals shapes 
    
        double area;
        System.out.println("Select any one from below to find area : ");
        System.out.println("1. Circle");
        System.out.println("2. Trianle");
        System.out.println("3. Rectangle");
        System.out.println("4. Isosceles triangle");
        System.out.println("5. Paralelogram");
        System.out.println("6. Rhombus");
        System.out.println("7. Equilateral traingle");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Enter the radius of circle : ");
                int radius = sc.nextInt();
                area = 3.14 * radius * radius;
                System.out.println("Area of circle is : " + area);
                break;
            }
            case 2: {
                System.out.print("Enter the base of triangle : ");
                int b = sc.nextInt();
                System.out.print("Enter the height of triangle : ");
                int h = sc.nextInt();
                area = 0.5 * b * h;
                System.out.println("Area of triangle is : "+area);
                break;
            }
            case 3: {
                System.out.print("Enter the length of rectangle : ");
                int l = sc.nextInt();
                System.out.print("Enter the width of rectangle : ");
                int w = sc.nextInt();
                area = l * w;
                System.out.println("Area of rectangle is : " + area);
                break;

            }

            // Similarly 
            default : 
            System.out.println("Invalid choice selected ! ");

        }  
    */

    // Q2) Subtract the Product and Sum of Digits of an Integer
/* 
    System.out.print("Enter an Integer : ");
    int num = sc.nextInt();
    int temp = num;
    int mul = 1;
    int sum = 0;
    while (temp > 0) {
        int rem = temp % 10;
        mul *= rem;
        sum += rem;
        temp /= 10;
    }

    int ans = mul - sum;
    System.out.println("The difference of the digits is : " + ans );   */

    // Q3) Input a number and print all the factors of that number (use loops).

        // My approach 
/*  System.out.print("Enter a number to find its all factors : ");
    int num = sc.nextInt();
    System.out.println("The factor of the entered number are : ");
    for (int i=1; i<=num; i++) {
        if (num % i == 0) {
            System.out.println(i);
        }
    }   */

        // More optimized and enhanced approach for above problem

    /* System.out.print("Enter a number to find its all factors: ");
        int num = sc.nextInt();
        
        System.out.println("The factors of the entered number are:");
        
        for (int i = 1; i * i <= num; i++) { // Check up to the square root
            if (num % i == 0) { // If i is a factor
                System.out.println(i); // Print the factor
                if (i != num / i) { // Check if it's not the same factor (for perfect squares)
                    System.out.println(num / i); // Print the complementary factor
                }
            }
        }  */
        
    //     // Q4) Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
   /*      int sum = 0;
        while (true) {
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        if (num == 0) {
            break;
        } else {
            sum += num;
        }
    }
        System.out.println(sum); */

   // Q5) Take integer inputs till the user enters 0 and print the largest number from all.

       /* int ans = 0;
        while (true) {
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        if (num == 0) {
            break;
        } else {
            if(num > ans) {
                ans = num;
            }
        }
    }
        System.out.println(ans);   */




    }
}
