import java.util.*;
public class ITSA_Basic_1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String beforesplit = "";
		String s1 ="    *\n    *\n    *\n    *\n    *\n";
		String s2 ="*****\n    *\n*****\n*    \n*****\n";
		String s3 ="*****\n    *\n*****\n    *\n*****\n";
		String s4 ="*   *\n*   *\n*****\n    *\n    *\n";
		String s5 ="*****\n*    \n*****\n    *\n*****\n";
		String s6 ="*****\n*    \n*****\n*   *\n*****\n";
		String s7 ="*****\n    *\n    *\n    *\n    *\n";
		String s8 ="*****\n*   *\n*****\n*   *\n*****\n";
		String s9 ="*****\n*   *\n*****\n    *\n    *\n";
		String s0 ="*****\n*   *\n*   *\n*   *\n*****\n";

		while(sc.hasNext()){
			int num = sc.nextInt();
			for(int j = 0;j < 5;j++){
				int snum = num % 10;
				num /= 10;
			
			switch(snum){
				case 1:
					beforesplit += s1;
					break;
				case 2:
					beforesplit += s2;
					break;
				case 3:
					beforesplit += s3;
					break;
				case 4:
					beforesplit += s4;
					break;
				case 5:
					beforesplit += s5;
					break;
				case 6:
					beforesplit += s6;
					break;
				case 7:
					beforesplit += s7;
					break;
				case 8:
					beforesplit += s8;
					break;
				case 9:
					beforesplit += s9;
					break;
				case 0:
					beforesplit += s0;
					break;
				}
			}
			String[] AfterSplit = beforesplit.split("\n");
			for(int i = 0;i < 5;i++){
				System.out.print(AfterSplit[i+15]+" "+AfterSplit[i+10]+" "+AfterSplit[i+5]+" "+AfterSplit[i]+"\n");
			}
			beforesplit="";
			
		}
			
	}
}


