
class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 101;
        s1.name = "Pavan";

        s2.id = 102;
        s2.name = "Rahul";

        System.out.println("First Student:");
        s1.display();

        System.out.println("Second Student:");
        s2.display();
    }
}
