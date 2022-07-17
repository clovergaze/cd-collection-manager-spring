package org.infokin.cdcollectionmanagerspring.repositories;

import org.infokin.cdcollectionmanagerspring.models.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
}
