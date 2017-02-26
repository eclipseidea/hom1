package rectangle;

/*�������� ���� Rectangle,� ����� ���� ������� ����: �������,������.
 * ������� ��� ���� � ����������.�������� ����������� � ����������� � ��� ���������.
 * � ����������� ��� ��������� ������� ��� ���.����� ��������� ����,
 * �� ������� ������ ������������,�� �������� ����������� ������ ������.
 * �������� ������,�� ������ ������������� ����� �� ��������. � Main ����
 * ���������������� ��������� ����� �������������� ��� ������������.
 * ������� �� ������� ����� � �������� ������������.���� �� ������ �������
 *  ���� ��������� ������:<<����� ������������ =��� ���� �����>>,<<�������� ������������=
 *  ��� ���� �������� ������������>> */
public class Rectangle {
	int hight;
	int width;

	public Rectangle() {
		this.width = 20;
		this.hight = 10;
	}

	public Rectangle(int hight, int width) {
		super();
		this.hight = hight;
		this.width = width;
	}

	public String perimetr(String color) {
		int perimeter = (hight + width) * 2;
		return "�������� ������������ " + color + " = " + perimeter;
	}

	public String square(String color) {
		int square = hight * width;
		return "����� ������������ " + color + " = " + square;
	}
}
