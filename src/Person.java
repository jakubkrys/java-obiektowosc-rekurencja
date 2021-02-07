public class Person {

    String name;
    String surname;
    Person ancestor;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Person ancestor) {
        this.name = name;
        this.surname = surname;
        this.ancestor = ancestor;
    }
}
