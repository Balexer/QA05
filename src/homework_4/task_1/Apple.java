package homework_4.task_1;

import java.util.Objects;

public class Apple {
   private String name;
   private Integer age;
   // я вроде вам еще не показывал константы, но правильно будет использовать final + caps lock
   //private static final String STATIC_BLOCK_MESSAGE = "Hello from static";
   private static String text = "Hello from static";

    public Apple(String name, Integer age) {
        this.name = name;
        this.age = age;
    } // абзац после констуктора
    public Apple () {     // констурктор без аргументов должен идти первым
        this ("Alex", 19);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String show() {
        return "name = " + this.name + "; " + "age = " + this.age + "; ";
    }

    public String showForText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // не забывай использовать {} после if
        if (o == null || getClass() != o.getClass()) return false; // не забывай использовать {} после if
        Apple apple = (Apple) o;
        return Objects.equals(name, apple.name) &&
                Objects.equals(age, apple.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
