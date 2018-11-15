import java.util.SortedSet;
import java.util.TreeSet;

public class SudokuValidator {

	public static boolean check(int[][] sudoku) {
		return rowAndColCheck(sudoku) && blockCheck(sudoku);
	}

	private static boolean rowAndColCheck(int[][] sudoku) {
		SortedSet<Integer> row = new TreeSet<>();
		SortedSet<Integer> col = new TreeSet<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				row.add(sudoku[i][j]);
				col.add(sudoku[j][i]);
			}
			if (invalidNumbers(row)) return false;
			if (invalidNumbers(col)) return false;
			row.clear();
			col.clear();
		}
		return true;
	}

	private static boolean blockCheck(int[][] sudoku) {
		SortedSet<Integer> block = new TreeSet<>();
		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						block.add(sudoku[i + k][j + l]);
					}
				}
				if (invalidNumbers(block)) return false;
				block.clear();
			}
		}
		return true;
	}

	private static boolean invalidNumbers(SortedSet<Integer> numbers){
		for (int i = 0; i < 9; i++) {
			if (!numbers.contains(i+1)) return true;
		}
		return false;
	}

}
