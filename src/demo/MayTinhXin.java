package demo;

public abstract class MayTinhXin {
    public Integer cong2So() {
        return soA() + soB();
    }

    abstract Integer soA();

    abstract Integer soB();
}
