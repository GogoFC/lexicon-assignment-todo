package se.lexicon;

import se.lexicon.sequencers.TodoItemTaskIdSequencer;

import java.util.StringJoiner;

public class TodoItemTask {

    private int id;

    private boolean assigned;

    private TodoItem todoItem;

    private Person assignee;


    public TodoItemTask(TodoItem todoItem, Person assignee) {
        //this.id = id;
        //this.assigned = assigned;
        //this.todoItem = todoItem;
        //this.assignee = assignee;
        setTodoItem(todoItem);
        setAssignee(assignee);
        setId(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TodoItemTask{");
        sb.append("id=").append(id);
        sb.append(", assigned=").append(assigned);
        sb.append(", todoItem=").append(todoItem.getTitle());
        sb.append(", assignee=").append(assignee.getFirstName());
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        //this.id = IdGenerator.generateId();
        this.id = TodoItemTaskIdSequencer.nextId();
    }

    public boolean isAssigned() {
        if (assignee != null) this.assigned = true;
        // same as above
        // if (assignee != null) assigned = true;
        // Below doesn't work
        //if (assignee != null) setAssigned(true);
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        //if (this.assignee != null) setAssigned(true);
        //if (assignee != null) this.assigned = true;
        //this.assigned = assigned;

    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }
}
