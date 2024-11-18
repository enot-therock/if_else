import java.util.Scanner; // импорт класса для обработки данных с клавиатуры, пробую ради интереса

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scan - берет данные с клавиатуры
        int number1 = 0; // - переменные для записи чисел, вводимых с клавиатуры
        int one = 0;
        int two = 0;
        int three = 0;
        System.out.println("task number 1");
        System.out.println("Введите Ваш возраст");
        number1 = scan.nextInt(); // - вводим требуемое число с клавиатуры
        //int age = 16;
        if (number1 >= 18) {
            System.out.println("Если Ваш возраст равен " + number1 + ", то Вы совершеннолетний");
        } else {
            System.out.println("Если Ваш возраст равен " + number1 + ", то Вы не достиг совершеннолетия и нужно немного подождать)");
        }

        System.out.println();
        System.out.println("task number 2");
        System.out.println("Какая температура сегодня на улице?");
        // int temperatur = 2;
        number1 = scan.nextInt();
        if (number1 < 5) {
            System.out.println("На улице " + number1 + " градус(а), нужно надеть шапку");
        } else {
            System.out.println("На улице тепло, можно идти без шапки");
        }

        System.out.println();
        System.out.println("task number 3");
        System.out.println("Введите скорость, с которой Вы ехали");
        //int speed = 62;
        number1 = scan.nextInt();
        if (number1 > 60) {
            System.out.println("Если Ваша скорость " + number1 + ", то придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }

        System.out.println();
        System.out.println("task number 4");
        System.out.println("Введите возраст ребенка");
        // int age1 = 31;
        number1 = scan.nextInt();
        if (number1 > 2 && number1 <= 6) {
            System.out.println("Если возраст ребенка равен " + number1 + ", то ему еще нужно ходить в детский сад");
        } else if (number1 >= 7 && number1 <= 17) {
            System.out.println("Если возраст ребенка равен " + number1 + ", то ему пока еще нужно ходить в школу");
        } else if (number1 >= 18 && number1 <= 24) {
            System.out.println("Если возраст ребенка равен " + number1 + ", то ему пора идти в университет");
        } else if (number1 > 24) {
            System.out.println("Если возраст ребенка равен " + number1 + ", то он уже не ребенок и ему пора ходить на работу)");
        }

        System.out.println();
        System.out.println("task number 5");
        System.out.println("Сколько лет тому, кто хочет прокатиться на атракционе?");
        // int ageTwo = 15;
        number1 = scan.nextInt();
        if (number1 <= 5) {
            System.out.println("Если возраст ребенка " + number1 + ", то ему нельзя кататься на атракционе");
        } else if (number1 > 5 && number1 < 14) {
            System.out.println("Если возраст ребенка " + number1 + ", то ему можно кататься на атракционе в сопровождении");
        } else if (number1 > 14) {
            System.out.println("Если возраст " + number1 + ", то можно кататься одному");
        }

        System.out.println();
        System.out.println("task number 6");
        System.out.println("Сколько мест в вагоне?");
        // int train = 162;
        number1 = scan.nextInt();
        if (number1 <= 102) {
            System.out.print("В вагоне есть места");
        } else {
            System.out.println("В вагоне мест нет");
        } if (number1 > 60 && number1 < 102) {
            System.out.println(" стоячие");
        } else if (number1 < 60) {
            System.out.println(" сидячие и стоячие");
        }

        System.out.println();
        System.out.println("task number 7");
        System.out.println("Введите три числа и программа скажет какое больше");
        //int one = 7;
        //int two = 144;
        //int three = 45;
        one = scan.nextInt();
        two = scan.nextInt();
        three = scan.nextInt();
        if (one > two && one > three) {
            System.out.println("Число " + one + " большее");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " большее");
        } else {
            System.out.println("Число " + three + " большее");
        }

    }
}