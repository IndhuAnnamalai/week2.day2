package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		int i, j = 0;
		String replace = null;
		String[] strArray = str.split(" ");

		for (i = 0; i < (strArray.length) - 1; i++) {
			for (j = i + 1; j < (strArray.length) - 1; j++) {
				//System.out.println("The string array of I is: " + strArray[i]);
				//System.out.println("The string array of J is: " + strArray[j]);
				if (strArray[i].equals(strArray[j])) {
					count = count + 1;
				}
		}
	}
		if (count > 1) {
			System.out.println(count);
			for (i = 0; i < (strArray.length) - 1; i++) {
				replace = str.replace(strArray[i], "");
			}
			System.out.print(replace);
		}
	}

}
