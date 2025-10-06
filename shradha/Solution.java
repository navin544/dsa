import java.util.Scanner;

class pallindrome {
    public boolean isPalindrome(int x) {
        
        long rev =0;
        int temp = Math.abs(x);

        while(temp>0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp=temp/10;
        }

        if(rev==x){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        pallindrome p = new pallindrome();
        boolean result = p.isPalindrome(x);
        if (result) {
            System.out.println(x+" Is Pallindrome");
        } else {
            System.out.println(x+" Is Not Pallindrome");
        }
    }
}
