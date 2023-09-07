public class Main {
    public static void main(String[] args) {

        //Задача 1

        System.out.println("Задача 1");

        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }

        //Задача 2

        System.out.println("Задача 2");

        for (int x = 10; x > 0; x--) {
            System.out.println(x);
        }

        //Задача 3

        System.out.println("Задача 3");

        for (int x = 0; x < 17; x += 2) {
            if (x != 0) {
                System.out.println(x);
            }
        }

        //Задача 4

        System.out.println("Задача 4");

        for (int x = 10; x >= -10; x--) {
            System.out.println(x);
        }

        //Задача 5

        System.out.println("Задача 5");

        for (int year = 1904; year <= 2096; year += 4) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  // нет же смысла указывать y>1584
                System.out.println(year + " год является високосным");
            }
        }

        //Задача 6

        System.out.println("Задача 6");

        for (int n = 7; n <= 98; n += 7) {
            System.out.println(n);
        }

        //Задача 7

        System.out.println("Задача 7");

        for (int n = 1; n <= 512; n *= 2) {
            System.out.println(n);
        }

        //Задача 8

        System.out.println("Задача 8");
        {
            int accumulation = 29000;
            int capital = 0;
            int month = 1;

            for (; month <= 12; month++) {
                capital += accumulation;
                System.out.println("Месяц " + month + ",сумма накоплений равна " +
                        capital + " рублей");
            }
        }
        //Задача 9

        System.out.println("Задача 9");
        int deposit = 29000;
        float total = 0f;
        int month = 1;
        float ratio = 0.01f;


        //с капитализацией процентов
        System.out.println("С капитализацией процентов");
        for (; month <= 12; month++) {
            total = deposit + total + total * ratio;
            System.out.println("Месяц " + month + ",сумма накоплений равна " +
                    total + " рублей");


        }
        int capital = 0;
        float tax = 0f;
        float totaly = 0f;

        //без капитализации
        System.out.println("Без капитализации процентов");
        for (month = 1; month <= 12; month++) {
            capital = deposit + capital;
            totaly = capital + tax;
            tax = capital * ratio;

            System.out.println("Месяц " + month + ",сумма накоплений равна " +
                    totaly + " рублей");
        }

        //Задача 10

        System.out.println("Задача 10");

        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}