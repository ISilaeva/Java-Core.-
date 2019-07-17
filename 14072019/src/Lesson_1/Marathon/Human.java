package Lesson_1.Marathon;

public class Human implements Competitor {
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean ondistance;

    @Override
    public boolean isOnDistance() {
        return ondistance;
    }

    @Override
    public String getName () {
        return name;
    }

    public Human(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance, boolean active) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.ondistance = active;
    }

    @Override
    public void run(int dist) {
        if (dist > maxRunDistance) {
            ondistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height > maxJumpHeight) {
            ondistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist > maxSwimDistance) {
            ondistance = false;
        }
    }

    @Override
    public void info() {}
}