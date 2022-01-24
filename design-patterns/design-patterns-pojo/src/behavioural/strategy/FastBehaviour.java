package behavioural.strategy;

public class FastBehaviour implements RobotBehaviour {

    @Override
    public void move() {
        System.out.println("Moving fast.");
    }
}
