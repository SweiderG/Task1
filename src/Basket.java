
public class Basket extends Ball{
	private byte weightOfBasket;
	public byte getWeightOfBasket() {
		return weightOfBasket;
	}

	public void setWeightOfBasket(byte weightOfBasket) {
		this.weightOfBasket = weightOfBasket;
	}

	public void weight() {
		int weightOfBlueBalls = super.getBlueBallsCount() * 5;
		int weightOfRedBalls = super.getRedBallsCount() * 10;
		weightOfBasket = (byte) (weightOfBlueBalls + weightOfRedBalls);
		System.out.println("дарова " + super.getBlueBallsCount());
	}
	
	public  void weightOnScreen() {
		System.out.println("Количество синих мячиков в корзине - " + getBlueBallsCount());
		if(weightOfBasket > Byte.MAX_VALUE || weightOfBasket < 0) {
			System.out.println("О НЕТ! Вы порвали корзину! Она не выдержала вес более 127 килограмм!");
		} else {
			System.out.println("Вес корзинки составил " + weightOfBasket + "килограммов");
		}
	}
}
