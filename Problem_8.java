import java.util.*;
public class Problem_8 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

       
        int N = input.nextInt();
        long fact = 1L;
        for(int i=1; i<=N; i++){
            fact *= i;
        }
        System.out.print(fact);
        input.close();

    }
}
