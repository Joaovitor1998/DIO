package behavioural.strategy;

public class Robot {

    private RobotBehaviour strategy;

    public void setBehaviour(RobotBehaviour behaviour) {
        this.strategy = behaviour;
    }

    public void move() {
        strategy.move();
    }
}
