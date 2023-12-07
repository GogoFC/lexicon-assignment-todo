package se.lexicon;

import java.time.LocalDate;
import java.util.StringJoiner;

public class TodoItem {

    private int id;

    private String title;

    private String taskDescription;

    private LocalDate deadLine;
    // Changing LocalDate to String for now.
    private boolean done;

    private Person creator;

    public TodoItem(String title, String taskDescription, LocalDate deadLine, Person creator) {
        setTitle(title);
        setTaskDescription(taskDescription);
        //DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/M/d");
        //setDeadLine(DateTimeFormatter.ofPattern.String.valueOf(deadLine));
        setDeadLine(deadLine);
        setCreator(creator);
        //At first this ran without Person creator at the end. Then creator was null. Then below .getFirstName() wouldn't work because creator was null.
    }

    public String getSummary() {
        return new StringJoiner(", ", TodoItem.class.getSimpleName() + " [", "]")
                .add("id=" + id)
                .add("title='" + title + "'")
                .add("taskDescription='" + taskDescription + "'")
                .add("deadLine='" + deadLine + "'")
                .add("done=" + done)
                .add("creator=" + creator.getFirstName()) // added .getFirstName() otherwise it was null.
                .toString();
    }
/*
    public String getCreator() {
        final StringBuffer sb = new StringBuffer("TodoItem{");
        sb.append("creator=").append(creator.getFirstName());
        sb.append('}');
        return sb.toString();
    }
*/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        //DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/M/d");
        //setDeadLine(DateTimeFormatter.ofPattern.String.valueOf(deadLine));
        //this.deadLine = DateTimeFormatter.ofPattern("yyyy/M/d").parse(deadLine);
        this.deadLine = deadLine;
    }

    public String getCreator() {
        //return creator;
        return creator.getFirstName();
        // Changed Getter from Person to String and added .getFirstName() to return a String value and not a pointer value.
    }

    public void setCreator(Person creator) {
        //this.creator = this.id;
        this.creator = creator;
    }

}
