package javaTest;

import org.junit.Before;
import org.junit.Test;

import javaReal.AnonClass;
import javaReal.LambdaClass;
import javaReal.LocalClass;
import javaReal.Person;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExecutionTester{
    private Person a;
    private Person b;
    private Person c;
    private List<Person> people;
    @Before
    public void setUp(){
        a = new Person("a",LocalDate.of(1,1,1), Person.Sex.MALE,"A");
        b = new Person("b",LocalDate.of(1998,2,18), Person.Sex.FEMALE,"B");
        c = new Person("c",LocalDate.of(1234,5,6), Person.Sex.MALE,"C");
        people = new ArrayList<>(Arrays.asList(a,b,c));
    }
    @Test
    public void localClassTest(){
        new LocalClass().printPerson(people);
    }
    @Test
    public void anonClassTest(){
        new AnonClass().printPerson(people);
    }
    @Test
    public void lambdaExpressionTest(){
        new LambdaClass().printPerson(people, q->q.getEmailAddress().equals("A"));
    }

}