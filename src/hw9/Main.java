package hw9;

import com.sun.glass.ui.Size;

public class Main {
    static int SIZE = 4;
    public static void main(String[] args) {

        String[][] arr = {
                {"123", "254", "234", "987"},
                {"123", "254", "224", "987"},
                {"123", "254", "234", "987"},
                {"123", "254", "234", "987"},

        };


        try {
            System.out.println(sum(arr));
        } catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e) {
            e.printStackTrace();

            System.out.println(e.getRow() + "     " + e.getCol());
            System.out.println(arr[e.getRow()][e.getCol()]);
        }
        System.out.println("END");
    }
    static int sum (String[][]arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != SIZE) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i + "    " + j, i, i);
                }

            }

        }
        return sum;
    }
}