package rectangle;
/*Написати клас Rectangle,в якому буде описано поля: довжина,ширина.
 * Описати дані поля в конструктрі.Створити конструктор з параметрами і без параметрів.
 * В конструкторі без параметрів вказати своі дані.Тобто створюючи обєкт,
 * за вибором даного конструктору,ви отримаєте прямокутник даного розміру.
 * Написати методи,які будуть розраховувати площу та периметр. В Main класі
 * продемонструвати створення обєктів використовуючи два конструктори.
 * вивести на консоль площу і периметр прямокутника.Вивід на консолі повинен
 *  мати наступний вигляд:<<Площа прямокутника =тут буде площа>>,<<Периметр прямокутника=
 *  тут буде периметр прямокутника>>*/
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
