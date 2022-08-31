
public class TicTacToeGameUC1 {

	public static void main(String[] args) {
		char[] board = createBoard();
        System.out.println("Welcome to TicTacToe program");

    }
    private static char[] createBoard() {
        char[] board = new char[10];
        for(int i=0;i<board.length;i++)
        {
            board[i] =  ' ';
        }
        return board;
	}

}
