package complex_tasks.task_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T> {
    private List<Task<T>> tasks = new ArrayList<>();

    public List<Task<T>> getTasks() {
        return tasks;
    }

    public void addTask(Task<T> task) {
        boolean exists = tasks.stream()
                .anyMatch(t -> t.getId().equals(task.getId()));

        if (!exists) {
            tasks.add(task);
        } else {
            System.out.println("The task with id=" + task.getId() + "already exists");
        }
    }

    public synchronized void removeTask(T id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }

    public List<Task<T>> filterByStatus(String status) {
        return tasks.stream()
                .filter(task -> task.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public List<Task<T>> filterByPriority(String priority) {
        return tasks.stream()
                .filter(task -> task.getPriority().equals(priority))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortByDate() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
    }
}
