import java.util.*;
public class ITSA_Basic_2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int num = sc.nextInt();
			double ans = num * 1.6;
			System.out.printf("%.1f",ans);
			System.out.println();
		}
	}
}
