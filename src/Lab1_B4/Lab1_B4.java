package Lab1_B4;
/*
Viết chương trình nhập các hệ số của phương trình bậc 2.
Tính delta và xuất căn delta ra màn hình.
*/

import java.util.Scanner;

public class Lab1_B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heSoA, heSoB, heSoC;

        System.out.println("ax^2 + bx + c = o\nNhập hệ số a, b, c: ");
        heSoA = scanner.nextInt();
        heSoB = scanner.nextInt();
        heSoC = scanner.nextInt();

        float delta = heSoB*heSoB - 4*heSoA*heSoC;
        if(delta >= 0) {
            System.out.println("Căn delta là: " + Math.sqrt(delta));
        }
    }
}
