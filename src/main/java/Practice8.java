import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        //System.out.println("Thế giới của Long!!!");
        System.out.println();
        Scanner input = new Scanner(System.in);

        // 8. Nhập bán kính của đường tròn. Tính chu vi và diện tích của hình tròn đó.
        System.out.println("8. Nhập bán kính của đường tròn. Tính chu vi và diện tích của hình tròn đó.");
        System.out.print("Nhập vào bán kính đường tròn: ");
        float a = input.nextFloat();
        System.out.println("Chu vi đường tròn: " + (float)(2*a*Math.PI));
        System.out.println("Diện tích đường tròn: "+ (float)(a*a*Math.PI));
    }
}
