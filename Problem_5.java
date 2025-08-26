import java.util.*;
public class Problem_5 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = input.nextDouble();
        input.nextLine();
        System.out.print("Choose a char(+, -, *, /): ");
        String st = input.nextLine();

        double ans = 0;
        if(st.equals("+")){
            ans = num1 + num2;
        }
        else if(st.equals("-")){
            ans = num1 - num2;
        }
        else if(st.equals("*")){
            ans = num1 * num2;
        }
        else if(st.equals("/")){
            if(num2!=0){
                ans = num1 / num2;
            }
            else{
                System.out.print("Invalid");
            }
        }
        else{
            System.out.print("Invalid");
        }
        //System.out.print(ans);
        System.out.printf("%.4f", ans);

        input.close();

    }
}
