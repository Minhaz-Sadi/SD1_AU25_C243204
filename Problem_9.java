import java.util.*;
public class Problem_9 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

       
        int N = input.nextInt();
        long sum = 0L;
        for(int i=1; i<=N; i++){
            sum += i;
        }
        System.out.print(sum);
        input.close();

    }
}
