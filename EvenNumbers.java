import java.util.*;
public class EvenNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        //Taking input from the users
        int num = sc.nextInt();

        //Running the loop throughout the given numbers & identifying even numbers
        for (int i=1;i<=num;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
