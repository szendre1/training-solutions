package interfaces.simplethread;

import java.util.List;

public class SimpleThread implements Runnable{
    private List<String> tasks;

    public SimpleThread(List<String> task) {
        this.tasks = task;
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep(){
        if (tasks != null && !tasks.isEmpty()) {
            tasks.remove(tasks.size() - 1);
        }
        return tasks.isEmpty();
    }

    @Override
    public void run() {
        while(!tasks.isEmpty()) {
            nextStep();
        }

    }
}
