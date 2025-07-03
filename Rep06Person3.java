import java.util.Scanner;

public class Rep06Person3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number for how many runs: ");
        int count = Integer.parseInt(s.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.print("Input your name: ");
            String name = s.nextLine();

            System.out.print("Input your age: ");
            int age = Integer.parseInt(s.nextLine());

            Person3 person = new Person3(name, age);
            System.out.println(person);
        }

        s.close();
    }
}

class Person3 {
    private String name;
    private int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getAgeCategory() {
        if (age >= 0 && age <= 3) {
            return "Toddler";
        } else if (age >= 4 && age <= 6) {
            return "Preschooler";
        } else if (age >= 7 && age <= 12) {
            return "Adolescent";
        } else if (age >= 13 && age <= 17) {
            return "Teenager";
        } else {
            return "Adult";
        }
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Age Category: " + getAgeCategory() + "\n";
    }
}
