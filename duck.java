import java.security.PublicKey;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() {}
}

public abstract void display();

public void performFly(){
    flyBehavior.fly();
}

public void performQuack() {
    quackBehavior.quack();
}

public void swim() {
    system.out.println("all ducks float,ever decoys")
}

public interface FlyBehavior {
    public void fly();
}

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("i'm flying wings");
    }
}

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("i can't fly");
    }
}

public interface QuackBehavior {
    public void quack();
}

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("quack");
    }
}

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("squeak");
    }
}

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Mallard.performQuack();
        Mallard.performFly;
    }
}

public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb
}

public void setQuackBehavior (QuackBehavior qb) {
    quackBehavior = qb;
}

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}

public void display () {
    system.out.println("I'm a model duck");
}

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck ();
        mallard.performQuack ();
        mallard.performFly ();
    }
}