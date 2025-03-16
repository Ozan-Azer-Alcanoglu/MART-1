package common.repositories;

import java.util.List;

public class RepositoryBase <T extends Identifiable>{
    List<T> lists;
    public RepositoryBase(List<T> lists) {
        this.lists = lists;
    }


    public void add(T object) {
        lists.add(object);
    }


    public void delete(T object) {
        lists.remove(object);
    }


    public T getById(int id) {
        return lists.stream()
                .filter(x -> x.getId() == id)
                .findFirst().orElse(null);
    }

    public List<T> getAll() {
        return lists;
    }

}
