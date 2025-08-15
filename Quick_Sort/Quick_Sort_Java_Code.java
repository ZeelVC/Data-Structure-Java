import java.util.*;

class Solution {
	
	private static int partition(ArrayList<Integer> arr, int low, int high){
		int pivot = arr.get(low);
		int left = low;
		int right = high;
		while(left < right){
			while(arr.get(left) <= pivot && left <= high - 1){
				left++;
			}
			while(arr.get(right) > pivot && right >= low + 1){
				right--;
			}

			if(left < right){
				int temp = arr.get(left);
				arr.set(left, arr.get(right));
				arr.set(right, temp);
			}
		}
		int temp = arr.get(low);
		arr.set(low, arr.get(right));
		arr.set(right, temp);
		return right;
	}

	public static void quickSort(ArrayList<Integer> arr, int low, int high){
		if(low < high){
			int partitionIndex = partition(arr, low, high);
			quickSort(arr, low, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, high);
		}
	}
}

public class Quick_Sort_Java_Code {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> Inputarr = new ArrayList<>();
		
		System.out.println("Enter a array elements! Atlast enter -1 to stop.");
		int element;
		while((element = scanner.nextInt()) != -1){
			Inputarr.add(element);
		}

		System.out.println("Before sorting array is: ");
		for(int num : Inputarr){
			System.out.print(num + " ");
		}
		System.out.println("");
		Solution.quickSort(Inputarr, 0, Inputarr.size() -1);
					
		System.out.println("After sorting array is: ");
		for(int num : Inputarr){
			System.out.print(num + " ");
		}

		scanner.close();
	}
}
