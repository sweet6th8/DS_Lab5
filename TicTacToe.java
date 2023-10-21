package lab5_2D_Arrays;

public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;

	public TicTacToe(char[][] board) {
		super();
		this.board = board; // Không cần tạo một mảng mới ở đây
	}

	/*
	 * This method checks all rows and returns true if any of them are marked with
	 * all of a single player's markers. Otherwise, returns false.
	 */
	public boolean checkRows() {
		int count;
		for (int i = 0; i < board.length; i++) {
			count = 1; // Khởi tạo count bằng 1
			for (int j = 0; j < board[i].length - 1; j++) {
				if (board[i][j] == EMPTY || board[i][j] != board[i][j + 1]) {
					break;
				}

				count++;

				if (count == board[i].length) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * This method checks all columns and returns true if any of them are marked
	 * with all of a single player's. Otherwise, returns false.
	 */
	public boolean checkColumns() {
		int count;
		for (int i = 0; i < board.length; i++) {
			count = 1; // Khởi tạo count bằng 1
			for (int j = 0; j < board[i].length - 1; j++) {
				if (board[j][i] == EMPTY || board[j][i] != board[j + 1][i]) {
					break;
				}

				count++;

				if (count == board.length) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * This method checks both diagonals and returns true if any of them are marked
	 * with all of a single player's markers. Otherwise, returns false.
	 */
	public boolean checkDiagonals() {
		// Check top-left to bottom-right
		int count = 1;
		for (int i = 0; i < board.length; i++) {
			if (board[i][i] == EMPTY || board[i][i] != board[i + 1][i + 1]) {
				break;
			}

			count++;

			if (count == board.length) {
				return true;
			}
		}

		// Check bottom-left to top-right
		count = 1;
		int n = board.length;
		for (int i = 0; i < n - 1; i++) {
			if (board[i][n - i - 1] == EMPTY || board[i][n - i - 1] != board[i + 1][n - i - 2]) {
				break;
			}

			count++;

			if (count == board.length) {
				return true;
			}
		}
		return false;
	}
	
	//Task 2.4 (advanced): Expand the implemented methods for handling a board with n x n matrix.
	// Các methods trên có thể áp dụng cho matrix n x n

	public static void main(String[] args) {
		char[][] board_1 = { { 'X', 'O', 'X', 'X' }, { 'O', 'X', 'X', 'X' }, { 'O', 'O', 'X', 'X' },
				{ 'O', 'O', 'O', 'X' } };
		TicTacToe tictac = new TicTacToe(board_1);
		System.out.println(tictac.checkRows());
		System.out.println(tictac.checkColumns());
		System.out.println(tictac.checkDiagonals());
	}
}