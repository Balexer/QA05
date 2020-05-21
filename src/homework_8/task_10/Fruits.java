package homework_8.task_10;

import java.math.BigDecimal;

public class Fruits {
    private BigDecimal weight;
    private String name;

    public Fruits(BigDecimal weight, String name) {
        this.weight = weight;
        this.name = name;

    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
