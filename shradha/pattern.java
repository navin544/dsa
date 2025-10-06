import java.util.Scanner;

public class pattern {

    void print1(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void print2(int n){
        for (int i = 0; i < n; i++) {

             for (int j=0; j<i+1; j++) {
                // int j = i; j < 5 ; j++
                 System.out.print("*");
             }
            System.out.println();
        }
    }
    void print3(int n){
        for (int i = 1; i < n; i++) {

             for (int j=1; j<i+1; j++) {
                // int j = i; j < 5 ; j++
                 System.out.print(j);
             }
            System.out.println();
    }
    }
    void print4(int n){
        for (int i = 1; i < n; i++) {
        for (int j = 1; j < i+1; j++) {
            System.out.print(i);
        }
        System.out.println();
       }
    }
    void print5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void print6(int n){
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void print7(int n){
        for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < i+1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    void print8(int n){
        for (int i = 0; i <n; i++) {
                for (int j = 0; j< i+1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <n-i; j++) {
                   System.out.print("*");
                 }
                 for (int j = 0; j < n-i; j++) {
                     System.out.print("*");
                 }
                System.out.println();
            }
    }
    void print9(int n){
        for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < i+1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 0; i <n; i++) {
                for (int j = 0; j< i+1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <n-i; j++) {
                   System.out.print("*");
                 }
                 for (int j = 0; j < n-i; j++) {
                     System.out.print("*");
                 }
                System.out.println();
            }
    }
    void print10(int n){
         for (int i = 0; i < n; i++) {
                for (int j = 0; j <i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i =0 ; i < n; i++) {
                for (int j = 0; j < n-i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
    void print11(int n){
        int start;
         for (int i = 0; i < n; i++) {
            if (i%2 == 0){
                start =1;
            }
            else{
                start =0;
            }
        for (int j = 0; j <=i; j++) {
                    System.out.print(start);
                    start = 1-start;
                }
                System.out.println();
            }
    }
    void print12(int n){
         for (int i = 1; i < n; i++) {
            
        for (int j = 1; j <=i; j++) {
                    System.out.print(j);
                }
               
            int  space = 2*(n-i);
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");           
             }
        for (int j = i; j >=1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
    }
    void print13(int n){
        int num=1;
         for (int i = 1; i <=n; i++) {
            
        for (char j = 1; j <=i; j++) {
                    System.out.print(num+" ");
                    num=1+num;
                }
               
                System.out.println();
            }
    }

    void print14(int n){
    
         for (int i = 1; i <=n; i++) {
            
        for (char j = 'A'; j <='A'+i; j++) {
                    System.out.print(j+" ");
                    
                }
               
                System.out.println();
            }
    }

    void print15(int n){

        char ch ='A';
    
         for (int i = 1; i <=n; i++) {
            
        for (int j = 1; j <=i; j++) {
                    System.out.print(ch+" ");
                    ch++;
                }
               
                System.out.println();
            }
    }
    void print16(int n){

         for (int i = n; i >=0; i--) {
            
        for (char j = 'A'; j <='A'+i ; j++) {
                    System.out.print(j+" ");
                    
                }
               
                System.out.println();
            }
    }

    void print17(int n){
    
         for (int i = 0; i <=n; i++) { 
            char ch = (char)('A'+i); 
        for (int j = 0; j <=i; j++) {
                    System.out.print(ch +" ");
                }
               
                System.out.println();
            }
    }
    void print18(int n){
    
         for (int i = 0; i <=n; i++) {
                for (int j = i; j <=n; j++) {
                    System.out.print(" ");
                }
                for (char j = 'A'; j <='A'+i; j++) {
                    System.out.print(j);
                }
                for (char j = 'B'; j <='A'+i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
    }

    void print19(int n){

         for (int i = 0; i <n; i++) {
            
        for (char j =(char)('A'+n-1-i);j<=('A'+n-1);j++) {
                    System.out.print(j+" ");
                    
                }
               
                System.out.println();
            }
    }

    void print20(int n){
        for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j < i+1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i+1; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 0; i <n; i++) {
                for (int j = 0; j< i+1; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <n-i; j++) {
                   System.out.print(" ");
                 }
                 for (int j = 0; j < n-i; j++) {
                     System.out.print(" ");
                 }
                 for (int j = 0; j< i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    void print21(int n) {
    int spaces = 2 * n - 2;

    for (int i = 1; i <= 2 * n - 1; i++) {
        int stars = i;

        // After midpoint, decrease star count
        if (i > n) {
            stars = 2 * n - i;
        }

        // Left stars
        for (int j = 1; j <= stars; j++) {
            System.out.print("*");
        }

        // Middle spaces
        int currentSpaces = 2 * (n - stars);
        for (int j = 1; j <= currentSpaces; j++) {
            System.out.print(" ");
        }

        // Right stars
        for (int j = 1; j <= stars; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

void print22(int n){
    for (int i = 0; i <n; i++) {

        for (int j = 0; j <n; j++) {
            if (i==0 || j==0||j==n-1||i==n-1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

void print23(int n){
    for (int i = 0; i <2*n-1; i++) {
        for (int j = 0; j <2*n-1; j++) {
            int top =i;
            int left = j;
            int right =(2*n-2)-j;
            int bottom = (2*n-2)-i;
            int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));
            System.out.print(n - minDist + " ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern p = new pattern();
       
        p.print23(n);
        
    }
}
