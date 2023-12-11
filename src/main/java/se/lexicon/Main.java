package se.lexicon;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person goran = new Person("Goran","Muminovic","goran@aol.com");
        System.out.println(goran.getSummary());
        Person amra = new Person("Amra", "Piragic","amra@sol.com");
        System.out.println(amra.getSummary());

        TodoItem toDoGoran = new TodoItem("Assignment Part 1","Constructs, Unit test", LocalDate.of(2023,12,11),goran);
        toDoGoran.setDone(true);

        System.out.println(toDoGoran.getSummary());
        System.out.println("isDone " + toDoGoran.isDone());
        //System.out.println(goran.getId());
        //toDoGoran.setCreator(goran);


        //System.out.println(toDoGoran.getCreator());
        System.out.println("overdue " + toDoGoran.isOverdue());
        System.out.println("todo id " + toDoGoran.getId());

        TodoItemTask taskForGoran = new TodoItemTask(toDoGoran,goran);

        //taskForGoran.setAssigned(false);
        System.out.println("is Assigned " + taskForGoran.isAssigned());
        System.out.println(taskForGoran.toString());

    }

}