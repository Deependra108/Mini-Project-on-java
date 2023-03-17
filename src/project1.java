// Find Random number  in java .
// This is my first mini project and I'm feel so happy to make It.
import java.util.Scanner;
public class project1 {
    public static void main( String[] args) {
        int userNumber = 0;
        int myNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Guess my number(1-100):");
            userNumber = sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("WOOHOO .. CORRECT NUMBER!!!!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your number is too large");
            }
            else {
                System.out.println("Your number is too small");
            }
        }while(userNumber>=0);
        System.out.println("My number was : "+myNumber);


    }
}





























