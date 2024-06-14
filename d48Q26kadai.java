public class d48Q26kadai {
	public static void main(String[] args) {
		if (args.length > 0) {
			try {
				double inputValue = Double.parseDouble(args[0]);
				d48Q26kadai obj = new d48Q26kadai();
				obj.show(inputValue);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please provide a valid number.");
			}
		} else {
			System.out.println("Please provide a number as a command line argument.");
		}
	}

	void show(double n) {
		System.out.print("value is " + n);
	}
}
