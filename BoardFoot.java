import java.util.Scanner;

/**
 * Program that calculates the missing length of wood required
 * to make exactly one board foot (144 cubic inches),
 * given width and height.
 *
 * @author  Jack Turcotte
 * @version 1.0
 * @since   2025-09-30
 */
public final class BoardFoot {

    /**
     * Constant for 1 board foot in cubic inches.
    */
    private static final double BOARD_FOOT = 144.0;

    /**
     * Private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility Class
     */
    private BoardFoot() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Calculates the missing length of wood.
     *
     * @param width width of the board in inches
     * @param height height of the board in inches
     * @return length required to equal one board foot
     */
    public static double calculateBoardFoot(final double width,
            final double height) {
        // Length = Volume / (Width * Height)
        return BOARD_FOOT / (width * height);
    }

    /**
     * Runs the BoardFoot program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);

        try {
            // Ask user for width
            System.out.print("Enter the width of the board (in inches): ");
            final double width = Double.parseDouble(inputScanner.nextLine());

            // Ask user for height
            System.out.print("Enter the height of the board (in inches): ");
            final double height = Double.parseDouble(inputScanner.nextLine());

            if (width > 0 && height > 0) {
                final double length = calculateBoardFoot(width, height);

                // Display the result
                System.out.println("To make one board foot, "
                    + "the board must be " + length + " inches long.");
            } else {
                System.out.println("Width and height must be greater than 0.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        }

        // Close scanner
        inputScanner.close();
    }
}
