package Lesson_1.Marathon;

public class Main {
    public static void main(String[] args) {
        // участники первая команда:
        Competitor[] competitors1 = {
                new Dog ("Шарик", 700, 70, 200),
                new Cat("Барсик", 200, 100, 0),
                new Dog("Бобик", 500, 50, 100),
                new Cat ("Мурзик", 300, 120, 0)};
        Team team1 = new Team ("Лучшие животные!", competitors1);
        // соревнования для первой команды:
        Obstacle[] competition1 = {new Wall(50), new Cross(200), new Wall (70), new Cross (300)};
        Course course1 = new Course(competition1);

        team1.info(competitors1);
        course1.doIt(team1);
        team1.showResults(competitors1);

        // участники вторая команда:
        Competitor[] competitors2 = {
                new Human ("Андрей", 1500, 150, 1000, true),
                new Human ("Егор", 1200, 170, 1500, true),
                new Human ("Василий", 800, 130, 800, true),
                new Human ("Павел", 1000, 160, 2000, true)};
        Team team2 = new Team ("Самые лучшие!", competitors2);
        // соревнования для второй команды:
        Obstacle[] competition2 = {new Cross(1000), new Wall(150), new Water (1000)};
        Course course2 = new Course(competition2);

        team2.info(competitors2);
        course2.doIt(team2);
        team2.showResults(competitors2);
    }
}