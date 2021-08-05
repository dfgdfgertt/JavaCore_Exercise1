import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Practice5 {
    public static void main(String[] args) {
        //.out.println("Thế giới của Long!!!");
        Scanner input = new Scanner(System.in);

        // 5. Nhập 2 số a và b. Tính tổng, hiệu, tích và thương của hai số đó.
        System.out.println("5. Nhập 2 số a và b. Tính tổng, hiệu, tích và thương của hai số đó.");
        System.out.print("Nhập vào số a: ");
        float a = input.nextFloat();
        System.out.print("Nhập vào số b: ");
        float b = input.nextFloat();
        System.out.println("Tổng: " + a + " + " + b + " = " + sum(a,b));
        System.out.println("Hiệu: " + a + " - " + b + " = " + sub(a,b));
        System.out.println("Tích: " + a + " * " + b + " = " + mul(a,b));
        System.out.println("Thương: " + a + " : " + b + " = " + div(a,b));
    }

    public  static  float sum(float a, float b){
        return a+b;
    }

    public  static  float sub(float a, float b){
        return a-b;
    }
    public  static  float mul(float a, float b){
        return a*b;
    }

    public  static  float div(float a, float b){
        return a/b;
    }
}
