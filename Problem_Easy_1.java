import java.util.*;

public class Problem_Easy_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String st = input.nextLine();

        String rev = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            rev += st.charAt(i);
        }
        // System.out.println(st);
        // System.out.println(rev);
        int f = 0;
        for (int i = st.length() - 1; i >= 0; i--) {
            if (st.charAt(i) != rev.charAt(i)) {
                f = 1;
                break;
            }
        }
        if (f == 0)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        input.close();

    }
}
