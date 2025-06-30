import java.util.Scanner;

public class Rep06Person1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = s.nextLine();
        System.out.print("Input your age: ");
        int age = s.nextInt();

        Person person = new Person(name, age);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        s.close();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
}
