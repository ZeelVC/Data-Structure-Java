import java.util.*;

class Solution {
    public static int missingNumber(ArrayList<Integer> nums) {
        int numsSize = nums.size();
        long answer = (numsSize * (numsSize + 1))/2;
        for(int i = 0; i < numsSize; i++){
            answer = answer - (long) nums.get(i);
        }
        return (int) answer;
    }
}

public class FindMissingNumber {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element of the array! Atlast enter -1 to stop.");
		ArrayList<Integer> arr = new ArrayList<>();;
		int element;
		while((element = scanner.nextInt()) != -1){
			arr.add(element);
		}

		System.out.println("Actual Array is: ");
		for(int elementIterator : arr){
			System.out.print(elementIterator + " ");
		}
		System.out.println("");
		
		int answer = Solution.missingNumber(arr);
		System.out.println("Missing number is: " + answer);
		scanner.close();
	}
}
