package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by Joel Gayle on 20 Jan, 2020
 */
public interface OwnerService extends  CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
