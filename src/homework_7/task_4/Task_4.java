package homework_7.task_4;

public class Task_4 {
    public static void main(String[] args) {
        int j = 0;
        int countWord = 0;
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in add closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        System.out.println(text.contains("alert"));
        Schet("alert", text);
        System.out.println(text.contains("add"));
        Schet("add", text);
        System.out.println(text.contains("good"));
        Schet("good", text);
        System.out.println(text.contains("plan"));
        Schet("plan", text);

    }
    public static void Schet(String Word, String text) {
        int countWord = 0;

        for (int i = 0; i> -1; i++) {
            i = text.indexOf(Word, i);
            if (i == -1) {
                break;
            }

            countWord++;
        }
        System.out.println("Колличество слова " + Word + " в тексте = " + countWord);
    }
}
