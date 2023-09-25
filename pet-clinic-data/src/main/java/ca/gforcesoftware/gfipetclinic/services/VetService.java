package ca.gforcesoftware.gfipetclinic.services;

import ca.gforcesoftware.gfipetclinic.model.Owner;
import ca.gforcesoftware.gfipetclinic.model.Vet;

import java.util.Set;

/**
 * @author gavinhashemi on 2023-09-25
 */
public interface VetService {

    Vet findById(long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
