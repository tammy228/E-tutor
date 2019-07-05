import java.util.*;
public class ITSA_Basic_8 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int sqr_num,number;
		boolean division=false;
		while(sc.hasNext()){
			number = sc.nextInt();
			sqr_num = (int) Math.sqrt(number);
			for(int i=2; i<sqr_num; i++){
				if(number % i == 0)	division=true;	
			}
			if(division)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
