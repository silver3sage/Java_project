public class Nigeria {
    public static void main(String[] args) {
        int rows = 7; // Adjust for better visual ratio
        int cols = 15; // Must be a multiple of 3

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j >= cols / 3 && j < 2 * cols / 3) {
                    System.out.print(" "); // White stripe (using space)
                } else {
                    System.out.print("*"); // Green stripe
                }
            }
            System.out.println();
        }
    }
}