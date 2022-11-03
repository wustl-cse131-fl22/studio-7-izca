package studio7;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction (int inNumerator, int inDenominator) {
		numerator = inNumerator;
		denominator = inDenominator;
	}
	
	public double addFrac(){
		double frac= numerator/denominator;
		return frac + .5;
	}
	
	public double multFrac(){
		double frac= numerator/denominator;
		return frac * .5;
	}
	public double recipFrac(){
		double frac= numerator/denominator;
		return 1/frac;
	}
	
	public static void main(String[] args) {
		Fraction input = new Fraction(3,4);
		System.out.println(input.addFrac());
		System.out.println(input.multFrac());
		System.out.println(input.recipFrac());

	}

}
