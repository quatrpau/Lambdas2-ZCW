package javaReal;

import java.util.List;

public class AnonClass {
    public CheckPerson gender = new CheckPerson() {
        @Override
        public boolean test(Person p) {
            return p.gender != Person.Sex.MALE;
        }
    };
    public void printPerson(List<Person> roster){
        for(Person p: roster){
            if(gender.test(p)){
                p.printPerson();
            }
        }
    }
}
