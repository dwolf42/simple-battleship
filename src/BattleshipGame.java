import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;

public class BattleshipGame {
    private Map<String, Integer> ships;
    private char[][] gameBoard;
    public BattleshipGame() {
        ships = new LinkedHashMap<>();
        ships.put("Carrier", 5);
        ships.put("Battleship", 4);
        ships.put("Cruiser", 3);
        ships.put("Submarine", 3);
        ships.put("Destroyer", 2);

        gameBoard = new char[10][10];
        for (char[] coordinates : gameBoard) {
            Arrays.fill(coordinates, '~');
        }

    }

    private void run() {
        printMap();

    }

   private void printMap() {
       // Add numbers 1-10 above game board for column enumeration
       for (int i = 0; i < gameBoard.length; i++) {
           System.out.print((i == 0 ? "  " : " ") + (i + 1));
       }
       System.out.println();

       // Add characters A-J left of game board for row enumeration
       // Using numbers as incrementor instead of characters to utilize the array's length as limit
       char ch = 'A';
       for (int i = 0; i < gameBoard.length; i++) {
           System.out.print(ch + " ");
           ch++;
           for (int j = 0; j < gameBoard[i].length; j++) {
               System.out.print(gameBoard[i][j] + " ");
           }
           System.out.println();
       }
       System.out.println();
   }
}
