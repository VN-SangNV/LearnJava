package Lab1_B1;

/*
Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn phím
sau đó xuất ra màn hình với định dạng: <<họ và tên>><<điểm>>điểm.
*/

import java.util.Scanner;

public class Lab1_B1 {
    public static void main(String[] args) {
        String hoVaTen;
        float diemTrungBinh;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ và tên: ");
        hoVaTen = scanner.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        diemTrungBinh = scanner.nextFloat();

        System.out.println(hoVaTen + " " + diemTrungBinh + " điểm!");
    }
}
