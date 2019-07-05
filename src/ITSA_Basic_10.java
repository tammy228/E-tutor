import java.util.*;
public class ITSA_Basic_10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1,num2,temp;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if(num2 > num1){temp = num1; num1 = num2;num2 = temp;}
		while(true){
			if(num2 == 0)break;
			temp = num1;
			num1 = num2;
			num2 = temp % num2;
		}
		System.out.println(num1);
	}
}
