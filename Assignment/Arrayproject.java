package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayproject {
    private static int[] create(int size, Scanner sc) {
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements to add in the array.");
        for (int i = 0; i < size; i++) {
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        return arr;
    }

    private static int[] add(int[] arr, int element) {
        int size = arr.length;
        int[] arr2 = Arrays.copyOf(arr, size + 1);
        arr2[size] = element;
        arr = null;
        return arr2;
    }

    private static int[] deleteByIndex(int[] arr, int idx) {
        int size = arr.length;
        int[] arr2 = new int[size - 1];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (i == idx) {
                continue;
            }
            arr2[j] = arr[i];
            j++;
        }
        arr = null;
        return arr2;
    }

    private static int[] deleteByValue(int[] arr, int value) {
        int size = arr.length;
        int[] arr2 = new int[size - 1];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                continue;
            }
            arr2[j] = arr[i];
            j++;
        }
        arr = null;
        return arr2;
    }

    private static void update(int[] arr, int idx, int value) {
        if (idx >= 0 && idx < arr.length) {
            arr[idx] = value;
        } else {
            System.out.println("Invalid index entered!");
        }
    }

    private static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = null;
        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("Enter 1-> Create an array.");
            System.out.println("Enter 2-> Add an element in the array.");
            System.out.println("Enter 3-> Delete element by index.");
            System.out.println("Enter 4-> Delete element by value.");
            System.out.println("Enter 5-> Update an element.");
            System.out.println("Enter 6-> Display the array.");
            System.out.println("Enter 7-> Exit.");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    int size = sc.nextInt();
                    System.out.println();
                    array = create(size, sc);
                    System.out.println("New array of size " + size + " has been created!");
                    break;

                case 2:
                    if (array == null) {
                        System.out.println("There is no array is created. Please first creat an array.");
                        break;
                    }
                    System.out.print("Enter the element that you want to add: ");
                    int element = sc.nextInt();
                    System.out.println();
                    array = add(array, element);
                    System.out.println("New element has been added successfully!");
                    break;

                case 3:
                    if (array == null) {
                        System.out.println("There is no array is created. Please first creat an array.");
                        break;
                    }
                    System.out.print("Enter the index that you want to delete: ");
                    int idx = sc.nextInt();
                    System.out.println();
                    size = array.length;
                    if (idx >= 0 && idx < size) {
                        array = deleteByIndex(array, idx);
                        System.out.println("Element deleted successfully!");
                        break;
                    } else {
                        System.out.println("Invalid index entered!");
                        break;
                    }

                case 4:
                    if (array == null) {
                        System.out.println("There is no array is created. Please first creat an array.");
                        break;
                    }
                    System.out.print("Enter the element that you want to delete: ");
                    element = sc.nextInt();
                    System.out.println();
                    array = deleteByValue(array, element);
                    System.out.println("Element deleted successfully!");
                    break;

                case 5:
                    if (array == null) {
                        System.out.println("There is no array is created. Please first creat an array.");
                        break;
                    }
                    System.out.print("Enter the index that you want to update: ");
                    idx = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter the element that you want to add into the updated index: ");
                    element = sc.nextInt();
                    System.out.println();
                    size = array.length;
                    if (idx >= 0 && idx < size) {
                        update(array, idx, element);
                        System.out.println("Element updated successfully!");
                        break;
                    } else {
                        System.out.println("Invalid index entered!");
                        break;
                    }

                case 6:
                    if (array == null) {
                        System.out.println("There is no array is created. Please first creat an array.");
                        break;
                    }
                    display(array);
                    break;

                default:
                    System.out.println("Thank you!!");
                    array = null;
                    flag = false;
                    break;
            }
        }
        sc.close();
    }
}
