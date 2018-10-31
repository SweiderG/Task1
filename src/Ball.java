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
		System.out.println("������������! ������� �������� ������� ��������!");
		System.out.println("������������ ���, ������� ����� ��������� ������� ���������� 127 ���������!");
		System.out.println("�� ������ ��������� ������� �������� � ������ ������!");
		System.out.println("���� �� ������ �������� ����� ����� � ������� - ������� ����� b");
		System.out.println("���� �� ������ �������� ������� ����� � ������� - ������� ����� r");
		System.out.println("���� �� ������ ���������� ������ ������ � ������� - ������� ����� exit");
	}
	public void getBalls() {

		Scanner sc = new Scanner(System.in);
		String imput;
		while(sc.hasNext()) {
			imput = sc.next();
			if(imput.matches("exit")) {
				System.out.println("����, ��� �� ������ �� ������ ������ :C");
				break;
			} else if(imput.matches("b")) {
				System.out.println("�� �������� ���� ����� �����! ����!");
				setBlueBallsCount(blueBallsCount);
			} else if(imput.matches("r")){
				System.out.println("�� �������� ���� ������� �����!");
				setRedBallsCount(redBallsCount);
			} else {
				System.out.println("��! �� ���-�� �� �� �����. ���������� ��� �����");
			}
		}
		sc.close();
	}
}
