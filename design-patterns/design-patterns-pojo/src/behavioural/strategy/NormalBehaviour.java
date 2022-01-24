package behavioural.strategy;

public class NormalBehaviour implements RobotBehaviour {

    @Override
    public void move() {
        System.out.println("Moving normally.");
    }
}
