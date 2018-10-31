
public class Main {

	public static void main(String[] args) {
		Ball a = new Ball();
		Basket b = new Basket();
		Ball.hello();
		a.getBalls();
		b.weight();
		b.weightOnScreen();
		System.out.println(a.getBlueBallsCount());
		System.out.println(a.toString());
	}
}
