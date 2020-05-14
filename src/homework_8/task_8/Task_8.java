package homework_8.task_8;

import java.util.HashSet;
import java.util.Set;

public class Task_8 {
    public static void main(String[] args) {
        Set<Shop> shops = new HashSet<>();
        Shop shop_1 = new Shop(12, "Amazon");
        Shop shop_2 = new Shop(12, "Amazon");
        Shop shop_3 = new Shop(12, "Amazon");
        shops.add(shop_1);
        shops.add(shop_2);
        shops.add(shop_3);

        System.out.println(shops);
    }
}
