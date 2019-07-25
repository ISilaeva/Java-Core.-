package Lesson_2;

import java.util.Scanner;

public class enum_DayOfWeek {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("С какого дня недели посчитать оставшееся кол-во рабочих часов до конца недели ?" +
                "\nУточните порядковый номер дня недели, начиная с понедельника (цифра от 1 до 7):");
        String number = in.nextLine();

        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println ("Введено не число ! Конец работы.");
            return;
        }
        int num = Integer.parseInt(number);
        if (num < 1 || num > 7) {
            System.out.println ("Нет дня недели с таким порядковым номером ! Конец работы.");
            return;
        }

        String dayRus = DayOfWeek.values()[num-1].getRus();
        DayOfWeek dayOfWeek = DayOfWeek.values()[num-1];
        num = getWorkingHours(dayOfWeek);
        if (num != 0) {
            System.out.println("Выбранный день недели - " + dayRus + ". С этого дня до конца " +
                    "недели осталось рабочих часов: " + num + " !");
        } else {
            System.out.println("Выбранный день недели: " + dayRus + " - является выходным !");
        }
        in.close();
    }

    private static int getWorkingHours(DayOfWeek dayOfWeek) {
        int hours = dayOfWeek.ordinal();
        if (hours <= 4) {
            hours = 8 * (5 - hours);
        } else hours = 0;
        return hours;
    }
}

enum DayOfWeek {
    Monday("Понедельник"),Tuesday ("Вторник"), Wednesday ("Среда"), Thursday ("Четверг"),
    Friday ("Пятница"), Saturday ("Суббота"), Sunday ("Воскресенье");

    private String rus;

    DayOfWeek(String rus) {
        this.rus = rus;
    }

    public String getRus() {
        return rus;
    }
}