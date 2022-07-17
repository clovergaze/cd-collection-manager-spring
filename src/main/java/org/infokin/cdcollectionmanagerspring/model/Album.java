package org.infokin.cdcollectionmanagerspring.model;

import org.infokin.cdcollectionmanagerspring.model.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Albums")
public class Album extends BaseEntity {

  private String name;

  @ManyToOne
  private Band band;

  public Album() {
  }

  public Album(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Band getBand() {
    return band;
  }

  public void setBand(Band band) {
    this.band = band;
  }

}
