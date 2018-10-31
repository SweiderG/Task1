import java.util.Scanner;

public class Ball {
	
	
	@Override
	public String toString() {
		return "Ball [redBallsCount=" + redBallsCount + ", blueBallsCount=" + blueBallsCount + "]";
	}
	private int redBallsCount = 0;
	private int blueBallsCount = 0;
	
	
	public int getRedBallsCount() {
		return redBallsCount;
	}
	public void setRedBallsCount(int redBallsCount) {
		this.redBallsCount = ++redBallsCount;
	}
	public int getBlueBallsCount() {
		return blueBallsCount;
	}
	public void setBlueBallsCount(int blueBallsCount) {
		this.blueBallsCount = ++blueBallsCount;
	}
	public static void hello() {
		System.out.println("Здравствуйте! Давайте заполним корзину мячиками!");
		System.out.println("Максимальный вес, который может выдержать корзина составляет 127 килограмм!");
		System.out.println("Вы можете заполнить корзину красными и синими мячами!");
		System.out.println("Если вы хотите положить синий мячик в корзину - введите число b");
		System.out.println("Если вы хотите положить красный мячик в корзину - введите число r");
		System.out.println("Если вы хотите прекратить кидать мячики в корзину - введите число exit");
	}
	public void getBalls() {

		Scanner sc = new Scanner(System.in);
		String imput;
		while(sc.hasNext()) {
			imput = sc.next();
			if(imput.matches("exit")) {
				System.out.println("Жаль, что Вы больше не хотите играть :C");
				break;
			} else if(imput.matches("b")) {
				System.out.println("Вы добавили один синий мячик! Ураа!");
				setBlueBallsCount(blueBallsCount);
			} else if(imput.matches("r")){
				System.out.println("Вы добавили один красный мячик!");
				setRedBallsCount(redBallsCount);
			} else {
				System.out.println("ОЙ! Вы что-то не то ввели. Попробуйте ещё разок");
			}
		}
		sc.close();
	}
}
