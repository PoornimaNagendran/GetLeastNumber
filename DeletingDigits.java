import java.util.Arrays;
import java.util.*;
public class DeletingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int d = s.nextInt();
		int d1 = d;
		int count = 0;
		while (d1 != 0) {
			++count;
			d1 = d1 / 10;
		}
		int i = 0;
		int a[] = new int[count];
		while (d != 0) {
			a[i++] = d % 10;
			d = d / 10;
		}
		int output = 0;
		Arrays.sort(a);
		System.out.println("enter no. of digit to be deleted");
		int b=s.nextInt();
		for (int j = 0; j < a.length - b; j++) {
			output = output * 10;
			output = output + a[j];
		}
System.out.println("After deleting "+b+" digits minimum possible number is:");
		System.out.println(output);

	}

}
