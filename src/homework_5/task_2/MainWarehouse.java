package homework_5.task_2;

import java.util.Arrays;

public class MainWarehouse {
    public static void main(String[] args) {
        Integer[] anotherArray = {1, 2, 3};
        Warehouse warehouse = new Warehouse(anotherArray);

        anotherArray[0] = 666; //проверочка
        System.out.println(warehouse);
        warehouse.next();
        Integer[] test = warehouse.getArray();
        /* а теперь след строкой
        test[0] = 333;
        проверяй
        */
        System.out.println(Arrays.toString(test));
    }
}
