public class UC4 {
    public static void main(String[] args) {

        String[] Line = new String[7];
        Line[0] = String.join("   ","  *****  ","  *****  ","  *****  ","  *****  ");
        Line[1] = String.join("   "," **   ** "," **   ** "," **   ** "," **      ");
        Line[2] = String.join("   ","**     **","**     **"," **   ** "," **      ");
        Line[3] = String.join("   ","**     **","**     **"," ******  ","  *****  ");
        Line[4] = String.join("   ","**     **","**     **"," **      ","      ** ");
        Line[5] = String.join("   "," **   ** "," **   ** "," **      "," **   ** ");
        Line[6] = String.join("   ","  *****  ","  *****  "," **      ","  *****  ");
        for (String line : Line) {
            System.out.println(line);
        }
    }
}
