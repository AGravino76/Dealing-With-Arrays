import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class MagicSquare {

    private Integer[] arrayOfNumbers = {1,2,3,4,5,6,7,8,9};
    List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(arrayOfNumbers));
    List<Integer> incomingList = new ArrayList<>();

    private boolean containsAll;
    private boolean rows15;
    private boolean columns15;
    private boolean diagonals15;

    public boolean check(Integer[][] array){
        //this magic square can only be 3 rows and 3 columns
        //numbers 1-9 have to be included for it to work
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                incomingList.add(array[i][j]);
            }
        }
        for(int i = 0; i < 9; i++){
            if(listOfNumbers.contains(incomingList.get(i))){ //the new list has to make sure it has the original 1-9
                containsAll = true;
            }
        }

        //checks to see if each row = 15
        //this technically will always work since we only allow 3 by 3's so BOOM BABY
        int row1 = array[0][0] + array[0][1] + array[0][2];
        int row2 = array[1][0] + array[1][1] + array[1][2];
        int row3 = array[2][0] + array[2][1] + array[2][2]; 
        if(row1 == 15 && row2 == 15 && row3 == 15){
            rows15 = true;
        }

        //same thing where each column = 15
        int column1 = array[0][0] + array[1][0] + array[2][0];
        int column2 = array[0][1] + array[1][1] + array[2][1];
        int column3 = array[0][2] + array[1][2] + array[2][2];
        if(column1 == 15 && column2 == 15 && column3 == 15){
            columns15 = true;
        }

        //[0][0] [1][1] [2][2] for \ and then [0][2] [1][1] [2][0] for /
        int diagonal1 = array[0][0] + array[1][1] + array[2][2];
        int diagonal2 = array[0][2] + array[1][1] + array[2][0];
        if(diagonal1 == 15 && diagonal2 == 15){
            diagonals15 = true;
        }

        //evaluate everything
        return containsAll && rows15 && columns15 && diagonals15;
    }
}
