import java.util.*;

public class Problem_Easy_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String st = input.nextLine();

        int vow = 0;
        for (int i = st.length() - 1; i >= 0; i--) {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i'
                    || st.charAt(i) == 'o' || st.charAt(i) == 'u' ||
                    st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I'
                    || st.charAt(i) == 'O' || st.charAt(i) == 'U') {
                vow++;
            }
        }
        System.out.println("vowel: " + vow);
        System.out.println("Consonant: " + (st.length() - vow));
        input.close();

    }
}
