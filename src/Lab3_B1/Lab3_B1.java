package Lab3_B1;

import java.util.Scanner;

public class Lab3_B1 {
    public static void main(String[] args) {
        int soNguyen;
        boolean kiemTra = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên: ");
        soNguyen = scanner.nextInt();

        for(int i = 2; i < soNguyen-1; i++){
            if(soNguyen % i == 0){
                System.out.println(soNguyen + " không phải là số nguyên tố!");
                kiemTra = false;
                break;
            }
        }
        if(kiemTra == true){
            System.out.println(soNguyen + " là số nguyên tố!");
        }

    }
}
