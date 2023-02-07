import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter price");

        Scanner priceScan = new Scanner(System.in);
        int price = priceScan.nextInt();

        int priceG = price*100;
        System.out.println(priceG);
    }
}