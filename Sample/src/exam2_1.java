import java.util.Scanner;

public class exam2_1 {
	Scanner input = new Scanner(System.in);
	
	void function1(){
		String str1, str2;
		System.out.print("Input String1: ");
		str1 = input.next();
		System.out.print("Input String2: ");
		str2 = input.next();
		function3(str1, str2);
	}
	
	void function2(){
		int x, y, result;
		String op;
		System.out.print("Input number1: ");
		x = input.nextInt();
		System.out.print("Input number2: ");
		y = input.nextInt();
		System.out.print("Input Operator: ");
		op = input.next();
		
		if(op.equals("+"))
			result = x + y;
		else if(op.equals("-"))
			result = x - y;
		else if(op.equals("*"))
			result = x * y;
		else if(op.equals("/"))
			result = x / y;
		else if(op.equals("%"))
			result = x % y;
		else return;
		function3(x, y, result, op);
	}
	
	void function3(String str_a, String str_b){
		String temp;
		temp = str_a.concat(str_b);
		System.out.println(temp);
		//System.out.println(str_a.concat(str_b));
		//System.out.println(str_a + str_b);
	}
	
	void function3(int x, int y, int result, String op){
		System.out.println(x + op + y + " = " + result);
	}

}
