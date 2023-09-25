package ca.gforcesoftware.gfipetclinic.services;

import ca.gforcesoftware.gfipetclinic.model.Owner;
import ca.gforcesoftware.gfipetclinic.model.Pet;

import java.util.Set;

/**
 * @author gavinhashemi on 2023-09-25
 */
public interface PetService {

    Pet findById(long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
