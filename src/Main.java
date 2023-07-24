import javax.swing.*;

// Start    :24.07.23 15:47
// Pause    :0
// Finish   :24.07.23 17:12
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №6");
        System.out.println("Циклические операторы. Урок 1");
        int taskNumberRun  = 1;
        try {
            taskNumberRun = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Какое задание нужно выполнить? (1-10)"));
        } catch (Exception e) {
            taskNumberRun = 0;
            //e.printStackTrace(); // Выводит сообщение об ошибке
        }
        switch (taskNumberRun) {
            case 0 -> {break;}
            case 1 -> {
                task1();  //Задание 1
                break;
            }
            case 2 -> {
                task2();  //Задание 2
                break;
            }
            case 3 -> {
                task3();    //Задание 3
                break;
            }
            case 4 -> {
                task4();    //Задание 4
                break;
            }
            case 5 -> {
                task5();    //Задание 5
                break;
            }
            case 6 -> {
                task6();    //Задание 6
                break;
            }
            case 7 -> {
                task7();    //Задание 7
                break;
            }
            case 8 -> {
                task8();    //Задание 8
                break;
            }
            case 9 -> {
                task9();    //Задание 9
                break;
            }
            case 10 -> {
                task10();    //Задание 10
                break;
            }
        }
        System.out.println("_________");
        System.out.println("Домашка закончилась. Всем спасибо, все свободны.");
        }

    private static void task10() {
        System.out.println("Задание 10");
        // Напишите программу, которая выводит в консоль таблицу умножения.
        // #17:11
        //Инициализация
        String outLine = "";
        int strartX = 1, startY = 1,
                stopX = 10, stopY = 10,
                gradientX = 1, gradientY = 1;
        //Решение
        for (int X = strartX; X <= stopX; X=X+gradientX) {
            for (int Y = startY; Y <= stopY; Y=Y+gradientY) {
                outLine = outLine + X * Y + "\t";
            }
            //Вывод
            System.out.println(outLine);
            outLine = "";
        }
    }

    private static void task9() {
        System.out.println("Задание 9");
        // Перепишите решение задачи выше при условии,
        // что деньги вы откладывать будете не «в банку»,
        // а в банк под проценты — 12% годовых.
        // Выведите сумму накоплений за каждый месяц в консоль
        // в формате: «Месяц …, сумма накоплений равна … рублей».
        // #17:02
        //Инициализация
        String outLine = "";
        int vkladTotal = 0;
        int monthNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "На какой срок хотите вложить средства (мес):"));
        int vkladMount  = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Какой сумму готовы вкладывать (руб):"));
        int procentMount  = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Какой процент годовых обещал банк (1-100):"));
        int strartI = 1,
                stopI = monthNumber,
                gradientI = 1;
        //Решение
        for (int i = strartI; i <= stopI; i=i+gradientI) {
            vkladTotal = (vkladTotal + vkladMount)*procentMount/12;
            //Вывод
            System.out.println("Месяц "+i+", сумма накоплений равна "+vkladTotal+" рублей");
        }
    }


    private static void task8() {
        System.out.println("Задание 8");
        // Посчитайте с помощью цикла for сумму годовых накоплений,
        // если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        // Выведите сумму накоплений за каждый месяц в консоль
        // в формате: «Месяц …, сумма накоплений равна … рублей».
        // #16:54
        //Инициализация
        String outLine = "";
        int vkladTotal = 0;
        int monthNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "На какой срок хотите вложить средства (мес):"));
        int vkladMount  = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Какой сумму готовы вкладывать (руб):"));
        int strartI = 1,
                stopI = monthNumber,
                gradientI = 1;
        //Решение
        for (int i = strartI; i <= stopI; i=i+gradientI) {
            vkladTotal = vkladTotal + vkladMount;
            //Вывод
            System.out.println("Месяц "+i+", сумма накоплений равна "+vkladTotal+" рублей");
        }
    }

    private static void task7() {
        System.out.println("Задание 6");
        // Напишите программу, которая выводит в консоль последовательность чисел:
        // 1 2 4 8 16 32 64 128 256 512
        // #16:40
        //Инициализация
        String outLine = "Геометрическая прогрессия :";
        int strartI = 1,
                stopI = 1024,
                gradientI = 2;
        //Решение
        for (int i = strartI; i <= stopI; i=i*gradientI) {
            //Вывод
            System.out.println(outLine + i);
        }
    }

    private static void task6() {
        System.out.println("Задание 6");
        // Напишите программу, которая выводит в консоль последовательность чисел:
        //  7 14 21 28 35 42 49 56 63 70 77 84 91 98
        // #16:33
        //Инициализация
        String outLine = "Арифметическая прогрессия :";
        int strartI = 7,
                stopI = 98,
                gradientI = 7;
        //Решение
        for (int i = strartI; i <= stopI; i=i+gradientI) {
            //Вывод
            System.out.println(outLine + i);
        }
    }

    private static void task5() {
        System.out.println("Задание 5");
        // Напишите программу, которая выводит в консоль все високосные года,
        // начиная с 1904 года до 2096. В консоль результат должен выводиться
        // в формате: «… год является високосным».
        // #16:26
        //Инициализация
        String outLine = " год является високосным.";
        int strartI = 1904,
            stopI = 2096,
            gradientI = 4;
        //Решение
        for (int year = strartI; year <= stopI; year=year+gradientI) {
            //Вывод
            System.out.println(year+outLine);
        }
    }

    private static void task4() {
        System.out.println("Задание 4");
        // Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.. #16:18
        //Инициализация
        String outLine = "Итерация :";
        int strartI = 10,
            stopI = -10,
            gradientI = -1;
        //Решение
        for (int i=strartI; i>=stopI; i=i+gradientI) {
            //Вывод
            System.out.println(outLine + i);
        }
    }

    private static void task3() {
        System.out.println("Задание 3");
        // Выведите в консоль все четные числа от 0 до 17. #16:07
        //Инициализация
        String outLine = "Итерация :";

        //Решение
        for (int i=0; i<17; i+=2) {
            //Вывод
            System.out.println(outLine + i);
        }
    }

    private static void task2() {
        System.out.println("Задание 2");
        // С помощью цикла for выведите в консоль все числа от 10 до 1. #16:03
        //Инициализация
        String outLine = "Итерация :";

        //Решение
        for (int i=10; i>0; i--) {
            //Вывод
            System.out.println(outLine + i);
        }
    }

    private static void task1() {
        System.out.println("Задание 1");
        // С помощью цикла for выведите в консоль все числа от 1 до 10. #16:01
        //Инициализация
        String outLine = "Итерация :";

        //Решение
        for (int i=1; i<=10; i++) {
            //Вывод
            System.out.println(outLine + i);
        }
    }
}