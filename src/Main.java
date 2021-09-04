public class Main {

    public static int sNumber(int[][] arr) {

        int count = 0;
        int rowIndex = 0;
        int columnIndex = arr[0].length - 1;

        while (columnIndex >= 0 && rowIndex < arr.length) {
            if (arr[rowIndex][columnIndex] < 0) {
                count += (columnIndex + 1);
                rowIndex++;
            } else {
                columnIndex--;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[][] a = {
                {-2, -4, -3, 2, 0},
                {-3, -1, 4, 3, 2},
                {-1, 0, 3, 6, 3}
        };
        System.out.println(sNumber(a));
    }
}