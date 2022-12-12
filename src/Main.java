public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
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
    public static void task4(){
        System.out.println("Задача 4");
        int[] massiv1 = new int[]{1, 2, 3};
        for (int i = 0; i < massiv1.length; i++) {
            if (massiv1[i]%2!=0){
                massiv1[i]++;

            }
            System.out.print(massiv1[i]);
            if (i == massiv1.length - 1) {
                break;}
                System.out.print(", ");
            }
            }

        }




