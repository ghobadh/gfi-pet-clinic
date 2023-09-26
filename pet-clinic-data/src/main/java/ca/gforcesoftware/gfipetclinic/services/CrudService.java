package ca.gforcesoftware.gfipetclinic.services;

import java.util.Set;

/**
 * @author gavinhashemi on 2023-09-26
 */
public interface CrudService <T,ID>{

    Set<T> fiindAll();

    T findById(ID id);

    T save (T object);

    void delete (T object);

    void deleteById (ID id);
}
