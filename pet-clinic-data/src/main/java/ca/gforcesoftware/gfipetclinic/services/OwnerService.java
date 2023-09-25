package ca.gforcesoftware.gfipetclinic.services;

import ca.gforcesoftware.gfipetclinic.model.Owner;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.Set;

/**
 * @author gavinhashemi on 2023-09-25
 */
public interface OwnerService {
    Owner findById(long id);
    Owner save(Owner owner);
    Owner findByLastName (String lastName);
    Set<Owner> findAll();

}
