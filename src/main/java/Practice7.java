import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 7. Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của một học sinh.
        // Tính điểm trung bình của học sinh đó.
        System.out.println("7. Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của một học sinh.\nTính điểm trung bình của học sinh đó.");
        System.out.print("Điểm môn Toán:");
        float coreMath = input.nextFloat();
        System.out.print("Hệ số môn Toán: ");
        float coeMath = input.nextFloat();
        System.out.print("Điểm môn Lý: ");
        float corePhy = input.nextFloat();
        System.out.print("Hệ số môn Lý: ");
        float coePhy = input.nextFloat();
        System.out.print("Điểm môn Hóa: ");
        float coreChe = input.nextFloat();
        System.out.print("Hệ số môn Hóa: ");
        float coeChe = input.nextFloat();

        System.out.println("\nĐiểm trung bình: \t"+ (float)(((coreMath*coeMath)+(corePhy*coePhy)+(coreChe*coeChe))/(coeChe + coePhy + coeMath)));
    }



}
