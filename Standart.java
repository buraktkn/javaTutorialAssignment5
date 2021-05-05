package tutorialPractice2;

public class Standart implements Bread,Lettuce,Meatball,Ready{

	@Override
	public void meatball() {
		System.out.println("Meatball");
		
	}

	@Override
	public void lettuce() {
		System.out.print("Lettuce ");
		
	}

	@Override
	public void bread() {
		System.out.print("Bread ");
		
	}

	@Override
	public void ready() {
		System.out.println("The all of them is added and Standart burger is ready.");
		
	}

}
