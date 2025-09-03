import java.util.*;

public class Problem_Easy_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String st = input.nextLine();
        String ans = "";
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (Character.isUpperCase(ch)) {
                ans += Character.toLowerCase(ch);
            }
            else ans += Character.toUpperCase(ch);
        }
        System.out.println(ans);
        input.close();

    }
}
