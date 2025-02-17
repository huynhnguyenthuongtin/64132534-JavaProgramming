import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        
        double theTich = Math.pow(canh, 3);
        
        System.out.println("\nThông tin khối lập phương:");
        System.out.println("Thể tích: " + theTich);
        
        scanner.close();
    }
}