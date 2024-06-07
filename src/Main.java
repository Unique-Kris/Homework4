public class Main {
    public static void main(String[] args) {

        System.out.println ("Задание 1");
        int age = 15;
        if (age >= 18 ) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");}
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");}


        System.out.println ("Задание 2");
        int temperature = 3;
        if (temperature < 5 ) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");}
        if (temperature > 5 ) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");}


        System.out.println ("Задание 3");
        int speed = 63;
        if (speed > 60 ) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");}
        if (speed < 60 ) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");}


        System.out.println ("Задание 4");
        int age2 = 5;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в сад.");}
        else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");}
        else if (age2 >= 18 && age2 < 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете.");}
        else if (age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу.");}


        System.out.println ("Задание 5");
        int age3 = 14;
        if (age3 >= 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе.");}
        else if (age3 > 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то можно кататься на аттракционе в сопровождении взрослого.");}
        else if (age3 >= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то можно кататься на аттракционе без сопровождения взрослого.");}


        System.out.println ("Задание 6");
        int people = 50;
        int Capacity = 102;
        int seatingPlaces = 60;
        if (people > 102) {
            System.out.println("Вагон уже полностью забит");}
        if (people < 102){
            System.out.println("Места есть");}
        if (people > 60 && people < 102) {
            System.out.println("Есть сидячие места");}
        else if (people < 60 && people < 102) {
            System.out.println("Есть стоячие места");}


        System.out.println ("Задание 7");
        int one = 5;
        int two = 3;
        int three = 10;
        if (one > two && one > three) {
            System.out.println("Число " + one + " - больше");}
        if (two > one && two > three) {
            System.out.println("Число " + two + " - больше");}
        if (three > one && three > two) {
            System.out.println("Число " + three + " - больше");}

    }

}