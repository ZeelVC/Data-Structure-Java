import java.util.*;

class Solution {

	private static void merge(ArrayList<Integer> arr, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		
		while(left <= mid && right <= high){
			if(arr.get(left) <= arr.get(right)){
				temp.add(arr.get(left));
				left++;
			}else{
				temp.add(arr.get(right));
				right++;
			}
		}

		while(left <= mid){
			temp.add(arr.get(left));
			left++;
		}

		while(right <= high){
			temp.add(arr.get(right));
			right++;
		}

		for(int i = low; i <= high; i++){
			arr.set(i, temp.get(i - low));
		}
	}

	public static void mergeSort(ArrayList<Integer> arr, int low, int high) {
		if(low >= high) return;
		int mid = (high + low) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}
}

public class Merge_Sort_Java_Code {
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
		Solution.mergeSort(Inputarr, 0, Inputarr.size() -1);
					
		System.out.println("After sorting array is: ");
		for(int num : Inputarr){
			System.out.print(num + " ");
		}

		scanner.close();
	}	
}
