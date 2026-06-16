import java.util.Scanner;

public class MathWizard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
        System.out.println(factorial(n));
        System.out.println(fibbonaci(n));
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }
    public static void isPrime(int n) {
        int m = n/2 +1;
        for (int i = 2; i*i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not a prime Number");
                return;
            }
        }
        System.out.println("prime Number");
    }
    public static int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int fibbonaci(int n) {
        if(n<=1){
            return n;
        }
        return fibbonaci(n-1)+fibbonaci(n-2);
    }
    public static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    public static int power(int a,int b){
        if (b == 0)
            return 1;

        return a * power(a, b - 1);
    }
}
