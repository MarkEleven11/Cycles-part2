public class Main {
    public static void main(String[] args) {

        ///Цикл While

        ///Task 1
        System.out.println("Task 1");
        int moneyFull = 15000;
        int realCash = 0;
        int month = 0;
        while (realCash < 2_459_000) {
            realCash = realCash + realCash/100;
            realCash = realCash + moneyFull;
            month ++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + realCash + " рублей.");
        }

        ///Task 2
        System.out.println("Task 2");
        int numbers = 1;
        int numbersHigh = 0;
        while (numbersHigh < 10) {
            numbersHigh = numbers + numbersHigh;
            System.out.print(numbersHigh + " ");
        }

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        ///Task 3
        System.out.println("Task 3");
        float y = 12_000_000.0f;
        float numberFull = 1000.0f;
        float bornPeople = 17.0f;
        float deathPeople = 8.0f;
        for (int years = 1; years <= 10; years++) {
            bornPeople = 100 * bornPeople / numberFull;
            deathPeople = 100 * deathPeople / numberFull;
            y = y + (y * bornPeople) - (y * deathPeople);
            System.out.println("Год " + years + " численность населения составляет " + y + " миллионов человек");
        }

        ///Комбинация циклов и условных операторов.
        ///Task 1 and task 2.
        System.out.println("Task 1 and Task 2");
        float cashVasya = 15000f;
        float cashTotal = 0f;
        float percent = 0.07f;
        int month1 = 0;
        while (cashTotal < 12_000_000) {
            cashTotal = cashVasya + cashTotal;
            cashTotal = cashTotal + (cashVasya * percent);
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма" + cashTotal);
            }

        }

        ///Task 3.
        System.out.println("Task 3");
        float cashVasily = 15000f;
        float cashCount = 0f;
        float perc = 0.07f;
        for (int months = 0; months < 12 * 9; months++) {
            cashCount = cashVasily + cashCount;
            cashCount = cashCount + (cashVasily * perc);
            if (months % 6 == 0) {
                System.out.println("Сумма накоплений " +  cashCount + " за месяц " + months);
            }
        }

        ///Task 4.
        System.out.println("Task 4");
        for (int friday = 6; friday <= 31; friday++) {
            if (friday % 7 == 6) {
                System.out.println("Сегодня пятница " + friday + " число. Необходимо подготовить отчет.");
            }
        }

        ///Цикл do - while.
        ///Task 1.
        System.out.println("Task 1");
        int cycle79 = 79;
        int now = 2022;
        int now100 = now + 100;
        int now200 = now - 200;
        for (int start = 0; start <= now100; start += cycle79) {
            if (start >= now200) {
                System.out.println(start); }
            }

        ///Task 2.
        System.out.println("Task 2");
        int n = 0;
        for (int m = 2; m <= 20; m += 2) {
            n += 1;
            System.out.println(n + " x 2 = " + m);

        }


    }
}