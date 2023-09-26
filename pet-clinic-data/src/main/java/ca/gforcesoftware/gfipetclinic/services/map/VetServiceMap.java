package ca.gforcesoftware.gfipetclinic.services.map;

import ca.gforcesoftware.gfipetclinic.model.Vet;
import ca.gforcesoftware.gfipetclinic.services.CrudService;

import java.util.Set;

/**
 * @author gavinhashemi on 2023-09-26
 */
public class VetServiceMap extends AbstractMapServices<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> fiindAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
