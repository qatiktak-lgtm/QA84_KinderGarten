import java.util.Objects;

public class Child implements Comparable<Child>{
    private String name;
    private int id;
    private double age;
    private String notes;

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", notes='" + notes + '\'' +
                '}';
    }

    public Child(String name, int id, double age, String notes) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int compareTo(Child other) {
        int res = name.compareToIgnoreCase(other.name);
        if (res == 0)
            res = Integer.compare(id, other.id);
        return res;
    }
    // containsKey - не работает без  equals? поэтому генерируем его

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return id == child.id;
    }

}
