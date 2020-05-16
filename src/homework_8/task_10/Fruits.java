package homework_8.task_10;

public class Fruits {
    private Integer weight;
    private String name; /абзац
    public Fruits(Integer weight, String name) {
        this.weight = weight;
        this.name = name;

    }

    / toString() в конец класса
    @Override
    public String toString() {
        return "Fruits{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    // hashCode() в конец перед toString() и где equals?
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
