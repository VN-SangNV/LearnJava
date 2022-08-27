package Lab1_B2;

/*
Viết chương trình nhập từ bản phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi, diện tích
và tính cạnh nhỏ của hình hình chữ nhật.
*/

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Lab1_B2 {
    public static void main(String[] args) {
        int canhA, canhB;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cạnh a: ");
        canhA = scanner.nextInt();
        System.out.println("Nhập cạnh b: ");
        canhB = scanner.nextInt();

        System.out.println("Chu vi hình chữ nhật là: " + (canhA + canhB)*2 );
        System.out.println("Diện tích hình chữ nhật là: " + canhA*canhB );
        System.out.println("Cạnh nhỏ là: " + Math.min(canhA, canhB) );
    }
}
