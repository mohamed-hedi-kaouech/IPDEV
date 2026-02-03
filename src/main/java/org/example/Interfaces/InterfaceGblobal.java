package example.Interfaces;

import org.example.Model.Personne;

import java.util.List;

public interface InterfaceGblobal<T> {
    void add(T t);
    void add2(T t);
    void delete(T t);
    void update(T t);
    List<Personne> getAll();

}
