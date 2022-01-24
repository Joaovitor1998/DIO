package behavioural.strategy;

public class SlowBehaviour implements RobotBehaviour {

    @Override
    public void move() {
        System.out.println("Moving slowly.");
    }

}
