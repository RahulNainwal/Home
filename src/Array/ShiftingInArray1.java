package Array;

public class ShiftingInArray1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Before Rotation ");
		ShiftingInArray1.printData(arr);
		int x = 3;
		for (int i = 0; i <= x; i++) {
			int temp = arr[0];
			// for (int j = 0; j < arr.length - (i + 1); j++) {
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		System.out.println("After Rotation ");
		ShiftingInArray1.printData(arr);
	}

	public static void printData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
