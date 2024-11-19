import java.util.Scanner; // импорт класса для обработки данных с клавиатуры, пробую ради интереса

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scan - берет данные с клавиатуры
        int numberUser = 0; // - переменные для записи чисел, вводимых с клавиатуры
        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        System.out.println("task number 1");
        System.out.println("Введите Ваш возраст");
        numberUser = scan.nextInt(); // - вводим требуемое число с клавиатуры
        if (numberUser >= 18) {
            System.out.println("Если Ваш возраст равен " + numberUser + ", то Вы совершеннолетний");
        } else {
            System.out.println("Если Ваш возраст равен " + numberUser + ", то Вы не достиг совершеннолетия и нужно немного подождать)");
        }

        System.out.println();
        System.out.println("task number 2");
        System.out.println("Какая температура сегодня на улице?");
        numberUser = scan.nextInt();
        if (numberUser < 5) {
            System.out.println("На улице " + numberUser + " градус(а), нужно надеть шапку");
        } else {
            System.out.println("На улице тепло, можно идти без шапки");
        }

        System.out.println();
        System.out.println("task number 3");
        System.out.println("Введите скорость, с которой Вы ехали");
        numberUser = scan.nextInt();
        if (numberUser > 60) {
            System.out.println("Если Ваша скорость " + numberUser + ", то придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }

        System.out.println();
        System.out.println("task number 4");
        System.out.println("Введите возраст ребенка");
        numberUser = scan.nextInt();
        if (numberUser > 2 && numberUser <= 6) {
            System.out.println("Если возраст ребенка равен " + numberUser + ", то ему еще нужно ходить в детский сад");
        } else if (numberUser >= 7 && numberUser <= 17) {
            System.out.println("Если возраст ребенка равен " + numberUser + ", то ему пока еще нужно ходить в школу");
        } else if (numberUser >= 18 && numberUser <= 24) {
            System.out.println("Если возраст ребенка равен " + numberUser + ", то ему пора идти в университет");
        } else if (numberUser > 24) {
            System.out.println("Если возраст ребенка равен " + numberUser + ", то он уже не ребенок и ему пора ходить на работу)");
        }

        System.out.println();
        System.out.println("task number 5");
        System.out.println("Сколько лет тому, кто хочет прокатиться на атракционе?");
        numberUser = scan.nextInt();
        if (numberUser <= 5) {
            System.out.println("Если возраст ребенка " + numberUser + ", то ему нельзя кататься на атракционе");
        } else if (numberUser > 5 && numberUser < 14) {
            System.out.println("Если возраст ребенка " + numberUser + ", то ему можно кататься на атракционе в сопровождении");
        } else if (numberUser > 14) {
            System.out.println("Если возраст " + numberUser + ", то можно кататься одному");
        }

        System.out.println();
        System.out.println("task number 6");
        System.out.println("Сколько мест в вагоне?");
        numberUser = scan.nextInt();
        if (numberUser <= 102) {
            System.out.print("В вагоне есть места");
        } else {
            System.out.println("В вагоне мест нет");
        } if (numberUser > 60 && numberUser < 102) {
            System.out.println(" стоячие");
        } else if (numberUser < 60) {
            System.out.println(" сидячие и стоячие");
        }

        System.out.println();
        System.out.println("task number 7");
        System.out.println("Введите три числа и программа скажет какое больше");
        numberOne = scan.nextInt();
        numberTwo = scan.nextInt();
        numberThree = scan.nextInt();
        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("Число " + numberOne + " большее");
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("Число " + numberTwo + " большее");
        } else {
            System.out.println("Число " + numberThree + " большее");
        }
        scan.close();
    }
}