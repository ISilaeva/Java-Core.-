package Lesson_1.Marathon;

public class Course {
    Obstacle[] course;

    public Course (Obstacle[] course) {
        this.course = course;
    }

    public void doIt(Team team) {
        for (int i = 0; i < team.competitors.length; i++) {
            for (Obstacle o : course) {
                o.doIt(team.competitors[i]);
                if (!team.competitors[i].isOnDistance()) break;
            }
        }
    }
}
