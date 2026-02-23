public class OOPSBannerUC5 {

    public static void main(String[] args) {

        // Array declared and initialized in one statement
        String[] banner = {
                String.join("   ", "OOOO", "PPPP", "SSSS", "SSSS"),
                String.join("   ", "O  O", "P  P", "S   ", "S   "),
                String.join("   ", "O  O", "PPPP", "SSSS", "SSSS"),
                String.join("   ", "O  O", "P   ", "   S", "   S"),
                String.join("   ", "O  O", "P   ", "   S", "   S"),
                String.join("   ", "O  O", "P   ", "S   ", "S   "),
                String.join("   ", "OOOO", "P   ", "SSSS", "SSSS")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}