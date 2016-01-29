
public class ISBNChecker {
	
	public static boolean isISBN(String isbn) {
		boolean response = false;
		int isbnSum = Character.getNumericValue(isbn.charAt(0));
		int tempNum;
	
		for (int i=1; i<9; i++) {
			tempNum = Character.getNumericValue(isbn.charAt(i));
			isbnSum += (tempNum * (i+1));
		}
		
		if (isbn.charAt(9) == 'X'){
			if ((isbnSum % 11) == 10) {
				response = true;
			}
		}
		else if ((isbnSum % 11) == Character.getNumericValue(isbn.charAt(9))) {
			response = true;
		}
		return response;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//valid ISBN
		System.out.println(isISBN("0205080057"));
		//not a valid ISBN
		System.out.println(isISBN("0136091812"));
		//valid ISBN
		System.out.println(isISBN("123456789X"));
	}

}
