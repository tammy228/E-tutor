import java.util.*;
public class ITSA_Basic_9 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num,total=0;
		while(sc.hasNext()){
			num = sc.nextInt();
			for(int i=1; i<=num; i++){
				if(i % 3 == 0)	total += i;
			}
			System.out.println(total);
		}
	}
}
