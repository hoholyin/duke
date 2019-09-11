package duke.task;

/**
 * Task class.
 */
public abstract class Task {
    protected boolean completed;
    protected String name;

    /**
     * Constructor for Task object.
     * @param n name of task
     */
    public Task(String n) {
        this.name = n;
        completed = false;
    }
  
    /**
     * Constructor for Task object when loading from history.
     * @param n name of task
     * @param completed indicates if task is completed
     */
    public Task(String n, boolean completed) {
        this.name = n;
        this.completed = completed;
    }

    /**
     * Checks if a task is completed.
     * @return true if task is completed, false otherwise
     */
    public boolean isCompleted() {
        return this.completed;
    }

    /**
     * Returns name of task.
     * @return name of task
     */
    public String getName() {
        return this.name;
    }

    /**
     * Completes the task.
     */
    public boolean complete() {
        if (this.completed) {
            return false;
        }
        this.completed = true;
        return true;
    }

    public abstract String toString();
}
