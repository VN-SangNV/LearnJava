package Lab1_B3;

//Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất thể tích;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Lab_B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canh;

        System.out.println("Nhập cạnh của khối lập phương: ");
        canh = scanner.nextInt();

        System.out.println("Thể tích của khối lập phương là: " + Math.pow(canh, 3) );

    }
}
