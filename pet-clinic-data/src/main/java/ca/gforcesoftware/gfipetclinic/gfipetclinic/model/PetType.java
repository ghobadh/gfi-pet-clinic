package ca.gforcesoftware.gfipetclinic.gfipetclinic.model;

/**
 * @author gavinhashemi on 2023-09-20
 */
public class PetType extends BaseEntity {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
