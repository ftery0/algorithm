import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int count = 0;						 
        int N = in.nextInt();
        int[] arr = new int[N];				 

        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();			 
        }
        int b = in.nextInt();				 

        for(int j = 0; j < arr.length; j++){ 
            if(b == arr[j]){				 
                count++;
            }
        }
        System.out.println(count);
		
	}
}
