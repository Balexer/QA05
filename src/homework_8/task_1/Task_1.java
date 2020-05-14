package homework_8.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        String name;
        List<String> inviteList = new ArrayList<>();
        inviteList.add("Vasya");
        inviteList.add("Kolia");
        inviteList.add("Fedia");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите свое имя : ");
        name = scan.next();
        if (inviteList.contains(name) == true) {
            System.out.println("Вы можете пройти");
        } else {
            System.out.println("Вас нет в списках");
        } ;

    }
}
