import java.util.*;
public class ITSA_Basic_4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int shour,smin,ehour,emin,totaltime,money;
			shour = sc.nextInt();
			smin = sc.nextInt();
			ehour = sc.nextInt();
			emin = sc.nextInt();
			if(emin < smin){
				emin += 60;
				ehour -=1;
			}
			totaltime = (ehour - shour) * 60 + (emin - smin);
			if(totaltime > 240){
				money = 280 + ((totaltime-240)/30) * 60;
			}else if(totaltime > 120){
				money = 120 + ((totaltime-120)/30) * 40;
			}else{
				money = (totaltime/30) * 30;
			}
			System.out.println(money);
			
			
		}
	}
}
