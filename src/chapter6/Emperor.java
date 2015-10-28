package chapter6;

public class Emperor {
	public static final Emperor emperor = new Emperor();
	private Emperor(){
	}
	public static Emperor getInstance(){
		return emperor;
	}
	
	public void getName(){
		System.out.println("");
	}

}
