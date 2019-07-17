package Lesson_1.Marathon;

public class Animal implements Competitor {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public String getName () {
        return (type + " " + name);
    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist > maxRunDistance) {
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height > maxJumpHeight) {
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0 || dist > maxSwimDistance) {
            onDistance = false;
        }
    }

    @Override
    public void info() {}
}