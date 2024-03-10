package chapter01;

// 변하지 않는 것
public class Duck {
    FlyBehavior flyBehavior; // 변하는 것
    QuackBehavior quackBehavior; // 변하는 것

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("모든 오리는 수영을 할 줄 알아요");
    }

    public void display(){
        System.out.println("모든 오리는 부리와 날개와 두 개의 발을 가지고 있어요");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
