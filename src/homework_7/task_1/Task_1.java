package homework_7.task_1;

// +
public class Task_1 {
    public static void main(String[] args) {
        String word = "engineering";
        String engine = word.substring(0, word.length() - 5);
        System.out.println(engine);
        String ring = word.substring(7);
        System.out.println(ring);
    }
}
