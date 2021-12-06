package javaReal;

import java.util.List;

public class LambdaClass {
    public void printPerson(List<Person> people, CheckPerson tester){
        for(Person p: people){
            if(tester.test(p)){
                p.printPerson();
            }
        }
    }
}
