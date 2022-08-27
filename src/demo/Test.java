package demo;

public class Test {
    public static void main(String[] args) {
//        MayTinh mayTinh = new MayTinhBoTui();
//        MayTinh mayTinh2 = new MayTinhXachTay();
//        System.out.println(mayTinh2.cong(2, 2));
//
//        muaMayTinh(mayTinh2);

        soSanh();
    }

    public static void muaMayTinh(MayTinh mayTinh) {
        System.out.println(mayTinh);
    }

    public static void test2() {
        NguoiDungMayTinh nguoiDungMayTinh = new NguoiDungMayTinh();
        nguoiDungMayTinh.tinh();
    }

    public static void soSanh() {
        Integer a = new Integer(5);
        Integer b = new Integer(5);
        System.out.println(a == b);
    }
}
