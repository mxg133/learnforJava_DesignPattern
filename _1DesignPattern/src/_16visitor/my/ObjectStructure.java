package _16visitor.my;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 孟享广
 * @date 2020-08-13 2:47 下午
 * @description
 */
public class ObjectStructure {
    private List<Person> persons = new LinkedList<>();

    public void attach(Person person){
        persons.add(person);
    }

    public void detach(Person person){
        persons.remove(person);
    }

    public void display(Action action){
        for (Person person : persons){
            person.accpect(action);
        }
    }
}
