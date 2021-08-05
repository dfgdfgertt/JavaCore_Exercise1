import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Practice4 {
    public static void main(String[] args) {
        //System.out.println("Thế giới của Long!!!");
        Scanner input = new Scanner(System.in);
        // 4. Nhập năm sinh của một người. Tính tuổi người đó.
        System.out.println("4. Nhập năm sinh của một người. Tính tuổi người đó.");
        System.out.print("Nhập vào năm sinh: ");
        int birthday = input.nextInt();
        System.out.println("Tuổi của năm sinh "+ birthday +" là " + age(birthday) +" tuổi");

    }

    public static int age(int birthday){
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        Date date = calendar.getTime();
        return calendar.get(Calendar.YEAR) - birthday;
    }
}
