public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int rowNumber = 0; rowNumber < number; rowNumber++) {
            for (int columnNumber = 0; columnNumber < number; columnNumber++) {
                if (rowNumber == 0 || rowNumber == number - 1 || columnNumber == 0 || columnNumber == number - 1)
                    System.out.print("*");
                else if (rowNumber == columnNumber || number - rowNumber == columnNumber + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
