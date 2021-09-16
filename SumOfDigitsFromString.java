package week2.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Tes12Le79af65";
		int sum=0;
		String replaceAll = str.replaceAll("[^0-9]","");
		System.out.println(replaceAll);
		
		for (int i=0;i<replaceAll.length();i++) {
			char c=replaceAll.charAt(i);
			System.out.println(c);
			int numericValue = Character.getNumericValue(c);
			sum=sum+numericValue;
			
		}
		
		System.out.println(sum);
		
	}

}
