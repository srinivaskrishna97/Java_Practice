
public class Practice_One {

	public static void main(String[] args) {

		boolean a1[] = { true, false };
		For_Each_loop_Practice(a1);
		Ternary_Operator_Practice(7);
		For_Loop_Practice();
		While_Loop_Practice();
		Do_While_Loop_Practice();
	}

	// for each_loop
	static void For_Each_loop_Practice(boolean a1[]) {
		for (boolean i : a1)
			// IF_ELSE_Practice
			if (i) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
	}

	// ternary_Operator
	static void Ternary_Operator_Practice(int number) {

		String output = (number % 2 == 0) ? "even" : "Odd";

		System.out.println("" + output);
	}

	//For_Loop_Practice
	static void For_Loop_Practice() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	//While_Loop_Practice()
	static void While_Loop_Practice() {
		int i = 1;
		while (i <= 2) {
			System.out.println("While Excuted");
			i++;
		}
	}
	//Do_While_Loop_Practice()
	static void Do_While_Loop_Practice() {
		int i = 1;
		do {
			System.out.println("Do While Excuted");
			i++;// This will execute atleast once
		} while (i <= 0);
	}
}
