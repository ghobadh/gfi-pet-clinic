package ca.gforcesoftware.gfipetclinic.gfipetclinic.model;

import java.io.Serializable;

/**
 * @author gavinhashemi on 2023-09-25
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
