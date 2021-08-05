import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Practice6 {
    public static void main(String[] args) {
        //System.out.println("Thế giới của Long!!!");
        Scanner input = new Scanner(System.in);

        // 6. Nhập tên sản phẩm, số lượng và đơn giá.
        // Tính tiền và thuế giá trị giá trị gia tăng phải trả, biết:
        // a. Tiền = số lượng * đơn giá
        // b. Thuế giá trị gia tăng = 10% tiền
        System.out.println("6. Nhập tên sản phẩm, số lượng và đơn giá.\nTính tiền và thuế giá trị giá trị gia tăng phải trả, biết:\n\ta. Tiền = số lượng * đơn giá\n\tb. Thuế giá trị gia tăng = 10% tiền\n");
        System.out.print("Nhập tên sản phẩm: ");
        String productName = input.nextLine();
        System.out.print("Nhập vào số lượng sản phầm: ");
        int quantity = input.nextInt();
        System.out.print("Nhập vào giá sản phẩm: ");
        float price = input.nextFloat();
        System.out.println("\n--------Hóa đơn--------");
        System.out.println("Sản phẩm: \t\t"+ productName);
        System.out.println("Số lượng: \t\t"+ quantity);
        System.out.println("Đơn giá: \t\t"+ price + "vnđ");
        System.out.println("----------------------");
        System.out.println("Thành tiền: \t"+ total(quantity,price)+ "vnđ");
        System.out.println("Thuế (10%): \t"+ vat(quantity,price)+ "vnđ");
        System.out.println("----------------------");
        System.out.println("Tổng tiền: \t\t"+ (float)(total(quantity,price)+  vat(quantity,price))+ "vnđ");
    }
    public static float total(int quatity, float price){
        return quatity*price;
    }

    public static float vat(int quatity, float price){
        return (float) (total(quatity,price) * 0.1);
    }
}
