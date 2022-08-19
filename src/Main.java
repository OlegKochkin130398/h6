public class Main {
    public static void main(String[] args) {
        int age = 25;
        int salary = 80000;
        int s1;
        float take;
        float summa;
        if (age < 23 && salary < 50000 && salary < 80000)
        {
            s1 = salary * 2;
            System.out.println("«Мы готовы выдать вам кредитную\n" +
                    "карту с лимитом " + s1 + " рублей».");
        }
        if (age < 23 && salary >= 50000 && salary < 80000)
        {
            s1 = salary * 2;
            take = 1.2F;
            summa = s1 * take;
            System.out.println("«Мы готовы выдать вам кредитную\n" +
                    "карту с лимитом " + summa + " рублей».");
        }
        if (age < 23 && salary >= 80000)
        {
            s1 = salary * 2;
            take = 1.5F;
            summa = s1 * take;
            System.out.println("«Мы готовы выдать вам кредитную\n" +
                    "карту с лимитом " + summa + " рублей».");
        }
        if (age >= 23 && salary < 50000 && salary < 80000)
        {
                s1 = salary * 3;
                System.out.println("«Мы готовы выдать вам кредитную\n" +
                        "карту с лимитом " + s1 + " рублей».");
        }
        if (age >= 23 && salary >= 50000 && salary < 80000)
        {
            s1 = salary * 3;
            take = 1.2F;
            summa = s1 * take;
            System.out.println("«Мы готовы выдать вам кредитную\n" +
                    "карту с лимитом " + summa + " рублей».");
        }
        if (age >= 23 && salary >= 80000)
        {
            s1 = salary * 3;
            take = 1.5F;
            summa = s1 * take;
            System.out.println("«Мы готовы выдать вам кредитную\n" +
                    "карту с лимитом " + summa + " рублей».");
        }
    }
}