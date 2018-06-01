package algs;

public class SelectSort {

	public static void main(String[] args) {
		int[] testArray = { 1, 5, 6, 1, 3, 4, 7, 8, 9, 5, 4, 3, 6, 4, 2 };
		int[] result = selectSortFun(testArray);
		showArray(result);
	}

	public static int[] selectSortFun(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

		return a;
	}

	public static void showArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "");
		}
	}

}
