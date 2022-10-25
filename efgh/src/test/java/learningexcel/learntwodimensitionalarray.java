package learningexcel;

public class learntwodimensitionalarray {

	public static void main(String[] args) {

		int g = 0 ;
	//	int d = 3;
		int arr[][] = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4, 5, 6 }, { 4, 5, 6, 7 } };
		for (int a = 0; a < 1; a++) {    // a is row count
			
			for (int b = 0; b < 4; b++) {                    // b is column count
				
				System.out.print(arr[a][b]+"  ");
			}
			System.out.println();																			
		}																															//2  3  4  5
																															   	 //    3  4  5  6 
		for (int c = 1; c <=3; c++) { 																		//     4  5  6  7 
			
			
			for (int h = 1; h <=3; h++) {
			
				g=h;
				System.out.print("    ");
			}
			System.out.print(arr[c][g]);
			System.out.println();
		}
		
	}

}
