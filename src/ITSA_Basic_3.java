import java.util.*;
public class ITSA_Basic_3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x,y,ans;
		while(sc.hasNext()){
			x = sc.nextInt();
			y = sc.nextInt();
			if(10000 > ((x*x)+(y*y))||10000 == ((x*x)+(y*y))){
				System.out.println("inside");
			}else{
				System.out.println("outside");
			}
		}
	}
}
