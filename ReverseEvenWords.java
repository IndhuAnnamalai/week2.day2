package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a software tester";
		String[] strArray = str.split(" ");

		for (int i = 0; i < strArray.length; i++) {
			if (i % 2 != 0) {

				for (int j = (strArray[i].length()) - 1; j >= 0; j--) {
					System.out.print(strArray[i].charAt(j));
				}
				System.out.print(" ");
			} else {
				System.out.print(strArray[i] + " ");
			}

		}
	}

}
