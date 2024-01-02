package se.lexicon;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person goran = new Person("Goran","Muminovic","goran@aol.com");
        System.out.println(goran.toString());
        Person amra = new Person("Amra", "Piragic","amra@sol.com");
        System.out.println(amra.toString());
        TodoItem toDoGoran = new TodoItem("Assignment Part 1","Constructs, Unit test", LocalDate.of(2023,12,11),goran);
        toDoGoran.setDone(true);
        TodoItem toDoAmra = new TodoItem("Something", "Do", LocalDate.of(2024,12,4),goran);
        TodoItem forGoran = new TodoItem("New","Task",LocalDate.of(2024,6,6),goran);

        System.out.println(toDoGoran.getSummary());
        
        //System.out.println(goran.getId());
        //toDoGoran.setCreator(goran);


        //System.out.println(toDoGoran.getCreator());
        AppUser me = new AppUser("gogo","pass",AppRole.ROLE_APP_ADMIN);

        System.out.println(me.getRole());
        System.out.println(goran.hashCode());


        System.out.println("overdue " + toDoGoran.isOverdue());
        System.out.println("toDoGoran id " + toDoGoran.getId());
        System.out.println("toDoAmra id " + toDoAmra.getId());


        TodoItemTask taskForGoran = new TodoItemTask(toDoGoran,goran);
        TodoItemTask newTaskGoran = new TodoItemTask(forGoran,goran);
        System.out.println("taskForGoran id " + taskForGoran.getId());
        System.out.println("newTaskGoran id " + newTaskGoran.getId());

        System.out.println("goran id " + goran.getId());
        System.out.println("amra id " + amra.getId());

        //taskForGoran.setAssigned(false);
        System.out.println("is Assigned " + taskForGoran.isAssigned());
        System.out.println(taskForGoran.toString());

    }

}