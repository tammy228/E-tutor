import java.util.*;
public class ITSA_Basic_7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num,r_num=0,i_num=0,count=0;
		int[] digital = new int[4];
		String s="";
		num = sc.nextInt();
		while(count < num){
			s = sc.next();
			for(int i=0; i<4; i++){
				digital[i] = sc.nextInt();
			}
			switch(s){
			case "+":	r_num = digital[0] + digital[2];	i_num = digital[1] + digital[3];	break;
			case "-":	r_num = digital[0] - digital[2];	i_num = digital[1] - digital[3];	break;
			case "*":	r_num = digital[0] * digital[2] - digital[1] * digital[3];	i_num = digital[0] * digital[3] + digital[1] * digital[2];	break;
			}
			System.out.println(r_num + " " + i_num);
			count ++;
		}
	}
}
