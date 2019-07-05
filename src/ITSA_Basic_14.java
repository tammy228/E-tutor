import java.util.*;
public class ITSA_Basic_14 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num,length;
		boolean Palindrome = true;
		while(sc.hasNext()){
			num = sc.nextInt();
			length = Integer.toString(num).length();
			int[] arr = new int[length];
			for(int i=0; i<length; i++){
				arr[i] = num % 10;
				num /= 10;
			}
			for(int i=0; i<length; i++){
				if(arr[i] != arr[length - (i+1)]) Palindrome = false;
			}
			if(Palindrome) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
