package demo;

public class NguoiDungMayTinh extends MayTinhXin{
    @Override
    Integer soA() {
        return 5;
    }

    @Override
    Integer soB() {
        return 3;
    }


    public void tinh() {
        System.out.println(cong2So());
    }
}
