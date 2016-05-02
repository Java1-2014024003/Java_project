
public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=8; j>=1; j--){
			for(int i=1; i<=6; i++){
				if((7<=j&&j<=8)&&(5<=i&&i<=6))
					break;
				else if((5<=j&&j<=6)&&(4<=i&&i<=5))
					continue;
				else if((j==1)&&(4<=i&&i<=5)){
					System.out.print("    ");
					continue;
				}
				System.out.print((j*100+i)+" ");
			}
			System.out.println(" ");
		}

	}

}
