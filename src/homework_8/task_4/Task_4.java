package homework_8.task_4;

import java.util.ArrayList;
import java.util.List;


public class Task_4 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(2);
        System.out.println(integers);
        
        List<Integer> integersNew = new ArrayList<>();
        integersNew.add(1);
        integersNew.add(1);
        integersNew.add(3);
        integersNew.add(3);
        System.out.println(integersNew);
        
        integers.retainAll(integersNew);
       
        System.out.println(integers);
}}
