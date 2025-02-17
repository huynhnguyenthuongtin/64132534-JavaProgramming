import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        double sqrtDelta = Math.sqrt(Math.abs(delta));
        
        System.out.println("\nThông tin phương trình bậc 2:");
        System.out.println("Delta: " + delta);
        System.out.println("Căn delta: " + sqrtDelta);
        
        scanner.close();
    }
}