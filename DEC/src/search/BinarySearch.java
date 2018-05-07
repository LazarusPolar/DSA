package search;

public class BinarySearch {
	public static void main(String[] args) {
		DataSet data = new DataSet(10000000);
		int Search = 1;
		Boolean isFound = false;
		int low = 0; 
		int high = data.getSize() -1;
		int mid  = 0; 
		
		while(!isFound) {
			if(low > high) {
				System.out.println("Numero no encontrado");
				break;
			}
			mid = low + ((high - low)/ 2);
			data.NumberTry++;
			if(data.data[mid] == Search) {
				System.out.println("Number is found after: " + data.NumberTry + "tries");
				break;
			}
			
			if(data.data[mid] < Search) {
				low = mid + 1;
			}
			if(data.data[mid] > Search) {
				high = mid - 1;
			}
		}
	}
}
