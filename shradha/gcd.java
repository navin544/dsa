import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int n2 = sc.nextInt();
        int gcd =1;
        int min=Math.min(n1, n2);
        for (int i = 1; i <=min; i++) {
            if (n1%i==0 && n2%i==0) {
                gcd =i;
            } 
        }
        System.out.println(gcd);
    }
}
