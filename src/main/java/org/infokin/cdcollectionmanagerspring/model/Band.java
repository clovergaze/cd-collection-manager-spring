package org.infokin.cdcollectionmanagerspring.model;

import org.infokin.cdcollectionmanagerspring.model.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "Bands")
public class Band extends BaseEntity {

  private String name;

  @OneToMany(mappedBy = "band")
  private Set<Album> albums;

  public Band() {
  }

  public Band(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Album> getAlbums() {
    return albums;
  }

  public void setAlbums(Set<Album> albums) {
    this.albums = albums;
  }

}
