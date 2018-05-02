package search;

public class LinearSearch {

	public static void main(String[] args) {

		DataSet data = new DataSet(1000000);
		int Search = 99;
		Boolean isFound = false;
		for(int i = 0; i < data.data.length; i++) {
			data.NumberTry++;
			if(data.data[i] == Search) {
				System.out.println("Found after try: " + data.NumberTry);
				isFound = true;
				break;
			} 
		}
		
		if(isFound == false) {
			System.out.println("Not found");
		}
	}

}
