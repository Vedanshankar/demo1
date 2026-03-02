public class UC6 {

    // Static method to generate O pattern
    public static String[] getO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static method to generate P pattern
    public static String[] getP() {
        return new String[] {
            "*****  ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      "
        };
    }

    // Static method to generate S pattern
    public static String[] getS() {
        return new String[] {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        // Print OOPS Banner
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}