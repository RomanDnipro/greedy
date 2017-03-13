import java.util.*;

public class Main{
	public static void main(String args[]){
		float m;    //требуемая сдача в $
		do{         //запрос пользователя суммы сдачи
			
			System.out.print("O hai! How much change is owed?\n");
			Scanner sc = new Scanner(System.in);
			m = sc.nextFloat();
		}while(m<0.009999);
		
		int n = (int)Math.round(m*100); //приведение сдачи к intовому значению($ к ?)
		int c25 = n/25;
		int c10 = (n - c25 * 25)/10;
		int c5 = (n - c25*25 - c10*10)/5;
		int c1 = (n - c25*25 - c10*10 - c5*5);
		int c = c25 + c10 + c5 + c1;      //минимальное количество монет для выдачи сдачи
		
		System.out.println(c);
	}
}