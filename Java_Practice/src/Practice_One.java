
public class Practice_One {

	
	public static void main(String[] args) {

		boolean a1[]= {true,false};
		//User_Defined_Method_practice
		For_Each_loop_Practice(a1);
		Ternary_Operator_Practice(7);
	}
	//for each_loop 
	static void For_Each_loop_Practice(boolean a1[]) {
		for(boolean i:a1)	
			//IF_ELSE_Practice
			if(i) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}	
	}
	//ternary_Operator
	static void Ternary_Operator_Practice(int number) {
		
		
		String output = (number%2==0)?"even":"Odd";
	
		System.out.println(""+output);
	}
	
	
}
