public class Main {
    public static void main(String[] args) {
      Person Alex = new Person();
      Alex.displayInfo();

        Person John = new Person("John");
        John.displayInfo();

        Person Nick = new Person("Nick" , 38);
        Nick.displayInfo();


     

    }
}

class Person {
    String name;
    int age;

    Person () {
        name = "Alex";
        age = 54;
    }
    Person (String n) {
        name = n;
        age = 32;
    }
    Person (String n, int a) {
        name = n;
        age = a;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n" , name, age);

    }
}