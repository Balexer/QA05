package homework_6.task_1;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = {8, 2, 4, 3, 6};
        getArray(array,0, " ", " ");
    }
    public static void getArray(int[] array, int i, String g, String j) {
        if (i < array.length) {
            System.out.println(g + array[i]);
            getArray(array,i+1, g + j, j);
        }
    }
}
