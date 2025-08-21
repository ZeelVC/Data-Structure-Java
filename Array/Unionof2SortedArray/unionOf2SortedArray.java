import java.util.*;

class Solution {

    private static void addelement(ArrayList<Integer> arr, int element){
        int arrSize = arr.size();
        if(arrSize == 0 || element != arr.get(arrSize - 1)){
            arr.add(element);

        }
    }

    public static ArrayList<Integer> findUnion(ArrayList<Integer> a, ArrayList<Integer> b) {
        // code here
        int aSize = a.size();
        int bSize = b.size();

        int i = 0;
        int j = 0;

        ArrayList<Integer> answer = new ArrayList<>();
        boolean isAdded = false;
        while(i < aSize && j < bSize){
            if(a.get(i) < b.get(j)){
                addelement(answer, a.get(i));
                i++;
            }else if(b.get(i) < a.get(i)){
                addelement(answer, b.get(j));
                j++;
            }else{
                addelement(answer, a.get(i));
                i++;
                j++;
            }
        }
        while(i < aSize){
            addelement(answer, a.get(i));
            i++;
        }
        while(j < bSize){
            addelement(answer, b.get(j));
            j++;
        }
        return answer;
    }
}

public class unionOf2SortedArray {
        public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter elements of first array A! Atlast enter -1 to stop.");
                ArrayList<Integer> a = new ArrayList<>();
                int element;
                while((element = scanner.nextInt()) != -1){
                        a.add(element);
                }

                System.out.println("Enter elements of second array B! Atlast enter -1 to stop.");
                ArrayList<Integer> b = new ArrayList<>();
                while((element = scanner.nextInt()) != -1){
                        b.add(element);
                }

                ArrayList<Integer> answer = new ArrayList<>();
                answer = Solution.findUnion(a, b);

                System.out.println("Union of two sorted array A and B is: ");
                for(int i = 0; i < answer.size(); i++){
                        System.out.print(answer.get(i) + " ");
                }
                scanner.close();
        }
}
	    
