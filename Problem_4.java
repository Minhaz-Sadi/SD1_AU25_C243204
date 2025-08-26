import java.util.*;
public class Problem_4 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int temp = Math.max(num1, num2);
        int ans = Math.max(temp, num3);
        System.out.print("Max: "+ans);

        input.close();

    }
}
