package se.lexicon.sequencers;

public class PersonIdSequencer {

    public static int currentId;

    public static int nextId(){
        return ++currentId;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        PersonIdSequencer.currentId = currentId;
    }
}
