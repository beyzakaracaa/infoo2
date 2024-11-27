// Homework 3 Exercise 2

package hw03.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Generische Klasse, kann so mit verschiedenen Typen arbeiten
public class EntityManager<T> {
    private List<T> entities;

    public EntityManager() {
        this.entities = new ArrayList<>();
    }

    // Fügt zur Liste hinzu
    public void addEntity(T entity) {
        entities.add(entity);
    }

    // Sucht mit Spezifizierung durch Interface mit Lamda
    public T findEntity(Predicate<T> criterion) {
        for (int i = 0; i < entities.size(); i++) {
            T entity = entities.get(i);
            if (criterion.test(entity)) {
                return entity;
            }
        }
        return null;
    }

    public List<T> getAllEntities() {
        return entities;
    }
}
