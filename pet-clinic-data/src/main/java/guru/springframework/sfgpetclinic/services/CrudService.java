package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Joel Gayle on 20 Jan, 2020
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deletedById(ID id);

}
