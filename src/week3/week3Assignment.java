package week3;

public class week3Assignment {

	public static void main(String[] args) {
		
		/*
		 * Week 3 coding assignment
		 */
		
		/*
		 * Problem 1
		 */
		
		
		// a & b
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		
		int subtractedAge = ages[ages.length - 1] - ages[0];
		System.out.println(subtractedAge);
		
		// c.
		
		int total = 0;
		
		for (int i = 0; i < ages.length; i++) {
			total = total + ages[i];
		}
		
		int average = total / ages.length;
		System.out.println(average);
		
		/*
		 * Problem 2
		 */
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// a.
		int sumLetters = 0;
		
		for (String name : names) {
			sumLetters += name.length();
			}
		
		double averageLength = sumLetters / names.length;
		System.out.println(averageLength);
			
		// b.
		String nameString = "";
		
		for (String name : names) {
			name += " ";
			nameString += name;
		}
		System.out.println(nameString);
		
		/*
		 * Problem 3
		 */
		
		String answer3 = "If you know the length of the array, you can access the last element by hard coding the specified index using array[index]. If the length is unknown, use array.length-1";
		System.out.println("Question 3: " + answer3);
		
		/*
		 * Problem 4
		 */
		
		String answer4 = "array[0] since java is a 0 based language, the start of any list of elements in 0 instead of 1.";
		System.out.println("Question 4: " + answer4);
		
		/*
		 * Problem 5
		 */
		
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		/*
		 * Problem 6
		 */
		
		int nameSums = 0;
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameSums += nameLengths[i];
		}
		
		System.out.println(nameSums);
		System.out.println("Problem 7: " + problem7("Hi", 3));
		System.out.println("Problem 8: " + fullName("Joe", "Cobarrubias"));
		int[] prob9Array = {23, 24, 88, 44, 9};
		System.out.println("Problem 9: " + problem9(prob9Array));
		double[] prob10Array = {22.1, 55.2, 12.4, 88.4, 11,8};
		double[] prob11Array = {55.1, 12.3, 111.6, 44.1, 88.9};
		System.out.println("Problem 10: " + problem10(prob10Array));
		System.out.println("Problem 11: " + problem11(prob10Array, prob11Array));
		System.out.println("Problem 12: " + willBuyDrink(true, 12.60));
		System.out.println("Problem 12: " + canBuyBeer(21, 4.00));
		}
	
	public static String problem7(String word, int n) {
		String result = "";
		
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
	public static String fullName(String firstname, String lastName) {
		String result = firstname + " " + lastName;
		return result;	
	}
	
	public static boolean problem9(int[] nums) {
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double problem10(double[] nums) {
		double total = 0;
		
		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		
		double average = total / nums.length;
		
		return average;
	}
	
	public static boolean problem11(double[] x, double[] y) {
		double total1 = 0;
		double total2 = 0;
		
		for (int i = 0; i < x.length; i++) {
			total1 += x[i];
		}
		
		for (int i = 0; i < y.length; i++) {
			total2 += y[i];
		}
		
		double average1 = total1 / x.length;
		double average2 = total2 / y.length;
		
		if (average1 > average2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	// Method to check the age of someone trying to buy beer. I created it because I like beer
	public static String canBuyBeer(int age, double money) {
		if (age >= 21 && money > 5.50) {
			return "You can afford a beer";
		} else if (age >= 21 && money < 5.50) {
			return "You are old enough, but you are broke :(";
		} else {
			return "You are too young buy beer";
		}
	}
}

