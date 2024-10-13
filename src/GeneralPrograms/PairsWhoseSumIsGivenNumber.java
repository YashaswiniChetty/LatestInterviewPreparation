package GeneralPrograms;

public class PairsWhoseSumIsGivenNumber {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		int sum=9;
		for (int i = 0; i < numbers.length; i++) 
		{ 
			int first = numbers[i]; 
			for (int j = i + 1; j < numbers.length; j++)
			{ 
				int second = numbers[j];
				if ((first + second) == sum) 
				{ 
					System.out.printf("(%d, %d) ", first, second);
					
					} 
				}
			}

		
		

	}

}
