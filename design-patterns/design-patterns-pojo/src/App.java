import behavioural.strategy.FastBehaviour;
import behavioural.strategy.NormalBehaviour;
import behavioural.strategy.Robot;
import behavioural.strategy.RobotBehaviour;
import behavioural.strategy.SlowBehaviour;
import creational.singleton.SingletonEager;
import creational.singleton.SingletonLazy;
import creational.singleton.SingletonLazyHolder;

public class App {
    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        // Strategy

        RobotBehaviour slow = new SlowBehaviour();
        RobotBehaviour normal = new NormalBehaviour();
        RobotBehaviour fast = new FastBehaviour();
        Robot robot = new Robot();

        robot.setBehaviour(slow);
        robot.move();
        robot.setBehaviour(normal);
        robot.move();
        robot.move();
        robot.setBehaviour(fast);
        robot.move();
        robot.move();
        robot.move();

        // Facade

    }
}
