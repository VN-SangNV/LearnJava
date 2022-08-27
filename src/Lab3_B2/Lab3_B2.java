package Lab3_B2;

public class Lab3_B2 {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++){
            System.out.println("Bảng cửu chương " + i);
            for(int j = 1; j < 11; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
