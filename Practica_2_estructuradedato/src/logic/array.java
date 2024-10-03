package logic;
import java.util.Scanner;

public class array {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce los elementos del arreglo separados por espacio:");
	        String[] arr = scanner.nextLine().split(" ");  

	        System.out.println("Introduce el valor de T:");
	        int t = scanner.nextInt();

	        desplazarArreglo(arr, t);

	        System.out.println("Arreglo modificado:");
	        for (String s : arr) {
	            System.out.print(s + " ");
	        }
	    }

    private static void rotateLeft(String[] arr, int start, int end) {
        String temp = arr[start];
        for (int i = start; i < end; i++) {
            arr[i] = arr[i + 1];
        }
        arr[end] = temp;
    }

    private static void rotateRight(String[] arr, int start, int end) {
        String temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }

    public static void desplazarArreglo(String[] arr, int t) {
        int n = arr.length;
        int mid = n / 2;

        for (int i = 1; i <= t; i++) {
            if (i % 2 != 0) {
                rotateLeft(arr, 0, mid - 1);
            } else {
                rotateRight(arr, mid, n - 1);
            }
        }
    }
}