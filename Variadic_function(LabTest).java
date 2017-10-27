import java.util.Arrays;

public class Variadic_function {

	static void variadic(int ... a) {
		int[] arr = a;
		int count=0;
		boolean checker=false;
	
		for(int i : a) {
			count++;
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<count; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=2; i<=arr[0]; i++) {
			if(arr[0]%i==0 && arr[count-1]%i==0) {
				checker = true;
			}
		}
		System.out.println();
		
		if(checker) {
			System.out.println("No!");
		}
		else {
			System.out.println("Yes!");
		}
	}
	
	public static void main(String[] args) {
		variadic(2, 4, 6, 8, 1, 3, 5, 7, 9);
		variadic(10, 30, 50, 70, 200, 500);
		variadic( 2, 4, 5, 6, 7, 8);
		variadic(9, 3, 5);
		variadic(3, 2, 5);
	}

}
