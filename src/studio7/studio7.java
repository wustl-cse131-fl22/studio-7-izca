package studio7;

public class studio7 {
	private double length;
	private double width;	
	
	public studio7(double inLength, double inWidth) {
		length = inLength;
		width = inWidth;
	
	}

//private double area;
//private double per;

	public double getArea() {
		return length*width;
	}

	public double getPer() {
		return (2*length) + (2*width);
	}
	public boolean square() {
		if (length==width) {
			return false;	
		}
		else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studio7 rectangle = new studio7(4,12);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPer());
		System.out.print("this is a rectangle  "+ rectangle.square());
		
		
			
	
	}

}
