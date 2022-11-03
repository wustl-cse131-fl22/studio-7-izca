package studio7;

public class Die {
	private int max;
	
	public Die(int inMax) {
		max=inMax;
	}
	public int getRandom(){
		int random=(int) (Math.random()*(max)-1)+1;
		return random;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die inputMax = new Die (30);
		for (int i=10; i>0; i--) {
			System.out.println(inputMax.getRandom());
		}
	}

}
