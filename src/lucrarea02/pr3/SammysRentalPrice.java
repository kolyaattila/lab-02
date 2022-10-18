package lucrarea02.pr3;

import java.util.Scanner;

public class SammysRentalPrice {

	public static final int PRICE_PER_HOUR = 40;
	public static final int PRICE_PER_MINUTE = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduceti numarul de minute pentru inchirierea echipamentului: ");

		int minutes = scanner.nextInt();

		int hours = minutes / 60;
		int extraMinutes = minutes - (hours * 60);
		int price = (hours * PRICE_PER_HOUR) + (extraMinutes * PRICE_PER_MINUTE);

		System.out.println("Numarul total de ore: " + hours);
		System.out.println("Numarul total de minute extra: " + extraMinutes);
		System.out.println("Pretul total este:  " + price);
	}
}
