import java.util.Scanner;

public class TicTacGameUC4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char Player1 = anyLetter();
		char Player2 = (Player1 == 'X') ? 'O' : 'X';
		System.out.println("Player1 " + Player1);
		System.out.println("Player2 " + Player2);
		char[] board = createBoard();
		showBoard(board);
		move(Player1, board);
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

	private static void move(char Player1, char[] board) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Move (1-9)");
		int move = scanner.nextInt();
		for (int i = 0; i <= 8; i++) {
			if (board[i] == ' ') {
				switch (move) {
				case 1:
					board[0] = Player1;
					break;
				case 2:
					board[1] = Player1;
					break;
				case 3:
					board[2] = Player1;
					break;
				case 4:
					board[3] = Player1;
					break;
				case 5:
					board[4] = Player1;
					break;
				case 6:
					board[5] = Player1;
					break;
				case 7:
					board[6] = Player1;
					break;
				case 8:
					board[7] = Player1;
					break;
				case 9:
					board[8] = Player1;
					break;
				}
			} else {
				System.out.println("Position is not free! Letter is entered");
			}
		}
		showBoard(board);
	}

}
