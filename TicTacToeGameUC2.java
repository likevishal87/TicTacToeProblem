import java.util.Scanner;

public class TicTacToeGameUC2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char Player1 = anyLetter();
		char Player2 = (Player1 == 'X') ? 'O' : 'X';
		System.out.println("Player1 "+Player1);
		System.out.println("Player2 "+Player2);
		char[] board = createBoard();
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

}
