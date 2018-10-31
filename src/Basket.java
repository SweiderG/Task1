
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
		System.out.println("������ " + super.getBlueBallsCount());
	}
	
	public  void weightOnScreen() {
		System.out.println("���������� ����� ������� � ������� - " + getBlueBallsCount());
		if(weightOfBasket > Byte.MAX_VALUE || weightOfBasket < 0) {
			System.out.println("� ���! �� ������� �������! ��� �� ��������� ��� ����� 127 ���������!");
		} else {
			System.out.println("��� �������� �������� " + weightOfBasket + "�����������");
		}
	}
}
