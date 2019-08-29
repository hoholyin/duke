/**
 * Todo class
 */
public class Todo extends Task {

    /**
     * Constructor for Todo Object
     * @param name task
     */
    public Todo(String name) {
        super(name);
    }

    /**
     * Cosntructor for Todo object when loading from history
     * @param name name of task
     * @param completed indicates if task is completed
     */
    public Todo (String name, boolean completed) {
        super(name, completed);
    }

    /**
     * Returns string representation of Todo object
     * @return String representation of Todo object
     */
    @Override
    public String toString() {
        String result = "[T][";
        result = this.completed ? result + "\u2713" + "]" : result + "\u2718" + "]";
        result += " " + this.name;
        return result;
    }
}
