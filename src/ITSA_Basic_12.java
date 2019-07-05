import java.util.*;
public class ITSA_Basic_12 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		while(sc.hasNext()){
			num = sc.nextInt();
			System.out.println(fun(num));
		}
	}
	private static int fun(int n){
		if(n == 0 || n == 1) return n += 1;
		else return fun(n-1)+fun(n / 2);
	}
}
