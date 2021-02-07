public class PersonsRepo {

    int n;
    String name;
    String surname;
    Person[] persons;

    PersonsRepo (int size){
        persons = new Person[size];
    }

    void add(Person person) {
        for (int i = 0; i < persons.length; i++) {
            persons[i] = person;
        }
    }

    void find(String name, String surname) {
        if(name.equals(persons[n].name) == true && surname.equals(persons[n].surname) == true){
            System.out.println("Tak, taka osoba jest członkiem rodziny");
        }
    }
}
