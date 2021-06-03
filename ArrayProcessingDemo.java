import java.util.ArrayList;
import java.util.Scanner;
public class ArrayProcessingDemo {
    public static void main(String[] args) {
        //get cheeky with the program
        int bigI = 0;
        int bigJ = 0;
        String modeChoice;
        int rowChoice = 0;
        int columnChoice = 0;
        ArrayProcessing array = new ArrayProcessing();

        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);

        System.out.println("How many rows do you want your array to be?");
        bigI = keyboard1.nextInt(); 

        System.out.println("How many columns do you want your array to be?");
        bigJ = keyboard1.nextInt(); 
                
        //using the scanner info, it creates an array
        int[][] numbers = new int[bigI][bigJ]; //asking for "3" rows would make the system have 3 rows indexed 0 through 2

        //this will ask for each individual value from the user to fill up the array
        for(int i = 0; i < bigI; i++){
            for(int j = 0; j < bigJ; j++){
                System.out.println("Input value for [" + i + "] [" + j + "].");
                numbers[i][j] = keyboard1.nextInt();
            }
        }

        //display
        System.out.print("This is what your array looks like: ");
        for(int i = 0; i < bigI; i++){
            System.out.println();
            for(int j = 0; j < bigJ; j++){
                System.out.print(numbers[i][j] + " ");
            }
        }

        //ask for which method they want to use
        System.out.println("\nWhat would you like to find? (total, average, rowtotal, columntotal, highestinrow, lowestinrow)");
        modeChoice = keyboard2.nextLine();
        if(modeChoice.equalsIgnoreCase("total")){
            System.out.print(array.getTotal(numbers));
        }
        if(modeChoice.equalsIgnoreCase("average")){
            System.out.print(array.getAverage(numbers));
        }
        if(modeChoice.equalsIgnoreCase("rowtotal")){
            System.out.println("What index row do you want to use?");
            rowChoice = keyboard2.nextInt();
            System.out.print(array.getRowTotal(numbers, rowChoice));
        }
        if(modeChoice.equalsIgnoreCase("columntotal")){
            System.out.println("What index column do you want to use?");
            columnChoice = keyboard2.nextInt();
            System.out.print(array.getColumnTotal(numbers, columnChoice));
        }
        if(modeChoice.equalsIgnoreCase("highestinrow")){
            System.out.println("What index row do you want to use?");
            rowChoice = keyboard2.nextInt();
            System.out.print(array.getHighestInRow(numbers, rowChoice));
        }
        if(modeChoice.equalsIgnoreCase("lowestinrow")){
            System.out.println("What index row do you want to use?");
            rowChoice = keyboard2.nextInt();
            System.out.print(array.getLowestInRow(numbers, rowChoice));
        }

    }
}
