package tutorialPractice2;

public class Main {

	public static void main(String[] args) {
		Standart burger1 = new Standart();
		burger1.bread();
		burger1.lettuce();
		burger1.meatball();
		burger1.ready();
		Special burger2 = new Special();
		burger2.bread();
		burger2.lettuce();
		burger2.meatball();
		burger2.cheddar();
		burger2.sauce();
		burger2.ready();

	}

}
