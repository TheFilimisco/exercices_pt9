package scrumhashset.models;

import java.util.HashSet;

public class ManagerScrum {
    private HashSet<Task> tasksToBeDone;
    private HashSet<Task> tasksDoing;
    private HashSet<Task> tasksDone;

    public ManagerScrum(HashSet<Task> tasksToBeDoing, HashSet<Task> tasksDoing, HashSet<Task> tasksDone) {
        this.tasksToBeDone = tasksToBeDoing;
        this.tasksDoing = tasksDoing;
        this.tasksDone = tasksDone;
    }

    public ManagerScrum() {
        tasksToBeDone = new HashSet<>();
        tasksDoing = new HashSet<>();
        tasksDone = new HashSet<>();
    }

    public HashSet<Task> getTasksToBeDone() {
        return tasksToBeDone;
    }

    public void setTasksToBeDone(HashSet<Task> tasksToBeDone) {
        this.tasksToBeDone = tasksToBeDone;
    }

    public HashSet<Task> getTasksDoing() {
        return tasksDoing;
    }

    public void setTasksDoing(HashSet<Task> tasksDoing) {
        this.tasksDoing = tasksDoing;
    }

    public HashSet<Task> getTasksDone() {
        return tasksDone;
    }

    public void setTasksDone(HashSet<Task> tasksDone) {
        this.tasksDone = tasksDone;
    }


    public boolean addTask(Task task){
        if (tasksToBeDone.contains(task)){
            System.out.println("This task exist: " + task.getTitle());
            return false;
        }
        tasksToBeDone.add(task);
        System.out.println("Task to be Do: " + task.getTitle());
        return true;
    }

    public boolean updateToBeDoneToDoing(Task task){
        if (tasksToBeDone.contains(task)){
            System.out.println("Changing to Doing: " + task.getTitle());
            tasksToBeDone.remove(task);
            tasksDoing.add(task);
            return true;
        }
        return false;
    }

    public boolean updateDoingToDone(Task task){
        if (tasksDoing.contains(task)){
            System.out.println("Changing to Done: " + task.getTitle());
            tasksDoing.remove(task);
            tasksDone.add(task);
            return true;
        }
        return false;
    }

    public void showAllTasksProcess(){
        System.out.println("=============tasksToBeDone===========");
        tasksToBeDone.forEach(System.out::println);
        System.out.println("=============tasksDoing===========");
        tasksDoing.forEach(System.out::println);
        System.out.println("=============tasksDone===========");
        tasksDone.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "ManagerScrum{" +
                "tasksToBeDone=" + tasksToBeDone +
                ", tasksDoing=" + tasksDoing +
                ", tasksDone=" + tasksDone +
                '}';
    }
}
