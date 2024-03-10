package chapter01;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("저는 물오리 입니다.");
    }

    public void swim(){
        System.out.println("저는 특히나 수영을 짱 잘해요");
    }
}
