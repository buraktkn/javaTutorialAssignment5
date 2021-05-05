package tutorialPractice2;

public class Special implements Bread,Lettuce,Meatball,Sauce, Cheddar,Ready{

	

	@Override
	public void meatball() {
		System.out.print("Meatball ");
		
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
	public void cheddar() {
		System.out.print("Cheddar ");		
	}

	@Override
	public void sauce() {
		System.out.println("Sauce-");		
	}

	@Override
	public void ready() {
		System.out.println("The all of them is added and Special burger is ready.");
		
	}


}
