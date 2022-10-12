package Week1.day2;

public class Calculator {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		public void additionTwoNumbers(int A,int B) {
			int C = A+B;
			System.out.println(C);
			
			}

			public void subractionTwoNumber(int w,int f) {
				int e = w- f;
				System.out.println(e);
			
			}
			public void multipleTwoNumbers(double i,double j) {
				double g = i*j;
				System.out.println(g);
			}
			public void divideTwoNumbers(float k,float n) {
				float x = k/n;
				System.out.println(x);
			}
			public static void main(String[] args) {
				Calculator cals = new Calculator();
				cals.additionTwoNumbers(75, 45);
				cals.subractionTwoNumber(44, 78);
				cals.multipleTwoNumbers(47.4572, 23.4824556);
				cals.divideTwoNumbers(4541f, 52f);
			}
		}

	}

}
