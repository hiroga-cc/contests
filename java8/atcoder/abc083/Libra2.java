import java.util.Scanner;

public class Libra2{
	
	public static void main(String[] args){
		try{

			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			if (a+b>c+d){
				System.out.println("Left");
			}else if(a+b<c+d){
				System.out.println("Right");
			}else{
				System.out.println("Balanced");
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}
