package demo;

public class MayTinhBoTui implements MayTinh{
    @Override
    public Integer cong(Integer soA, Integer soB) {
        return soA + soB;
    }

    @Override
    public Integer tru(Integer soA, Integer soB) {
        return soA - soB;
    }
}
