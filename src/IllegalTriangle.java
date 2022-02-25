import java.util.Scanner;

public class IllegalTriangle  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a của tam giác : ");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh b của tam giác : ");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh c của tam giác : ");
        int c = scanner.nextInt();
        try {
            Triangle triangle = new Triangle(a,b,c);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
