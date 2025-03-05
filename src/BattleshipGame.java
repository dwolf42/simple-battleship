import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Scanner;

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
        printMap();
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

    /*

        public static final String ASK_BOARD_COORDS = "Please enter coordinate for your ";
        public static final String ASK_COORDINATE_START = "Please enter starting coordinate for your  ";
        public static final String ASK_COORDINATE_END = "Please enter end coordinate for your ";

        public static final String TELL_SIZE = "It has a size of ";
        public static final String TELL_ERROR = "Error";

        public static final String COORDS_REGEX = "[A-J](10|[1-9])";
     */
    private void placeShip() {
        Scanner scanner = new Scanner(System.in);

        String VALID_COORDS_REGEX = "[A-J](10|[1-9])";
        int[] fullShipCoords;

        System.out.println("Please enter starting coordinate for your ship ");
        String rawStartCoord = scanner.nextLine();
        String upcastStartCoord = rawStartCoord.toUpperCase();
        String[] splitStartCoord = upcastStartCoord.split(" ");

        while (!splitStartCoord[0].matches(VALID_COORDS_REGEX)
                && !splitStartCoord[1].matches(VALID_COORDS_REGEX)) {
            System.out.println("Error.");
            System.out.println("Please enter front coordinate for your ship ");
            rawStartCoord = scanner.nextLine();
            upcastStartCoord = rawStartCoord.toUpperCase();
            splitStartCoord = upcastStartCoord.split(" ");
        }


        System.out.println("Please enter rear coordinate for your ship ");
        String rawRearCoord = scanner.nextLine();
        String upcastRearCoord = rawRearCoord.toUpperCase();
        String[] splitRearCoord = upcastRearCoord.split(" ");

        while (!splitRearCoord[0].matches(VALID_COORDS_REGEX)
                && !splitRearCoord[1].matches(VALID_COORDS_REGEX)) {
            System.out.println("Error.");
            System.out.println("Please enter rear coordinate for your ship ");
            rawRearCoord = scanner.nextLine();
            upcastRearCoord = rawRearCoord.toUpperCase();
            splitRearCoord = upcastRearCoord.split(" ");
        }

// TODO: join both split front and rear coords to one array

        // To represent the alphanumeric coords in an array-index format they require parsing
        int[] parsedCoords = new int[4];
        for (int i = 0; i < userInputCoords.length; i++) {
            // These two lines were made by ChatGPT
            parsedCoords[i * 2] = userInputCoords[i].toUpperCase().charAt(0) - 65;
            parsedCoords[i * 2 + 1] = Integer.parseInt(userInputCoords[i].substring(1)) - 1;
        }
    }
