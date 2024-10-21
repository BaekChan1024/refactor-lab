package study;

public class Tea extends CaffeineBeverage{

    @Override
    public void addCondiments() {
        System.out.println("레몬 추가 하는 중");
    }

    @Override
    public void brew() {
        System.out.println("찻잎 우려내는 중");
    }
}
