import java.util.*;
public class ITSA_Basic_5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int absnum,num,ans;
		String str = "";
		while(sc.hasNext()){
			num = sc.nextInt();
			if(num < 0){
				absnum = Math.abs(num);	//�������
				str = Integer.toBinaryString(absnum);	//�N�G�i��s�_��
				for(int i = str.length();i < 8 ; i++){
					str = "1" + str;
				}
				System.out.println(str);
			}else{
				ans = Integer.valueOf(Integer.toBinaryString(num));
				System.out.printf("%08d\n",ans);
			}
		}
	}
}
