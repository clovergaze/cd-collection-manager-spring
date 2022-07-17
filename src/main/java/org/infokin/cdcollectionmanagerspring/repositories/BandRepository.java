package org.infokin.cdcollectionmanagerspring.repositories;

import org.infokin.cdcollectionmanagerspring.models.Band;
import org.springframework.data.repository.CrudRepository;

public interface BandRepository extends CrudRepository<Band, Long> {
}
