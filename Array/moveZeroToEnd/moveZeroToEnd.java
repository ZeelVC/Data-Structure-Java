import java.util.*;

class Solution {
	public static void code(ArrayList<Integer> arr) {
		int arrSize = arr.size();
		int zeroInd = -1;
		for(int i = 0; i < arrSize; i++){
			if(arr.get(i) == 0){
				zeroInd = i;
				break;
			}
		}

		if(zeroInd == -1) return;

		for(int i = 0; i < arrSize; i++){
			if(arr.get(i) != 0 && i > zeroInd){
				int temp = arr.get(i);
				arr.set(i, arr.get(zeroInd));
				arr.set(zeroInd, temp);
				zeroInd++; 
			}
		}
	}
}

public class moveZeroToEnd {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array element, Atlast enter -1 to stop!");
		ArrayList<Integer> arr = new ArrayList<>();
		
		int element;
		while((element = scanner.nextInt()) != -1){
			arr.add(element);
		}

		System.out.println("Array Before required operation");
		
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}

		System.out.println("");

		System.out.println("Array after required operation");
		
		Solution.code(arr);
		for(int Element : arr){
			System.out.print(Element + " ");
		}
	}
}
