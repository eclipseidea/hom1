package rectangle;

/*Написати клас Rectangle,в якому буде описано поля: довжина,ширина.
 * Описати дані поля в конструктрі.Створити конструктор з параметрами і без параметрів.
 * В конструкторі без параметрів вказати своі дані.Тобто створюючи обєкт,
 * за вибором даного конструктору,ви отримаєте прямокутник даного розміру.
 * Написати методи,які будуть розраховувати площу та периметр. В Main класі
 * продемонструвати створення обєктів використовуючи два конструктори.
 * вивести на консоль площу і периметр прямокутника.Вивід на консолі повинен
 *  мати наступний вигляд:<<Площа прямокутника =тут буде площа>>,<<Периметр прямокутника=
 *  тут буде периметр прямокутника>> */
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
		return "Периметр прямокутника " + color + " = " + perimeter;
	}

	public String square(String color) {
		int square = hight * width;
		return "Площа прямокутника " + color + " = " + square;
	}
}
