public class OOPSBannerUC4 {

    public static void main(String[] args) {

        // Banner lines stored in String array
        String[] banner = {
                String.join("  ", "OOOO", "PPPP", "SSSS", "SSSS"),
                String.join("  ", "O  O", "P  P", "S   ", "S   "),
                String.join("  ", "O  O", "PPPP", "SSSS", "SSSS"),
                String.join("  ", "O  O", "P   ", "   S", "   S"),
                String.join("  ", "OOOO", "P   ", "SSSS", "SSSS")
        };

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}