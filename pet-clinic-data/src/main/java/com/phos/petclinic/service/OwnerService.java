package com.phos.petclinic.service;

import com.phos.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String name);

}
