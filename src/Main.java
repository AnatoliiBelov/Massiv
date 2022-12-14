public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
        System.out.println("Массивы часть 2");
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1+2");
        int[] massiv1 = new int[]{1, 2, 3};
        double[] massiv2 = new double[]{1.57, 7.654, 9.986};
        int[] massiv3 = {1, 5, 8, 5, 7, 9, 4, 8, 4};
        for (int i = 0; i < massiv1.length; i++) {
            System.out.print(massiv1[i]);
            if (i == massiv1.length - 1) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < massiv2.length; i++) {
            System.out.print(massiv2[i]);
            if (i == massiv2.length - 1) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < massiv3.length; i++) {
            System.out.print(massiv3[i]);
            if (i == massiv3.length - 1) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] massiv1 = new int[]{1, 2, 3};
        double[] massiv2 = new double[]{1.57, 7.654, 9.986};
        int[] massiv3 = {1, 5, 8, 5, 7, 9, 4, 8, 4};
        for (int i = massiv1.length - 1; i >= 0; i--) {
            System.out.print(massiv1[i]);
            if (i == 0) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
        for (int i = massiv2.length - 1; i >= 0; i--) {
            System.out.print(massiv2[i]);
            if (i == 0) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
        for (int i = massiv3.length - 1; i >= 0; i--) {
            System.out.print(massiv3[i]);
            if (i == 0) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] massiv1 = new int[]{1, 2, 3};
        for (int i = 0; i < massiv1.length; i++) {
            if (massiv1[i] % 2 != 0) {
                massiv1[i]++;

            }
            System.out.print(massiv1[i]);
            if (i == massiv1.length - 1) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();
        ;
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task5() {
        System.out.println("Задача 2.1");
        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 2.2");
        //Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        //
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей»
        int[] arr = generateRandomArray();
        int wasteMin = 0;
        int wasteMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (wasteMax < arr[i]) wasteMax = arr[i];
        }
        System.out.println("Максимальная сумма трат за день составила " + wasteMax + " рублей");
        wasteMin = wasteMax;
        for (int i = 0; i < arr.length; i++) {
            if (wasteMin > arr[i]) wasteMin = arr[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + wasteMin + " рублей");
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 2.3");
        int[] arr = generateRandomArray();
        //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        //
        //Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        //
        //Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
        int totalMonth = 0;
        double wasteAvarage = 0.00;
        for (int i = 0; i < arr.length; i++) {
            totalMonth = totalMonth + arr[i];
        }
        wasteAvarage = (double) totalMonth / 30;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", wasteAvarage);
        System.out.println();
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 2.4");
        //В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов — char[ ].
        //
        //Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде. В качестве данных для массива используйте:
        //
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //
        //В результате в консоль должно быть выведено: Ivanov Ivan.
        //
        //Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
        //
        // 
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }

}




