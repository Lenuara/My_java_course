import java.util.*;
import java.text.*;

public class TrainingSchedule {
/****************************************************************
 Задача:  создать приложение для проверки тренировок:
 Понедельник - день тренировки ног, вторник - отдых,
 среда - день тренировки спины, четверг - отдых,
 пятница - день тренировки груди, суббота - кардио,
 воскресенье - отдых. Тип вывода -текущая дата - вид тренировки
 *****************************************************************/
    public static void main(String args[]) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd  - EEEE");
        SimpleDateFormat formatForDayWeekNow = new SimpleDateFormat("EEEE");
        System.out.println("***************************** ");
        System.out.println("Текущая дата:  " + formatForDateNow.format(dateNow));
        System.out.println("***************************** ");
        System.out.println("Общее расписание на неделю");
        System.out.println("-----------------------------");
        System.out.println("Понедельник - тренировка ног");
        System.out.println("Вторник     - отдых");
        System.out.println("Среда       - тренировка спины");
        System.out.println("Четверг     - отдых");
        System.out.println("Пятница     - тренировка груди");
        System.out.println("Суббота     - кардио");
        System.out.println("Воскресенье - отдых");
        System.out.println("=============================");

        String day = formatForDayWeekNow.format(dateNow);

        String typeGym="";
        switch (day){

            case "понедельник": typeGym ="тренировка ног,";
                break;
            case "вторник": typeGym ="день отдыха";
                break;
            case "среда": typeGym ="тренировка спины";
                break;
            case "четверг": typeGym ="день отдыха";
                break;
            case "пятница": typeGym ="день тренировки груди";
                break;
            case "суббота": typeGym ="кардиотренировка";
                break;
            case "воскресенье": typeGym = "день отдыха";
                break;

        }
        System.out.println("Расписание на сегодня: " + "\n" + formatForDateNow.format(dateNow));
        System.out.println("Вид занятия - " + typeGym);
        System.out.println("-----------------------------");
    }
}

