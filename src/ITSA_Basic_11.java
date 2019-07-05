import java.util.*;
public class ITSA_Basic_11 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row,col,count=0;
			row = sc.nextInt();
			col = sc.nextInt();
			int[] array = new int[row*col];
			for(int i=0; i<row*col; i++ ){
				array[i] = sc.nextInt();
			}
			for(int i=1; i<=col; i++){
				for(int j=0; j<row; j++){
					System.out.print(array[count]);
					count += col;
					if(j < row-1)	System.out.print(" ");
				}
				System.out.println();
				count = i;
			}
	}
}
