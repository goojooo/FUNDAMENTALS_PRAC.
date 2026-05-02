public class Person {
    private String name;

    public String getName() {
        return name; // getter
    }

    public void setName(String name) {
        this.name = name; // setter
    }

    // Encapsulation
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Nayan"); // controlled access
        System.out.println(p.getName());
    }
}
