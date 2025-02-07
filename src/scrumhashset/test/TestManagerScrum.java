package scrumhashset.test;

import scrumhashset.models.ManagerScrum;
import scrumhashset.models.Task;

public class TestManagerScrum {
    public static void main(String[] args) {
        ManagerScrum managerScrum = new ManagerScrum();

        // Add new Tasks
        var task1 = new Task("TASK1","NEW TASK 1");
        var task2 = new Task("TASK2","NEW TASK 2");
        var task3 = new Task("TASK3","NEW TASK 3");
        var task4 = new Task("TASK4","NEW TASK 4");
        var task5 = new Task("TASK5","NEW TASK 5");
        managerScrum.addTask(task1);
        managerScrum.addTask(task2);
        managerScrum.addTask(task3);
        managerScrum.addTask(task4);
        managerScrum.addTask(task5);

        //Tasks To Be Done to Doing
        managerScrum.updateToBeDoneToDoing(task1);
        managerScrum.updateToBeDoneToDoing(task1);
        managerScrum.updateToBeDoneToDoing(task2);

        //Tasks Doing to Done

        managerScrum.updateDoingToDone(task1);
        managerScrum.updateDoingToDone(task1);
        managerScrum.updateDoingToDone(task5);

        //Show Tasks
        managerScrum.showAllTasksProcess();

    }
}
