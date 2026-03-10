import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /// task 1
        int[] numbers = new int[]{1, 2, 3};

        double[] arr = {1.57, 7.654, 9.986};

        int[] humsters = new int[7];
        humsters[0] = 34;
        humsters[1] = 67;
        humsters[2] = 78;
        humsters[3] = 3;
        humsters[4] = 89;
        humsters[5] = 49;
        humsters[6] = 15;

        /// task 2
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a]);
            if (a < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < humsters.length; i++) {
            System.out.print(humsters[i]);
            if (i < humsters.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}