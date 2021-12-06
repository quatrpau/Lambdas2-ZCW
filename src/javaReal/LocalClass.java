package javaReal;

import java.util.List;

public class LocalClass implements CheckPerson {
    @Override
    public boolean test(Person p) {
        return p.getAge() > 2;
    }
    public void printPerson(List<Person> roster) {
        for (Person p : roster) {
            if (test(p)) {
                p.printPerson();
            }
        }
    }
}
