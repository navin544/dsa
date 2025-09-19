import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value:");
        int n =sc.nextInt();
        if(n<0 || n>5000){
            System.out.println("Input is Invalid");
        }

        int count = 0;
        int temp = n;

        if (n >= 0 && n <= 5000) {
            if (n == 0) {
                count = 1;
            } else {
                while (temp > 0) {
                    temp = temp / 10;
                    count++;
                }
            }
            System.out.println("Number of digits: " + count);
        }
    }
    
}
