package homework_4.task_3;

import homework_4.task_1.Apple;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
       Apple[] newPerson = new Apple[3];
        newPerson[0] = new Apple("Henry",15);
        newPerson[1] = new Apple("Maks", 15);
        newPerson[2] = new Apple("Maks", 15);

        for (int i = 0; i<3; i++){
            for(int j = i + 1; j<3; j++) {
                System.out.println(newPerson[i].show() + " Cравним с  " + newPerson[j].show() + "equals: " +newPerson[i].equals(newPerson[j]));

            }
        }
    }
}
