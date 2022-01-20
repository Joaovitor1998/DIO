package domain;

public class Course extends Content {

    private int workload;

    public Course() {
    }

    public Course(int workload) {
        this.workload = workload;
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course [description=" + getDescription() + ", title=" + getTitle() + ", workload=" + workload + "]";
    }

}
