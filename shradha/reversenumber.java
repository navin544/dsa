import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        long rev =0;
        int temp = Math.abs(n);

        while (temp>0) {
            int digit =temp%10;
            rev =rev*10 +digit;
            temp = temp /10;
        }
        if (n<0){
            rev =-rev;
        }


        System.out.println(rev);
    }
}
