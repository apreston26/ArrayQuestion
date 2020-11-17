public class Array {


    public static void main(String[] args) {
        int rows = 30;
        int columns = 20;
        int[][] myArray = new int[rows][columns];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j< myArray[i].length; j++) {
                myArray[i][j] = (int) (Math.random() * 99) + 1;
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
