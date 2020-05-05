package homework_5.task_3;

// внутри класса Catalog должен быть массив домов, а класс с методом мейн в другом месте
public class Catalog {
    public static void main(String[] args) {
        House[] newHouse = new House[3];
        newHouse[0] = new House(3, true, 5);
        newHouse[1] = new House(1, false, 4);
        newHouse[2] = new House(2, true, 3);
        System.out.println("Our houses");
        for (int i = 0; i < newHouse.length; i++) {
            System.out.println(newHouse[i].show());
        }
        Flat[] newFlat = new Flat[4];
        newFlat[0] = new Flat(20, true, 142);
        newFlat[1] = new Flat(12, true, 52);
        newFlat[2] = new Flat(5, false, 33);
        newFlat[3] = new Flat(14, true, 68);
        System.out.println("Our flats");
        for (int j = 0; j < newFlat.length; j++) {
            System.out.println(newFlat[j].show());
        }
    }
}
