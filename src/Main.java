import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1
        //Задача 1
        System.out.println("Задача 1");
        int age = 20;
        if(age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        int age1 = 15;
        if (age1 < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил!");
        }
    //Задача 2
        System.out.println("Задача 2");
        int ChildAge = 8;
        if(ChildAge >=7 && ChildAge < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        int manAge = 19;
        if(manAge >= 18 && manAge < 24){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        int manAge1 = 25;
        if(manAge1 >=24);{
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }
    //Задача 3
        System.out.println("Задача 3");
        int totalPlaces = 102;
        int totalSeatingPlaces = 60;
        int totalStandingPlaces = totalPlaces - totalSeatingPlaces;
        int seatingPlacesTaken = 59;
        int standingPlacesTaken = 41;
        int totalPlacesTaken = seatingPlacesTaken +  standingPlacesTaken;
        if(totalPlacesTaken >= totalPlaces) {
            System.out.println("Вагон уже полностью забит");
        }
        if(seatingPlacesTaken < totalSeatingPlaces) {
            System.out.println("Есть еще " + (totalSeatingPlaces - seatingPlacesTaken) + " сидячих мест");
        }
        if(standingPlacesTaken < totalStandingPlaces) {
            System.out.println("Есть еще " + (totalStandingPlaces - standingPlacesTaken) + " стоячих мест");
        }
        //Домашнее задание 2
        //Задание 1
        System.out.println("Задание 1");
        int Age = 15;
        if(Age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил!");
        }
    //Задание 2
        System.out.println("Задание 2");
        int ageMan = 12;
        if (ageMan >=7 && ageMan < 18) {
            System.out.println("Ребенок ходит в школу.");
        }else if(ageMan >=18 && ageMan < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else if(ageMan > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }
        //Задание 3
        System.out.println("Задание 3");
        int totalPlaces1 = 102;
        int totalSeatingPlaces1 = 60;
        int totalStandingPlaces1 = totalPlaces - totalSeatingPlaces;
        int seatingPlacesTaken1 = 60;
        int standingPlacesTaken1 = 42;
        int totalPlacesTaken1 = seatingPlacesTaken1 +  standingPlacesTaken1;
        if(totalPlacesTaken1 >= totalPlaces1) {
            System.out.println("Вагон уже полностью забит");
        }
        if(seatingPlacesTaken1 < totalSeatingPlaces1) {
            System.out.println("Есть еще " + (totalSeatingPlaces1 - seatingPlacesTaken1) + " сидячих мест");
        }else {
            System.out.println("Сидячих мест нет.");
        }
        if(standingPlacesTaken1 < totalStandingPlaces1) {
            System.out.println("Есть еще " + (totalStandingPlaces1 - standingPlacesTaken1) + " стоячих мест");
        }else {
            System.out.println("Стоячих мест нет.");
        }
        //Домашнее задание 3
        //Задание 1
        System.out.println("Задача 1");
        int yearsOld = 50;
        if(yearsOld > 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека " + yearsOld + ", ему нужно ходить в детский сад");
        }
        if(yearsOld >= 7 && yearsOld <= 18) {
            System.out.println("Если возраст человека " + yearsOld + ", ему нужно ходить в школу");
        }
        else if(yearsOld <= 24) {
            System.out.println("Если возраст человека " + yearsOld + ", его место в университете");
        }
        else  {
            System.out.println("Если возраст человека равен " + yearsOld + ", ему пора ходить на работу");
        }

        //Задание 2
        System.out.println("Задание 2");
        int ageChild = 11;
        if(ageChild < 5){
            System.out.println("Ребенок не может кататься на аттракционе!");
        } else if(ageChild <= 14){
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого!");
        } else {
            System.out.println("Ребенок может кататься на аттракционе!");
        }

        //Задание 3
        System.out.println("Задание 3");
        int one = 1;
        int two = 2;
        int free = 3;
        if(one > two && one > free) {
            System.out.println(one);
        } else if(two > one && two > free) {
            System.out.println(two);
        } else {
            System.out.println(free);
        }



    }
}
