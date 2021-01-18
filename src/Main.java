public class Main {
    public static void main(String[] args) {
        int[][][] arr = new int[5][3][12];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] += k;

                }
                break;
            }
        }
    }
}
