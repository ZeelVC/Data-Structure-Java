import java.util.*;

class Solution {
	private static void reverseArray(int start, int end, ArrayList<Integer> arr){
		while(start < end){
			int temp = arr.get(start);
			arr.set(start, arr.get(end));
			arr.set(end, temp);
			start++;
			end--;
		}
	}

	public static void rotate(ArrayList<Integer> arr, int k){
		int sizeArray = arr.size();
		k = k % sizeArray;
		reverseArray(0, sizeArray - 1, arr);
		reverseArray(0, sizeArray - k - 1, arr);
		reverseArray(sizeArray - k, sizeArray - 1, arr);
	}
}

public class leftRotateByK {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

                ArrayList<Integer> Inputarr = new ArrayList<>();

                System.out.println("Enter a array elements! Atlast enter -1 to stop.");
                int element;
                while((element = scanner.nextInt()) != -1){
                        Inputarr.add(element);
                }
		
		System.out.println("Enter the value of k: ");
		int k;
		k = scanner.nextInt();

                System.out.println("Array is: ");
                for(int num : Inputarr){
                        System.out.print(num + " ");
                }
                System.out.println("");
                Solution.rotate(Inputarr, k);

                System.out.println("After left rotating array by " + k + " position, array is: ");
                for(int num : Inputarr){
                        System.out.print(num + " ");
                }

                scanner.close();
	}
}          
 	
