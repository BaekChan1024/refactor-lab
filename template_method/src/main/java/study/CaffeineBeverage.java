package study;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        popInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("물 끊이는 중");
    }

    public void popInCup() {
        System.out.println("컵에 따르는 중");
    }

    public abstract void addCondiments();

    public abstract void brew();
}
