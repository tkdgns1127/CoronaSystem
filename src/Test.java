import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

	String inputName;
	String inputPhoneNumber;
	public static ArrayList<Person> infectionList = new ArrayList<>();

	void inputInformation(ArrayList<Person> arr) {
		Scanner scanner = new Scanner(System.in);
		boolean checkReservation = false;

		// ¿¹¿Ü Ã³¸®

		try {
			while (!checkReservation) {

				System.out.println("ÀÌ¸§À» ÀÔ·ÂÇØÁÖ¼¼¿ä.");
				inputName = scanner.nextLine();

				System.out.println("ÀüÈ­¹øÈ£ µŞÀÚ¸®¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
				inputPhoneNumber = scanner.nextLine();

				// inputName¿¡ ÇÑ±Û, ¿µ¹®¸¸ Æ÷ÇÔµÇ¾îÀÖ´ÂÁö Ã¼Å©ÇÏ´Â Á¤±ÔÇ¥Çö½Ä
				String pattern1 = "^[°¡-ÆRa-zA-Z]*$";

				// inputName °ªÀÌ ÀÔ·ÂµÇÁö ¾Ê¾ÒÀ»¶§?

				if (inputName.equals("")) {

					System.out.println("ÀÌ¸§ÀÌ ÀÔ·ÂµÇÁö ¾Ê¾Ò½À´Ï´Ù. ´Ù½Ã È®ÀÎÇØÁÖ¼¼¿ä.");
					continue;

					// inputName ÀÔ·Â°ªÀÇ ±æÀÌ°¡ 2º¸´Ù ÀÛ°Å³ª, Æ¯¼ö¹®ÀÚ°¡ Æ÷ÇÔµÇ¾úÀ» ¶§
				} else if (inputName.length() < 2 || !Pattern.matches(pattern1, inputName)) {
					System.out.println("¿Ã¹Ù¸¥ ÀÌ¸§ Çü½ÄÀÌ ¾Æ´Õ´Ï´Ù. ´Ù½Ã È®ÀÎÇØÁÖ¼¼¿ä.");
					continue;
				}

				// inputPhoneNumber ¼ıÀÚ¸¸ Æ÷ÇÔµÇ¾îÀÖ´ÂÁö Ã¼Å©ÇÏ´Â Á¤±ÔÇ¥Çö½Ä
				String pattern2 = "^[0-9]*$";

				// °ªÀÌ ÀÔ·ÂµÇÁö ¾Ê¾ÒÀ»¶§?

				if (inputPhoneNumber.equals("")) {

					System.out.println("¹øÈ£°¡ ÀÔ·ÂµÇÁö ¾Ê¾Ò½À´Ï´Ù. ´Ù½Ã È®ÀÎÇØÁÖ¼¼¿ä.");
					continue;

					// inputPhoneNumber ÀÔ·Â°ªÀÇ ±æÀÌ°¡ 4°¡ ¾Æ´Ï°Å°Å³ª, ¼ıÀÚ°¡ ¾Æ´Ò¶§
				} else if (inputPhoneNumber.length() != 4 || !Pattern.matches(pattern2, inputPhoneNumber)) {
					System.out.println("¿Ã¹Ù¸¥ ¹øÈ£ Çü½ÄÀÌ ¾Æ´Õ´Ï´Ù. ´Ù½Ã È®ÀÎÇØÁÖ¼¼¿ä.");
					continue;
				}

				// ¿¹¾àÀÚ ¸®½ºÆ®¿Í ÀÔ·Â°ªÀ» ºñ±³
				boolean correct = false;
				Person reservedPerson = null;

				for (Person person : arr) {

					String fullNum = person.phoneNum;
					String lastNum = fullNum.substring(9);

					if (inputName.equals(person.name) && lastNum.equals(inputPhoneNumber)) {
						correct = true;
						reservedPerson = person;
						break;
					}
				}

				if (correct) {
					checkReservation = true;
					randomTest(reservedPerson);
				} else {
					System.out.println("ÀÏÄ¡ÇÏ´Â Á¤º¸°¡ ¾ø½À´Ï´Ù.");
					Patient.patientStart();
				}
			}
			;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("¿À·ù°¡ ¹ß»ıÇÏ¿´½À´Ï´Ù. ´Ù½Ã ÀÛ¼ºÇØÁÖ¼¼¿ä.");
			Patient.patientStart();

		} finally {
			scanner.close();
		}
	}

	ArrayList<Person> randomTest(Person person) {

		System.out.println("Corona19 °Ë»ç¸¦ ½ÃÀÛÇÕ´Ï´Ù.");

		Random random = new Random();
		person.confirmed = (random.nextInt(4) != 0);

		if (person.confirmed) {
			infectionList.add(person);
			System.out.println("Corona19 °Ë»ç °á°ú [¾ç¼º] ÀÔ´Ï´Ù.");
		} else {
			System.out.println("Corona19 °Ë»ç °á°ú [À½¼º] ÀÔ´Ï´Ù.");
		}

		/*
		 * infectionList Ãâ·Â (name) - È®ÀÎ¿ë for (Person p : infectionList) {
		 * System.out.println("infectionList: " + p.getName()); }
		 */

		Patient.patientStart();

		return infectionList;
	}
} //
