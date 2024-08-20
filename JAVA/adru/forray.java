package adru;

public class forray {
    static int[][] pe = { { 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3 }, { 1, 1, 1, 1, 1 } };
    static int[][] pu = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };

    public static void main(String[] args) {
        recorre();
        System.out.println(pu[1][1]);
    }

    static void recorre() {
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 3; i++) {
                pu[k][i] = pe[k][i];
            }
        }
    }

}