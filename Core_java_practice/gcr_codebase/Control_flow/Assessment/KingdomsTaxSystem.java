import java.util.Scanner;
class KingdomsTaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long income = sc.nextLong();
        if(income < 10000){
            long tax = (income*5)/100;
            long amount = income - tax;
            System.out.println("5% Tax :"+tax);
            System.out.println("Amount :"+ amount);
        }
        else if(income >= 10000 && income < 50000){
            long tax = (income*15)/100;
            long amount = income - tax;
            System.out.println("15% Tax :"+tax);
            System.out.println("Amount :"+ amount);
        }
        else{
            long tax = (income*30)/100;
            long amount = income - tax;
            System.out.println("30% Tax :"+tax);
            System.out.println("Amount :"+ amount);
        }

        long[] arr = {10000,15000,20000,18000,30000,35000,45000,60000,40000,55000};
        long total_tax = 0;
        for(long incom : arr){
            if(incom < 10000){
                long tax = (incom*5)/100;
                total_tax += tax;
            }
            else if(incom >= 10000 && incom < 50000){
                long tax = (incom*15)/100;
                total_tax += tax;
            }
            else{
                long tax = (incom*30)/100;
                total_tax += tax;
            }

        }
        System.out.print("total tax of 10 citizens salary : "+ total_tax);
    }
}