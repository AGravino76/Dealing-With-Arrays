public class ArrayProcessing {

    //initialize fields
    private double fullTotal = 0;
    private int rowTotal = 0;
    private int columnTotal = 0;

    public double getTotal(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                fullTotal += array[i][j];
            }
        }
        return fullTotal;
    }

    public double getAverage(int[][] array){
        double counter = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                fullTotal += array[i][j];
                counter++;
            }
        }
        if(counter > 0){
            return fullTotal/counter;
        }
        else{
            return 0;
        }
    }

    public double getRowTotal(int[][] array, int row){
        for(int i = 0; i < array[row].length; i++){
            rowTotal += array[row][i];
        }
        return rowTotal;
    }

    public double getColumnTotal(int[][] array, int col){
        for(int i = 0; i < array.length; i++){
            columnTotal += array[i][col];
        }
        return columnTotal;
    }

    public double getHighestInRow(int[][] array, int row){
        int highest = array[row][0]; //sometimes the row is all negative so keeping highest as "0" from initialization might be problematic
        for(int i = 0; i < array[row].length; i++){
            if(array[row][i] > highest){
                highest = array[row][i];
            }
        }
        return highest;
    }

    public double getLowestInRow(int[][] array, int row){
        int lowest = array[row][0]; //sometimes the row can be all positive so keeping lowest as "0" can be problematic like the highestInRow
        for(int i = 0; i < array[row].length; i++){
            if(lowest > array[row][i]){
                lowest = array[row][i];
            }
        }
        return lowest;
    }
}
