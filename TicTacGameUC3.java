import java.util.Scanner;

public class TicTacGameUC3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char Player1 = anyLetter();
		char Player2 = (Player1 == 'X') ? 'O' : 'X';
		System.out.println("Player1 " + Player1);
		System.out.println("Player2 " + Player2);
		char[] board = createBoard();
		showBoard(board);
	}

	private static char[] createBoard() {
		char[] board = new char[10];
		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	private static char anyLetter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Any letter: ");
		return sc.next().toUpperCase().charAt(0);
	}

	private static void showBoard(char[] board) {
		System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
		System.out.println("..........");
		System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
		System.out.println("..........");
		System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
	}

}
