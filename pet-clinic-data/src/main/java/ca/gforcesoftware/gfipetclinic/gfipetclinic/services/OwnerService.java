package ca.gforcesoftware.gfipetclinic.gfipetclinic.services;

import ca.gforcesoftware.gfipetclinic.gfipetclinic.model.Owner;

/**
 * @author gavinhashemi on 2023-09-25
 */
public interface OwnerService  extends  CrudService <Owner,Long>{
    Owner findByLastName (String lastName);


}
