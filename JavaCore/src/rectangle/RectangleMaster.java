package rectangle;
/*�������� ���� Rectangle,� ����� ���� ������� ����: �������,������.
 * ������� ��� ���� � ����������.�������� ����������� � ����������� � ��� ���������.
 * � ����������� ��� ��������� ������� ��� ���.����� ��������� ����,
 * �� ������� ������ ������������,�� �������� ����������� ������ ������.
 * �������� ������,�� ������ ������������� ����� �� ��������. � Main ����
 * ���������������� ��������� ����� �������������� ��� ������������.
 * ������� �� ������� ����� � �������� ������������.���� �� ������ �������
 *  ���� ��������� ������:<<����� ������������ =��� ���� �����>>,<<�������� ������������=
 *  ��� ���� �������� ������������>>*/
public class RectangleMaster {

	public static void main(String[] args) {	
		Rectangle first= new Rectangle();
		first.width=20;
		first.hight=10;
		String color="red";
		System.out.println(first.perimetr(color));	
	    System.out.println(first.square(color));
	    Rectangle second= new Rectangle( 30, 10);
	    String color1="green";
	    System.out.println(second.perimetr(color1));
	    System.out.println(second.square(color1));	
	}

}
