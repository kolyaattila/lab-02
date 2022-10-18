package lucrarea03.pr2;

import java.util.Scanner;

public class CarlysEventPriceWithMethods {

	public static final int PRICE_PER_PERSON = 35;

	public static void main(String[] args) {

		int numberParticipants = getNumberParticipants();
		int totalPrice = calculateTotalPrice(numberParticipants);

		printMotto();
		System.out.println("Numele companiei: Carly's Catering ");
		System.out.println("Numarul total de invitati: " + numberParticipants);
		System.out.println("Pretul per oaspete este de 35$ ");
		System.out.printf("Pretul total este: %s$ %n", totalPrice);

		if (isEventBig(numberParticipants)) {
			System.out.println("Clasificarea evenimentului: mare");
		} else {
			System.out.println("Clasificarea evenimentului: mic");
		}
	}

	private static void printMotto() {
		System.out.println("Motto: ...");
	}

	private static int getNumberParticipants() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduceti numarul de initati la eveniment: ");
		return scanner.nextInt();
	}

	private static int calculateTotalPrice(int numberParticipants) {
		return numberParticipants * PRICE_PER_PERSON;
	}

	private static boolean isEventBig(int numberParticipants) {
		return numberParticipants >= 50;
	}

}
