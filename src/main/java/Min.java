import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter element " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("elements in array are: "  );
        showArray(array);
        System.out.println("\n");
        System.out.println("min in array is: " + findMind(array));

    }

    private static void showArray(int[] arr) {
        for (int i1 : arr) {
            System.out.print(i1 + "\t");

        }
    }

    private static int findMind(int[] arr) {
        int min = arr[0];
        for (int i1 : arr) {
            if (i1 < min) {
                min = i1;
            }
        }
        return min;
    }
}
