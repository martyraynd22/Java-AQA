package ComplexTasks.Task1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> {
    private final CopyOnWriteArrayList<T> entities;

    public EntityManager() {
        this.entities = new CopyOnWriteArrayList<>();
    }

    public synchronized void addEntity(T entity) {
        if (entity == null) {
            throw new IllegalArgumentException("Entity не может быть null");
        }
        if (!this.entities.contains(entity)) {
            this.entities.add(entity);
        }
    }

    public synchronized boolean removeEntity(T entity) {
        if (entity == null) {
            throw new IllegalArgumentException("Entity не может быть null");
        }
        if (this.entities.contains(entity)) {
            return this.entities.remove(entity);
        }
        return false;
    }

    public List<T> getAllEntities() {
        return List.copyOf(entities);
    }

    public List<T> filterByAge(int age1, int age2) {
        return this.entities.stream()
                .filter(s -> s.getAge() >= age1 && s.getAge() <= age2)
                .collect(Collectors.toUnmodifiableList());
    }

    public List<T> filterByName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Имя не можеть быть null");
        }
        return this.entities.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .toList();
    }

    public List<T> filterByActive(boolean isActive) {
        return this.entities.stream()
                .filter(s -> s.isActive() == isActive)
                .toList();
    }


}
