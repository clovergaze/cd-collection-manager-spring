package org.infokin.cdcollectionmanagerspring.models.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public class BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  public Long getId() {
    return id;
  }

  @Override
  public boolean equals(Object other) {
    return other != null && getClass() == other.getClass() && Objects.equals(id, ((BaseEntity) other).id);
  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

  @Override
  public String toString() {
    return String.format("%s [id=%d]", getClass().getSimpleName(), getId());
  }

}
