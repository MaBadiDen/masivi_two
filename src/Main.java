public class Main {
    public static void main(String[] args) {
        int[] trati = generateRandomArray();
        int summ = 0;
        int max = 0;
        int min = 200000;

        for (int i = 0; i < 30; i++) {
            summ += trati[i];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");

        for (int i = 0; i < 30; i++) {
            if (trati[i] >= max) {
                max = trati[i];
            }
            if (trati[i] <= min) {
                min = trati[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        System.out.println("Средняя сумма трат за месяц составила " + ((double)summ / 30) + "рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i = reverseFullName.length - 1; i >= 0; i--)
        {
            System.out.print(reverseFullName[i]);
        }
    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}