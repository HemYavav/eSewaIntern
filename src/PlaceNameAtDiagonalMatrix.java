import java.util.Scanner;


public class PlaceNameAtDiagonalMatrix {
    public static Scanner sc;
    static String reset = "\u001B[0m";
    static String bold = "\u001B[1m";
    static String colorCYAN = "\u001B[36m";
    static String colorMAGENTA = "\u001B[35m";


    public static void displayMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }

    public static int[] inputRowsNoCharacter(int nameLength) {
        sc = new Scanner(System.in);
        int[] len = new int[nameLength];
        for (int i = 0; i < nameLength; i++) {
            System.out.print("Enter the row number for character " + (i + 1) + " of the name:");
            len[i] = sc.nextInt() - 1;
        }
        return len;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = {{'A', 'B', 'C', 'D', 'E'}, {'F', 'G', 'H', 'I', 'J'}, {'K', 'L', 'M', 'N', 'O'}, {'P', 'Q', 'R', 'S', 'T'}, {'U', 'V', 'W', 'X', 'Y'}, {'Z', '*', '*', '*', '*'}};


        // Display Given matrix
        displayMatrix(arr);


        System.out.print("\nEnter your name: ");
        String name = sc.next();
        int nameLength = name.length();


        // Input rows-number where the character of your name is placed
        int[] len = inputRowsNoCharacter(nameLength);

        //Arrange the row according to the character of name
        char[][] shiftedRow = new char[nameLength][5];
        for (int i = 0; i < nameLength; i++) {
            System.arraycopy(arr[len[i]], 0, shiftedRow[i], 0, 5);
        }

        // Display shiftedRow matrix for the character of name
        System.out.println("Row shifting for name character-wise");
        displayMatrix(shiftedRow);


        // Input row numbers of characters in the name based on current matrix
        int[] len2 = inputRowsNoCharacter(nameLength);

        // Transpose operation =>>1st times
        char[][] transposeSecMatrix = new char[5][nameLength];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < nameLength; j++) {
                transposeSecMatrix[i][j] = shiftedRow[j][i];
            }
        }

        // Display transposed Matrix
        System.out.println(" 1st Transposed Matrix for the name based current Matrix");
        displayMatrix(transposeSecMatrix);

        // Input row numbers of characters in the name based on current matrix
        int[] len3 = inputRowsNoCharacter(nameLength);

        // Transpose operation =>>2nd times
        char[][] transposeSec = new char[nameLength][nameLength];
        for (int i = 0; i < nameLength; i++) {
            System.arraycopy(transposeSecMatrix[len3[i]], 0, transposeSec[i], 0, nameLength);
        }

        // Display transposed Matrix
        System.out.println(colorCYAN+bold+"\n*************Final Transposed Matrix*************"+reset);
        displayMatrix(transposeSec);


        // Getting name from diagonal of Matrix
        StringBuilder diagonalName = new StringBuilder();
        for (int i = 0; i < nameLength; i++) {
            diagonalName.append(transposeSec[i][i]);
        }

        // Given Name equals to Diagonal character concatenated  Name
        System.out.println(colorMAGENTA+"Your Diagonal Name:  "+reset + diagonalName);
    }
}
