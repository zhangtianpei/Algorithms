package algs;

public class InsertSort {

	public static void main(String[] args) {
		int[] testArray = { 1, 5, 6, 1, 3, 4, 7, 8, 9, 5, 4, 3, 6, 4, 2 };
		int[] result = insertSortFun(testArray);
		showArray(result);
	}

	public static int[] insertSortFun(int[] a) {
		
		for(int i=1;i<a.length;i++){
			for(int j=i; ;j--){
				if(a[j]<a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					continue;
				}
				break;
			}
		}
		
		return a;
	}

	public static void showArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "");
		}
	}
}
