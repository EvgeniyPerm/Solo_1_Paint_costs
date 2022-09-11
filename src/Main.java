import java.util.Scanner;

public class Main {
    static final double priceCanvas = 40;
    static final double priceColor=5;
    static final int tax = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nColors = scanner.nextInt();
        int price = (int)(Math.round((priceCanvas+priceColor*nColors)*(100+tax)/100));
        System.out.println(price);
    }
}