import java.util.Scanner;

public class IllegalTriangle extends Throwable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a của tam giác : ");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh b của tam giác : ");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh c của tam giác : ");
        int c = scanner.nextInt();

        try {
            isTriangle(a,b,c);
        } catch ( IllegalTriangle e) {
            System.err.println("Không phải tam giác");
        }


    }
    public static void isTriangle(int a, int b, int c) throws IllegalTriangle{
        if (a + b <= c || a + c <= b || b + c <= a){
            throw new IllegalTriangle();
        } else if (a <= 0 || b <= 0 || c <= 0){
            throw new IllegalTriangle();
        } else {
            System.out.println("Is triangle.");
        }
    }
}
