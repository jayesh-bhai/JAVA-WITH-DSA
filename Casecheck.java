import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().trim().charAt(0);

        if (ch>='a' && ch <= 'b' ){
            System.err.println("Lowercase Character");
        }else {
            System.out.println("Uppercase Character");
        }
        sc.close();
    }
    
}
