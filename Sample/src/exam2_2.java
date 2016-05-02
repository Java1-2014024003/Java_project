import java.util.Scanner;

public class exam2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=0;
		exam2_1 cc = new exam2_1();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("1. Input String ");
			System.out.println("2. Input Operation ");
			System.out.println("3. Quit ");
			System.out.print("Input menu number : ");
			menu = input.nextInt();
			
			if(menu==1)
				cc.function1();
			else if(menu==2)
				cc.function2();
			else if(menu==3)
				System.out.println("Quit");     //return;ÇØµµ µÊ.
			else
				System.out.println("Re-input menu number");
			
			
			
		}while(menu!=3);

	}

}
