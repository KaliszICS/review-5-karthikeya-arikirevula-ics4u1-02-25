import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		System.out.println(Math.abs(in.nextDouble()));
		in.nextLine();
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		double num;
		double num2;
		System.out.print("Input a number: ");
		num = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		num2 = in.nextDouble();
		in.nextLine();
		System.out.println(Math.floor(num/num2));
		System.out.println(Math.ceil(num/num2));
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		System.out.println(Math.round(Math.sqrt(in.nextInt())));
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		int num;
		int num2;
		System.out.print("Input a number: ");
		num = in.nextInt();
		in.nextLine();
		System.out.print("Input another number: ");
		num2 = in.nextInt();
		in.nextLine();
		System.out.println(Math.pow(num, num2));
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		double num;
		double num2;
		double num3;
		System.out.print("Input a number: ");
		num = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		num2 = in.nextDouble();
		in.nextLine();
		System.out.print("Input one more number: ");
		num3 = in.nextDouble();
		in.nextLine();
		System.out.println(Math.max(num,Math.max(num2, num3)));
		System.out.println(Math.min(num,Math.min(num2, num3)));
	}
	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		System.out.println(in.nextLine().contains("on"));
	}
	public static void q7() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		System.out.println(in.nextLine().equalsIgnoreCase("mango"));
	}
	public static void q8() {
		Scanner in = new Scanner(System.in);
		String word;
		String oneword;
		System.out.print("Input a word: ");
		word = in.nextLine();
		System.out.print("Input a letter: ");
		oneword = in.nextLine();
		System.out.println(word.indexOf(oneword));
		System.out.println(word.lastIndexOf(oneword));
	}

	public static void q9() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		System.out.println("Your sentence is " + in.nextLine().length() + " characters long");
	}
	public static void q10() {
		Scanner in = new Scanner(System.in);
		String word;
		String word2;
		String word3;
		System.out.print("Input a sentence: ");
		word = in.nextLine();
		System.out.print("Input a word to replace: ");
		word2 = in.nextLine();
		System.out.print("What word would you like to replace it with: ");
		word3 = in.nextLine();
		System.out.println(word.replaceAll(word2, word3));
	}

	public static void q11() {
		Scanner in = new Scanner(System.in);
		String word;
		System.out.print("Input a sentence: ");
		word = in.nextLine();
		System.out.println(word.toUpperCase().trim());
		System.out.println(word.toLowerCase().trim());
	}

	public static void q12() {
		Scanner in = new Scanner(System.in);
		String word;
		System.out.print("Input a word: ");
		word = in.nextLine();
		System.out.println(word.substring(0,4));
		System.out.println(word.substring(word.length() - 4));
	}
}