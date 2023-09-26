package ca.gforcesoftware.gfipetclinic.services.map;

import ca.gforcesoftware.gfipetclinic.model.Pet;
import ca.gforcesoftware.gfipetclinic.services.CrudService;

import java.util.Set;

/**
 * @author gavinhashemi on 2023-09-26
 */
public class PetServiceMap extends  AbstractMapServices<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> fiindAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
