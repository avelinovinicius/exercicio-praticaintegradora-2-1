import java.util.Arrays;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
		
		Arrays.sort(array);
		
		System.out.println("Ordenacao crescente: " + Arrays.toString(array));
		
		Arrays.sort(array, Collections.reverseOrder());
		
		System.out.print("Ordenacao decrescente: " + Arrays.toString(array));
	}

}
