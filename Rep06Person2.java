import java.util.Scanner;

public class Rep06Person2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String firstName = s.nextLine();
        System.out.print("Input your last name: ");
        String lastName = s.nextLine();
        System.out.print("Input your age: ");
        int age = Integer.parseInt(s.nextLine());

        Person2 person = new Person2();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
   
        System.out.println("\n[Create and display Toddler, Preschooler, Adolescent, and Teenager]\n");
        System.out.println(Person2.createToddler());
        System.out.println(Person2.createPreschooler());
        System.out.println(Person2.createAdolescent());
        System.out.println(Person2.createTeenager());
        s.close();
    }
}

class Person2 {
	private String name;
    private int age;
	
	public void setFirstName(String firstName) {
        if (this.name == null || this.name.trim().isEmpty()) {
            this.name = firstName;
        } else {
            this.name = firstName + " " + getLastName();
        }
    }

    public void setLastName(String lastName) {
        if (this.name == null || this.name.trim().isEmpty()) {
            this.name = lastName;
        } else {
            this.name = getFirstName() + " " + lastName;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getFirstName() {
        if (this.name != null && this.name.contains(" ")) {
            return this.name.split(" ")[0];
        }
        return this.name;
    }

    public String getLastName() {
        if (this.name != null && this.name.contains(" ")) {
            return this.name.split(" ")[1];
        }
        return "";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public static Person2 createToddler() {
        Person2 p = new Person2();
        p.name = "A toddler";
        p.age = 2;
        return p;
    }

    public static Person2 createPreschooler() {
        Person2 p = new Person2();
        p.name = "A preschooler";
        p.age = 5;
        return p;
    }

    public static Person2 createAdolescent() {
        Person2 p = new Person2();
        p.name = "An adolescent";
        p.age = 9;
        return p;
    }

    public static Person2 createTeenager() {
        Person2 p = new Person2();
        p.name = "A teenager";
        p.age = 15;
        return p;
    }
    public String toString() {
        return  name + ", Age is " + age;
    }
}
