public class PracticeProblem {

	public static void main(String args[]) {
		int[] coolArray = {1,5,3,4,5,6};
		int lookForThisNumber = 5;
		int numbersIndex = find(coolArray, lookForThisNumber);
		System.out.println(numbersIndex);

		String[] arrayOfStings = {"hi", "hello", "good morning", "hey", "hello"};
		String lookForThisString = "hello";
		int didYouFindTheString = findstring(arrayOfStings, lookForThisString);
		System.out.println(didYouFindTheString);

		char[] arrayOfChars = {'a', 'b', 'a', 'd', 'a'};
		char lookForThisChar = 'a';
		int letMeKnowTheIndexOfWhere_a_Is = findChar(arrayOfChars, lookForThisChar);
		System.out.println(letMeKnowTheIndexOfWhere_a_Is);
	}
	public static int find(int[] array, int ourNumber) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == ourNumber) {
            return i; 
        }
    }
    	return -1; 
	}

	public static int findstring(String[] array, String outString){
		int index = -1;
		for (int i = 0; i < array.length; i++){
			if (array[i].equals(outString)){
				return i;
			}
		}
		return index;
	}
	public static int findChar(char[] array, char ourLetter){
		int counter = 0;
		int index = -1;
		for (int i = 0; i < array.length; i++){
			if (array[i] == ourLetter){
				index = i;
				counter++;
				
				if (counter == 2){
					return index;
				}
			}
		}
		return index;
	}
	

}
