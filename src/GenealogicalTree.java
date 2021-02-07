import java.util.Scanner;

public class GenealogicalTree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        String janowczyk = ("Janowczyk");
        String krol = ("Król");
        String nowak = ("Nowak");
        String kowalska = ("Kowalska");
        String marek = ("Marek");
        String jurek = ("Jurek");
        String kasia = ("Kasia");
        String maja = ("Maja");
        String stefan = ("Stefan");
        String andrzej = ("Andrzej");
        String darek = ("Darek");
        String jozef = ("Józef");
        String teofila = ("Teofila");
        String anna = ("Anna");
        String kazimierz = ("Kazimierz");

        PersonsRepo personsRepo = new PersonsRepo(14);

        Person p1 = new Person(marek, janowczyk);
        Person p2 = new Person(jurek, janowczyk, p1);
        Person p3 = new Person(kasia, janowczyk, p1);
        Person p4 = new Person(kasia, nowak, p1);
        Person p5 = new Person(maja, krol, p2);
        Person p6 = new Person(stefan, janowczyk, p2);
        Person p7 = new Person(andrzej, nowak, p4);
        Person p8 = new Person(darek, krol, p5);
        Person p9 = new Person(jozef, krol, p5);
        Person p10 = new Person(teofila, krol, p5);
        Person p11 = new Person(marek, nowak, p7);
        Person p12 = new Person(anna, kowalska, p7);
        Person p13 = new Person(kazimierz, krol, p8);
        Person p14 = new Person(maja, nowak, p11);

        personsRepo.add(p1);
        personsRepo.add(p2);
        personsRepo.add(p3);
        personsRepo.add(p4);
        personsRepo.add(p5);
        personsRepo.add(p6);
        personsRepo.add(p7);
        personsRepo.add(p8);
        personsRepo.add(p9);
        personsRepo.add(p10);
        personsRepo.add(p11);
        personsRepo.add(p12);
        personsRepo.add(p13);
        personsRepo.add(p14);


        System.out.println("Podaj imię:");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String surname = scanner.nextLine();

        personsRepo.find(name, surname);



    }
}
