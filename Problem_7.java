import java.util.*;
public class Problem_7 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

       
        long N = input.nextLong();

        for(int i=1; i<=10; i++){
            System.out.println(N+" * "+i+" = "+(N*i));
        }

        input.close();

    }
}
