import java.util.Scanner;

public class WarehouseStockRecoverySystem {
    public static void main(String args[]) {
        int[] stock = {12,8,9,0,17,13};
        System.out.println(StockQuantity(stock));
        System.out.println(findIndex(stock));
        System.out.println(Average(stock));
        ReplaceStock(stock);
        Updatedinventory(stock);
    }
    public static int StockQuantity(int[] stock) {
        int totalqty = 0;
        for (int i = 0; i < stock.length; i++) {
            totalqty += stock[i];
        }
        return totalqty;
    }
    public static int findIndex(int[] stock) {
        for(int i=0;i<stock.length;i++){
            if(stock[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static int Average(int[] stock) {
        int total = 0;
        for(int i=0;i<stock.length;i++){
            if(stock[i]!=0){
                total+=stock[i];
            }
        }
        return total/stock.length-1;
    }
    public static void ReplaceStock(int[] stock) {
        for(int i=0;i<stock.length;i++){
            if(stock[i]==0){
                stock[i] = Average(stock);
            }
        }
    }
    public static void Updatedinventory(int[] stock) {
        System.out.println("Updated inventory");
        for(int i=0;i<stock.length;i++){
            System.out.print(stock[i]+" ");
        }
    }
}
