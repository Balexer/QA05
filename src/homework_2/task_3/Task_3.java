package homework_2.task_3;

public class Task_3 {
    public static void main(String[] args) {
        int ch; // отсюда убираем
        int sum = 1;
        // sum = 1 потому что я не знаю как еденицу в цикл запихнуть
        for (ch=1;ch<256;) {
            ch = ch*2 ;
            sum = ch + sum;
        }
        
        /*
        int sum = 0;
        
        for (int ch=1;ch<256; ch=ch*2) {
        sum +=ch
        }
        
        думаю так получше будет
        */
        System.out.println(sum);
    }
}
