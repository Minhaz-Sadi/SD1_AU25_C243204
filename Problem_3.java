import java.util.*;
public class Problem_3 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.print("Even");
        }
        else System.out.print("Odd");

        input.close();

    }
}
