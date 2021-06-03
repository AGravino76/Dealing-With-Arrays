import java.util.Scanner;
public class MagicSquareDemo {
    public static void main(String[] args) {
        //the usual please, bartender
        Scanner keyboard = new Scanner(System.in);
        MagicSquare square = new MagicSquare();
        Integer[][] numbers = new Integer[3][3];

        //asking the user for inputs
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Input value for [" + i + "] [" + j + "].");
                numbers[i][j] = keyboard.nextInt();
            }
        }

        //display
        System.out.print("This is what your array looks like: ");
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                System.out.print(numbers[i][j] + " ");
            }
        }

        //run the method
        if(square.check(numbers)){
            System.out.println("\nThe array is a Magic Square!");
        }
        else{
            System.out.println("\nThe array is not a Magic Square.");
        }
    }
}
