package lucrarea03.pr3;

import java.util.Scanner;

public class SammysRentalPriceWithMethods {

	public static final int PRICE_PER_HOUR = 40;
	public static final int PRICE_PER_MINUTE = 1;

	public static void main(String[] args) {
		int minutes = getRentTimeInMinutes();

		printMotto();

		printRentStats(minutes);
	}

	private static int getRentTimeInMinutes() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduceti numarul de minute pentru inchirierea echipamentului: ");
		return scanner.nextInt();
	}

	private static void printMotto() {
		System.out.println("Motto: ...");
	}

	private static void printRentStats(int minutes) {
		int hours = minutes / 60;
		int extraMinutes = minutes - (hours * 60);
		int price = (hours * PRICE_PER_HOUR) + (extraMinutes * PRICE_PER_MINUTE);

		System.out.println("Numarul total de ore: " + hours);
		System.out.println("Numarul total de minute extra: " + extraMinutes);
		System.out.println("Pretul total este:  " + price);
	}

}
