import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = in.nextInt(), rev = 0, tmp = n;

        while(tmp > 0) {
            rev = rev*10 + (tmp%10);
            tmp /= 10;
        }
        
        System.out.println(rev);
    }
}