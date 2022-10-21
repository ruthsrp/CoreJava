
public class FirstCode {
	public static void main(String args[]) {

		/*
		 * Multi Line Comment
		 */

		// Single Line Comment

		System.out.println("Hello World");


		char c = 'A';

		byte b = 127;

		short s = 32767;

		int i =10;

		long l = 56985l;

		float f = 748f;

		double d = 457855.6;
		int d1 = (int)d;//

		boolean bo = true;


		System.out.println("Char : "+c+" Byte : "+b+" Short : "+s+" Float : "+f+" Int : "+i+" Long :"+l+" Double :"+d+" Boolean :"+bo);
		System.out.println("Updated : "+d1);

		int exIm = (int)5.8; // Explicit Conversion
		double  dou = 5; // Impicit conversion


		int num1 = 10; int num2 = 5;

		// Arithmatic Operators
		int arithNum1 = num1 + num2; // add
		int arithNum2 = num1 - num2; // substract
		int arithNum3 = num1 * num2; // multiply
		int arithNum4 = num1 /num2; //divide
		int arithNum5 = num1%num2; //division reminder



		num1 += 3;

		System.out.println(num1);

		//or

		num1++;
		System.out.println(num1); // post increment
		++num1;
		System.out.println(num1); // pre increment


		//or

		num1 += 1;
		System.out.println(num1);


		// if else statements

		if(true) 
			System.out.println("yea true"); // Single statement if else

		if(false) 
			System.out.println("yea false");

		// Ternary Operator

		int ti = 12; int tj=3;

		ti = ti > 5? 2 : 3;
		System.out.println("ti : "+ ti);


		// Switch - allows int, char and above v1.7 accepts String. double not allowed.

		String switchVar = "abcd";

		switch(switchVar) {
		case "abc":
			System.out.println("its 1");
			break;
		case "bcd":
			System.out.println("its 2");
			break;
		case "cde":
			System.out.println("its 3");
			break;
		default:
			System.out.println("its nothing");

		}

		// looping is used to avoid code redundancy

		int whileVar = 0;
		while(whileVar <= 5) {
			//while(true) { infinite  loop
			System.out.println("Inside while loop" + whileVar);
			whileVar++;
		}

		// do while loop, 
		whileVar = 0;
		do {
			System.out.println("Inside dowhile loop - I will be executed atleast once and the condition checked!"+whileVar);
			whileVar++;
		} while(whileVar <= 5);

		// for loop
		for (int forVar=0;forVar<5;i++) {
			System.out.println("Inside forVar loop - I can be used when the start and end of variable value is defined!"+forVar);
			forVar++;
		}


		// nested for
		for(int forVar1 = 1;forVar1<=6;forVar1++) {
			for(int forVar2 = 1; forVar2<=forVar1;forVar2++) {
				System.out.print(forVar2+" ");
				}
			System.out.println();
		}


		// This is for GIT testing.






























		}
	}
