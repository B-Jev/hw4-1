public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int summa = 0;
        for (int i : arr) {
            summa += i;
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int summaMin = arr[0];
        int summaMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (summaMin > arr[i]) {
                summaMin = arr[i];
            }
            if (summaMax < arr[i]) {
                summaMax = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + summaMin + " рублей. Максимальная сумма трат за день составила " + summaMax + " рублей");
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double summa = 0;
        double summaAverage = 0;
        int month = 30;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        summaAverage = summa / month;
        System.out.println("Средняя сумма трат за месяц составила " + summaAverage + " рублей");
    }

    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}