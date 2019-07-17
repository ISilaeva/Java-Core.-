package Lesson_1.Marathon;

public class Team {
    String name;
    Competitor[] competitors;

    public Team (String name, Competitor[] competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public void info(Competitor[] competitors) {
        System.out.println("Команда : '" + name + "' состоит из участников:");
        for (int i = 0; i < competitors.length; i++) {
            System.out.println((i+1) + "-й участник: " + competitors[i].getName());
            }
        }

    public void showResults (Competitor[] competitors) {
        System.out.println("Дистанцию смогли пройти:");
        for (int i = 0; i < competitors.length; i++) {
            if (competitors[i].isOnDistance())
            System.out.println(competitors[i].getName());
        }
        System.out.println("Дистанцию не смогли пройти:");
        for (int i = 0; i < competitors.length; i++) {
            if (!competitors[i].isOnDistance())
                System.out.println(competitors[i].getName());
        }
    }
}