package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Joel Gayle on 20 Jan, 2020
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet pet);

    Set<Vet> findAll();
}
