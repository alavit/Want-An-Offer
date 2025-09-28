package complex_tasks.task_1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> {
    CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    public void add(T entity) {
        entities.add(entity);
    }

    public boolean remove(T entity) {
        return entities.remove(entity);
    }

    public List<T> getAll() {
        return List.copyOf(entities);
    }

    public List<T> filterByAge(int minAge, int maxAge) {
        return entities.stream().filter(entity -> entity.getAge() >= minAge && entity.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    public List<T> filterByName(String name) {
        return entities.stream().filter(entity -> entity.getName().equals(name))
                .collect(Collectors.toList());
    }

    public List<T> filterByIsActive(boolean isActive) {
        return entities.stream().filter(entity -> entity.isActive() == isActive)
                .collect(Collectors.toList());
    }
}
