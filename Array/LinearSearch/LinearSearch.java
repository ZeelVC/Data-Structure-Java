import java.util.*;

class Solution {
	public static int linearSearch(ArrayList<Integer> arr, int target){
		int arrSize = arr.size();
		int answerIndex = -1;
		for(int i = 0; i < arrSize; i++){
			if(arr.get(i) == target){
				answerIndex = i;
				break;
			}
		}
		return answerIndex;
	}
}

public class LinearSearch{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array element, Atlast enter -1 to stop!");
		ArrayList<Integer> arr = new ArrayList<>();
		
		int element;
		while((element = scanner.nextInt()) != -1){
			arr.add(element);
		}

		System.out.println("Enter the target element: ");
		int target = scanner.nextInt();

		System.out.println("Array Before required operation");
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}

		System.out.println("");

		int answer = Solution.linearSearch(arr, target);

		System.out.println("First Index at which target element appear is: " + answer);
		
		scanner.close();
	}
}
