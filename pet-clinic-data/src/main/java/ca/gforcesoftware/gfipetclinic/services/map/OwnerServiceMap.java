package ca.gforcesoftware.gfipetclinic.services.map;

import ca.gforcesoftware.gfipetclinic.model.Owner;
import ca.gforcesoftware.gfipetclinic.services.CrudService;

import java.util.Set;

/**
 * @author gavinhashemi on 2023-09-26
 */
public class OwnerServiceMap extends AbstractMapServices<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> fiindAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save( Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
