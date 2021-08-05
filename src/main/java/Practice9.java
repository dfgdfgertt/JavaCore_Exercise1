import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        //System.out.println("Thế giới của Long!!!");
        System.out.println();
        Scanner input = new Scanner(System.in);

        // 9. Nhập vào số xe của bạn (gồm tối đa 5 chữ số).
        // Cho biết số xe của bạn được mấy nút?
        System.out.println("9. Nhập vào số xe của bạn (gồm tối đa 5 chữ số).\nCho biết số xe của bạn được mấy nút?");
        System.out.print("Nhập biển số xe: ");
        int a = input.nextInt();
        System.out.println("Biển số của bạn được: "+ nut(a) +" nút.");
    }

    public static int nut(int a){
        int b=0;
        do {
            b += (a % 10);
            a /= 10;
        }while(a > 0);
        return b%10;
    }
}
