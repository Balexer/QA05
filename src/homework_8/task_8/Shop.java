package homework_8.task_8;

// старайся в класса-сущностях сразу переопределять методы equals+hashcode
public class Shop {
    private Integer id;
    private String name;

    public Shop(Integer id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
