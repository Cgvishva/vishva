import java.util.Scanner;

public class TicTac {
    
    static char[] board = {'1','2','3','4','5','6','7','8','9'};
    static char currentPlayer = 'X';

    // Method to print the board
    public static void printBoard() {
        System.out.println("\n" + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("--+---+--");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("--+---+--");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    // Method to make a move
    public static boolean makeMove(int pos) {
        if (pos < 1 || pos > 9 || board[pos - 1] == 'X' || board[pos - 1] == 'O') {
            System.out.println("Invalid move! Try again.");
            return false;
        } else {
            board[pos - 1] = currentPlayer;
            return true;
        }
    }

    // Method to check if current player won
    public static boolean checkWin() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    // Method to check if the board is full
    public static boolean isTie() {
        for (char c : board) {
            if (c != 'X' && c != 'O') {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;

        System.out.println("Welcome to Simple Tic-Tac-Toe!");
        printBoard();

        while (!gameOver) {
            System.out.print("\nPlayer " + currentPlayer + ", enter position (1-9): ");
            int pos = sc.nextInt();

            if (makeMove(pos)) {
                printBoard();

                if (checkWin()) {
                    System.out.println("Player " + currentPlayer + " wins! 🎉");
                    gameOver = true;
                } else if (isTie()) {
                    System.out.println("It's a tie! 🤝");
                    gameOver = true;
                } else {
                    // Switch player
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }
        }

        sc.close();
    }
}

