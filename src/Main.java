public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] expenses = new int[5];
        expenses[0] = 3500;
        expenses[1] = 4000;
        expenses[2] = 4500;
        expenses[3] = 5000;
        expenses[4] = 5500;
        int sum = 0;
        for (int element : expenses) {
            sum += element;
        }
        System.out.println("Сумма трат составила " + sum + " рублей");

        //Задача 2
        int[] expensesForWeek = new int[5];
        expensesForWeek[0] = 500;
        expensesForWeek[1] = 600;
        expensesForWeek[2] = 700;
        expensesForWeek[3] = 800;
        expensesForWeek[4] = 900;
        int minExpense = 1000;
        int maxExpense = 0;
        for (int current : expensesForWeek) {
            if (current < minExpense) {
                minExpense = current;
            }
        }
        for (int current : expensesForWeek) {
            if (current > maxExpense) {
                maxExpense = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. Максимальная сумма трат за неделю составила " + maxExpense + " рублей");

        //Задача 3
        int[] expForWeek = new int[5];
        expForWeek[0] = 100;
        expForWeek[1] = 300;
        expForWeek[2] = 500;
        expForWeek[3] = 700;
        expForWeek[4] = 1000;
        int sum3 = 0;
        float avg;
        for (int element : expForWeek) {
            sum3 += element;
        }
        avg = (float) sum3 / expForWeek.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");

        //Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println("Массив перед реверсом: ");

        for (char value : reverseFullName) {
            System.out.print(value);
        }
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println("\nМассив после реверса: ");
        for (char c : reverseFullName) {
            System.out.print(c);
        }

    }
}