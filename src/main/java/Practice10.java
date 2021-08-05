import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        System.out.println("Thế giới của Long!!!");
        System.out.println();
        Scanner input = new Scanner(System.in);

        // 10. Nhập vào 2 số nguyên. Tính min và max của hai số đó.
        System.out.println("10. Nhập vào 2 số nguyên. Tính min và max của hai số đó.");
        System.out.print("Nhập vào số nguyên a: ");
        int a = input.nextInt();
        System.out.print("Nhập vào số nguyên b: ");
        int b = input.nextInt();
        System.out.println("Giá trị Min: "+ Math.min(a,b) +"\nGiá trị Max: "+ Math.max(a,b));
    }
}
