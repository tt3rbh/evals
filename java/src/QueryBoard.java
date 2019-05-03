import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class QueryBoard {
	public final static int ROWS = 256;
	public final static int COLS = 256;
	
	public static int[][] matrix = new int[ROWS][COLS];
	
	public static void setRow(int row, int val) {
		for (int i = 0; i < COLS; i++) {
			matrix[row][i] = val;
		}
	}
	
	
	public static void setCol(int col, int val) {
		for (int i = 0; i < ROWS; i++) {
			matrix[i][col] = val;
		}
	}
	
	
	public static int queryRow(int row) {
		int sum = 0;
		
		for (int i = 0; i < COLS; i++) {
			sum += matrix[row][i];
		}
		
		return sum;
	}
	
	
	public static int queryCol(int col) {
		int sum = 0;
		
		for (int i = 0; i < ROWS; i++) {
			sum += matrix[i][col];
		}
		
		return sum;
	}
	
	
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		// Initialize matrix
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				matrix[i][j] = 0;
			}
		}
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			
			String vals[] = line.split(" ");
			int rowcol = Integer.parseInt(vals[1]);
			
			if (vals.length == 3) {
				int val = Integer.parseInt(vals[2]);
				
				if (vals[0].equals("SetCol")) {
					setCol(rowcol, val);
				} else if (vals[0].equals("SetRow")) {
					setRow(rowcol, val);
				}
			} else if (vals.length == 2) {
				if (vals[0].equals("QueryCol")) {
					System.out.println(queryCol(rowcol));
				} else if (vals[0].equals("QueryRow")) {
					System.out.println(queryRow(rowcol));
				}
			}
			
		}
		
		buffer.close();
	}
}
