package ComplexTask.Task1;

import java.util.*;
import java.util.stream.Collectors;

public class EntityManager <T extends User> {
    /*
Добавление элементов: Метод для добавления объекта в коллекцию. Должен быть потокобезопасным.
Удаление элементов: Метод для удаления объекта из коллекции. Возвращает true, если объект был удалён, и false, если объект не найден в коллекции. Должен быть потокобезопасным.
Получение всех элементов: Метод возвращает копию списка всех элементов, обеспечивая невозможность изменения исходной коллекции через возвращаемый список.
Специализированные методы фильтрации:
Фильтрация по возрасту: Возвращает список пользователей в заданном возрастном диапазоне.
Фильтрация по имени: Возвращает список пользователей, чьи имена соответствуют заданной строке.
Фильтрация по активности: Возвращает список пользователей с заданным статусом активности.
     */
    private Set<T> entities;

    public EntityManager(){
        this.entities = new HashSet<>();
    }

    public synchronized void addEntity(T e){
        entities.add(e);
    }

    public synchronized boolean deleteEntity(T e){
        return entities.remove(e);
    }

    public Set<T> getEntity(){
        return Set.copyOf(entities);
    }

    public Set<T> filteredByAge(int minAge, int maxAge){
        return entities.stream()
                .filter(age -> age.getAge() >= minAge && age.getAge() <= maxAge)
                .collect(Collectors.toSet());
    }

    public Set<T> filteredByName(String names){
        return entities.stream()
                .filter(name -> name.getName().equalsIgnoreCase(names))
                .collect(Collectors.toSet());
    }

    public Set<T> filteredByActive(boolean isActive){
        return entities.stream()
                .filter(status -> status.isActive() == isActive)
                .collect(Collectors.toSet());
    }







}
